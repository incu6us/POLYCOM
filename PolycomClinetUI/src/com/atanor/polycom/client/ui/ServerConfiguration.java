package com.atanor.polycom.client.ui;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ServerConfiguration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2380188730531995456L;
	private JPanel contentPane;
	private JTextField fieldServer;
	private JTextField fieldPort;
	private JTextField fieldPath;
	private Properties fileProps = new Properties();
	private String propFileName = "polycom-client.conf";
	private File file = new File(propFileName);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerConfiguration frame = new ServerConfiguration();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ServerConfiguration() {
		setTitle("Server Configuration");
		setResizable(false);
		setAlwaysOnTop(true);
		setBounds(100, 100, 222, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblServer = new JLabel("Server:");
		GridBagConstraints gbc_lblServer = new GridBagConstraints();
		gbc_lblServer.anchor = GridBagConstraints.WEST;
		gbc_lblServer.insets = new Insets(0, 0, 5, 5);
		gbc_lblServer.gridx = 0;
		gbc_lblServer.gridy = 1;
		contentPane.add(lblServer, gbc_lblServer);

		fieldServer = new JTextField();
		try {
			if (!getServerProperties().get("server").isEmpty()) {
				fieldServer.setText(getServerProperties().get("server"));
			} else {
				fieldServer.setText("0.0.0.0");
			}
		} catch (Exception e) {
			fieldServer.setText("0.0.0.0");
		}
		GridBagConstraints gbc_fieldServer = new GridBagConstraints();
		gbc_fieldServer.insets = new Insets(0, 0, 5, 5);
		gbc_fieldServer.fill = GridBagConstraints.HORIZONTAL;
		gbc_fieldServer.gridx = 1;
		gbc_fieldServer.gridy = 1;
		contentPane.add(fieldServer, gbc_fieldServer);
		fieldServer.setColumns(10);

		JLabel lblPort = new JLabel("Port:");
		GridBagConstraints gbc_lblPort = new GridBagConstraints();
		gbc_lblPort.anchor = GridBagConstraints.WEST;
		gbc_lblPort.insets = new Insets(0, 0, 5, 5);
		gbc_lblPort.gridx = 0;
		gbc_lblPort.gridy = 2;
		contentPane.add(lblPort, gbc_lblPort);

		fieldPort = new JTextField();
		try {
			if (!getServerProperties().get("port").isEmpty()) {
				fieldPort.setText(getServerProperties().get("port"));
			} else {
				fieldPort.setText("8080");
			}
		} catch (Exception e) {
			fieldPort.setText("8080");
		}

		GridBagConstraints gbc_fieldPort = new GridBagConstraints();
		gbc_fieldPort.insets = new Insets(0, 0, 5, 5);
		gbc_fieldPort.fill = GridBagConstraints.HORIZONTAL;
		gbc_fieldPort.gridx = 1;
		gbc_fieldPort.gridy = 2;
		contentPane.add(fieldPort, gbc_fieldPort);
		fieldPort.setColumns(10);

		JLabel lblPathPrefix = new JLabel("Path prefix:");
		GridBagConstraints gbc_lblPathPrefix = new GridBagConstraints();
		gbc_lblPathPrefix.anchor = GridBagConstraints.EAST;
		gbc_lblPathPrefix.insets = new Insets(0, 0, 5, 5);
		gbc_lblPathPrefix.gridx = 0;
		gbc_lblPathPrefix.gridy = 3;
		contentPane.add(lblPathPrefix, gbc_lblPathPrefix);

		fieldPath = new JTextField();
		try {
			if (!getServerProperties().get("path").isEmpty()) {
				fieldPath.setText(getServerProperties().get("path"));
			} else {
				fieldPath.setText("/");
			}
		} catch (Exception e) {
			fieldPath.setText("/");
		}
		GridBagConstraints gbc_fieldPath = new GridBagConstraints();
		gbc_fieldPath.insets = new Insets(0, 0, 5, 5);
		gbc_fieldPath.fill = GridBagConstraints.HORIZONTAL;
		gbc_fieldPath.gridx = 1;
		gbc_fieldPath.gridy = 3;
		contentPane.add(fieldPath, gbc_fieldPath);
		fieldPath.setColumns(10);

		JLabel label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 4;
		contentPane.add(label_1, gbc_label_1);

		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 5;
		contentPane.add(label, gbc_label);

		JButton btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Map<String, String> prop = getServerProperties();

				try {
					Socket socket = new Socket(fieldServer.getText().trim(), Integer.parseInt(fieldPort.getText().trim()));
					socket.close();
					JOptionPane.showMessageDialog(null, "Test OK!");
				} catch (NumberFormatException | IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Test failed due to: " + e1);
				}
			}
		});
		GridBagConstraints gbc_btnTest = new GridBagConstraints();
		gbc_btnTest.insets = new Insets(0, 0, 0, 5);
		gbc_btnTest.gridx = 0;
		gbc_btnTest.gridy = 6;
		contentPane.add(btnTest, gbc_btnTest);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileOutputStream fos;
				file.delete();
				try {
					fos = new FileOutputStream(file);

					fileProps = new Properties();
					fileProps.setProperty("path", fieldPath.getText().trim());
					fileProps.setProperty("server", fieldServer.getText().trim());
					fileProps.setProperty("port", fieldPort.getText().trim());
					fileProps.store(fos, "Configuration for Polycom API");

					setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Problem with configuration saving!");
				}
			}
		});
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.anchor = GridBagConstraints.WEST;
		gbc_btnSave.insets = new Insets(0, 0, 0, 5);
		gbc_btnSave.gridx = 1;
		gbc_btnSave.gridy = 6;
		contentPane.add(btnSave, gbc_btnSave);
	}

	public Map<String, String> getServerProperties() {
		Map<String, String> result = new HashMap<>();
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(propFileName);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			// JOptionPane.showMessageDialog(null,
			// "No configuration found! Try save first...");
			e2.printStackTrace();
		}
		if (inputStream != null) {
			try {
				fileProps.load(inputStream);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				// JOptionPane.showMessageDialog(null,
				// "Can't read configuration file! Try to save it first...\nDetails: \n"
				// + e1);
			}
		}
		// else {
		// JOptionPane.showMessageDialog(null,
		// "Configuration file not found! Try to save first...");
		// }
		result.put("server", fileProps.getProperty("server"));
		result.put("port", fileProps.getProperty("port"));
		result.put("path", fileProps.getProperty("path"));

		return result;
	}
}

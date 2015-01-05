package com.atanor.polycom.client.ui;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

import com.atanor.polycom.client.net.REstEasyCall;

public class MainUI {

	private JFrame frame;
	private JTextField fieldAddrBookPattern;
	private JTextField fieldDialByName;
	private JTextField fieldDialByCustomNumber;
	private JTextPane textLog;
	private ServerConfiguration serverConfiguration = new ServerConfiguration();
	private REstEasyCall call;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 755, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 129, 106, 0 };
		gbl_panel.rowHeights = new int[] { 25, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JButton btnGetAllAddrBook = new JButton("getAllAddrBook");
		btnGetAllAddrBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String server = serverConfiguration.getServerProperties().get("server")+":"+serverConfiguration.getServerProperties().get("port");
				String prefix = serverConfiguration.getServerProperties().get("path");
				call = new REstEasyCall(server, prefix, "polycom-rest-server/rest/getAddress/all");
				addToLogPane(call.getResult());
			}
		});
		GridBagConstraints gbc_btnGetAllAddrBook = new GridBagConstraints();
		gbc_btnGetAllAddrBook.fill = GridBagConstraints.VERTICAL;
		gbc_btnGetAllAddrBook.anchor = GridBagConstraints.WEST;
		gbc_btnGetAllAddrBook.insets = new Insets(0, 0, 5, 5);
		gbc_btnGetAllAddrBook.gridx = 0;
		gbc_btnGetAllAddrBook.gridy = 0;
		panel.add(btnGetAllAddrBook, gbc_btnGetAllAddrBook);

		JButton btnGetAddrBookByPattern = new JButton("getAddrBookByPattern");
		btnGetAddrBookByPattern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String server = serverConfiguration.getServerProperties().get("server")+":"+serverConfiguration.getServerProperties().get("port");
				String prefix = serverConfiguration.getServerProperties().get("path");
				call = new REstEasyCall(server, prefix, "polycom-rest-server/rest/getAddress/"+fieldAddrBookPattern.getText().trim());
				addToLogPane(call.getResult());
			}
		});
		GridBagConstraints gbc_btnGetAddrBookByPattern = new GridBagConstraints();
		gbc_btnGetAddrBookByPattern.insets = new Insets(0, 0, 5, 5);
		gbc_btnGetAddrBookByPattern.anchor = GridBagConstraints.WEST;
		gbc_btnGetAddrBookByPattern.gridx = 0;
		gbc_btnGetAddrBookByPattern.gridy = 1;
		panel.add(btnGetAddrBookByPattern, gbc_btnGetAddrBookByPattern);

		fieldAddrBookPattern = new JTextField();
		GridBagConstraints gbc_fieldAddrBookPattern = new GridBagConstraints();
		gbc_fieldAddrBookPattern.insets = new Insets(0, 0, 5, 0);
		gbc_fieldAddrBookPattern.fill = GridBagConstraints.HORIZONTAL;
		gbc_fieldAddrBookPattern.gridx = 1;
		gbc_fieldAddrBookPattern.gridy = 1;
		panel.add(fieldAddrBookPattern, gbc_fieldAddrBookPattern);
		fieldAddrBookPattern.setColumns(16);

		JButton btnDialByDirName = new JButton("dialByDirName");
		btnDialByDirName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String server = serverConfiguration.getServerProperties().get("server")+":"+serverConfiguration.getServerProperties().get("port");
				String prefix = serverConfiguration.getServerProperties().get("path");
				call = new REstEasyCall(server, prefix, "polycom-rest-server/rest/dial/byDirectoryName/"+fieldDialByName.getText().trim());
				addToLogPane(call.getResult());
			}
		});
		GridBagConstraints gbc_btnDialByDirName = new GridBagConstraints();
		gbc_btnDialByDirName.anchor = GridBagConstraints.WEST;
		gbc_btnDialByDirName.insets = new Insets(0, 0, 5, 5);
		gbc_btnDialByDirName.gridx = 0;
		gbc_btnDialByDirName.gridy = 2;
		panel.add(btnDialByDirName, gbc_btnDialByDirName);

		fieldDialByName = new JTextField();
		GridBagConstraints gbc_fieldDialByName = new GridBagConstraints();
		gbc_fieldDialByName.insets = new Insets(0, 0, 5, 0);
		gbc_fieldDialByName.fill = GridBagConstraints.HORIZONTAL;
		gbc_fieldDialByName.gridx = 1;
		gbc_fieldDialByName.gridy = 2;
		panel.add(fieldDialByName, gbc_fieldDialByName);
		fieldDialByName.setColumns(10);

		JButton btnDialByCustomNumber = new JButton("dialByCustomNumber");
		btnDialByCustomNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String server = serverConfiguration.getServerProperties().get("server")+":"+serverConfiguration.getServerProperties().get("port");
				String prefix = serverConfiguration.getServerProperties().get("path");
				call = new REstEasyCall(server, prefix, "polycom-rest-server/rest/dial/byPhone/"+fieldDialByCustomNumber.getText().trim());
				addToLogPane(call.getResult());
			}
		});
		GridBagConstraints gbc_btnDialByCustomNumber = new GridBagConstraints();
		gbc_btnDialByCustomNumber.anchor = GridBagConstraints.WEST;
		gbc_btnDialByCustomNumber.insets = new Insets(0, 0, 0, 5);
		gbc_btnDialByCustomNumber.gridx = 0;
		gbc_btnDialByCustomNumber.gridy = 3;
		panel.add(btnDialByCustomNumber, gbc_btnDialByCustomNumber);

		fieldDialByCustomNumber = new JTextField();
		GridBagConstraints gbc_fieldDialByCustomNumber = new GridBagConstraints();
		gbc_fieldDialByCustomNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_fieldDialByCustomNumber.gridx = 1;
		gbc_fieldDialByCustomNumber.gridy = 3;
		panel.add(fieldDialByCustomNumber, gbc_fieldDialByCustomNumber);
		fieldDialByCustomNumber.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 0;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);

		textLog = new JTextPane();
		textLog.setEditable(false);
		scrollPane.setViewportView(textLog);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmServerConfiguration = new JMenuItem("Server Configuration");
		mntmServerConfiguration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				serverConfiguration.setVisible(true);
			}
		});
		mnFile.add(mntmServerConfiguration);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
	}

	public void addToLogPane(StringBuffer strings){
		StyledDocument doc = textLog.getStyledDocument();
		try {
			doc.insertString(doc.getLength(), strings.toString(), null);
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

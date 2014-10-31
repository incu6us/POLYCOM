package polycom.api.net;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.net.telnet.TelnetClient;

import polycom.api.Constants;

public class PolycomHDXClient {
	private TelnetClient telnet = new TelnetClient();
	private InputStream in;
	private PrintStream out;
	private String delimiterForFinishCommand = Constants.commandDelimiterForStartCmdToEndCmd;
	private String prompt = "->";

	public PolycomHDXClient(String server, String user, String password) {
		try {
			// Connect to the specified server
			telnet.connect(server, 23);

			// Get input and output stream references
			in = telnet.getInputStream();
			out = new PrintStream(telnet.getOutputStream());

			// Log the user on
			readUntil("login: ");
			write(user);
			readUntil("Password: ");
			write(password);

			// Advance to a prompt
			readUntil(prompt + " ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public PolycomHDXClient(String server) {
		try {
			// Connect to the specified server
			telnet.connect(server, 23);

			// Get input and output stream references
			in = telnet.getInputStream();
			out = new PrintStream(telnet.getOutputStream());

			// Advance to a prompt
			readUntil("Session type: telnet");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void su(String password) {
		try {
			write("su");
			readUntil("Password: ");
			write(password);
			prompt = "#";
			readUntil(prompt + " ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String readUntil(String pattern) {
		try {
			char lastChar = pattern.charAt(pattern.length() - 1);
			StringBuffer sb = new StringBuffer();
			boolean found = false;
			char ch = (char) in.read();
			while (true) {
				System.out.print(ch);
				sb.append(ch);
				if (ch == lastChar) {
					if (sb.toString().endsWith(pattern)) {
						return sb.toString().replaceAll(".*(DEBUG|WARNING|INFO|ERROR).*", "").replaceAll("(?m)^[ \t]*\r?\n", "").replaceAll("^cmd response is 0.*", "");
					}
				}
				ch = (char) in.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void write(String value) {
		try {
			out.println(value + "\r\n");
			out.flush();
			// System.out.println(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String sendCommand(String command) {
		try {
			if (command.contains(delimiterForFinishCommand)) {
				write(command.split(delimiterForFinishCommand)[0]);
				return readUntil(command.split(delimiterForFinishCommand)[1]).replace(command.split(delimiterForFinishCommand)[1], "\n").replaceAll("(?m)^[ \t]*\r?\n", "")
						.replace("-> ", "");
			} else {
				write(command);
				return readUntil(prompt).replace(prompt, "\n").replaceAll("(?m)^[ \t]*\r?\n", "").replace("-> ", "");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void disconnect() {
		try {
			write("exit");
			if (telnet.isConnected()) {
				telnet.disconnect();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

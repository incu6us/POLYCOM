package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the TCP ports on the system.
 * 
 * @author vpryimak
 *
 */
public class TcpPorts {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current TCP port setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "tcpports get" + delimiter + "tcpports get ";
	}

	/**
	 * Sets the TCP ports when followed by a value from the range {1024..49150}.
	 * To erase the current setting, omit the value.
	 * 
	 * @param port
	 *            [{1024..49150}]
	 * 
	 * @return
	 */
	public static String set(int port) {
		return "tcpports set " + port + delimiter + "tcpports set " + port + " ";
	}
}

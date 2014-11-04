package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the UDP ports on the system.
 * 
 * @author vpryimak
 *
 */
public class UdpPorts {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current UDP port setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "udpports get" + delimiter + "udpports get ";
	}

	/**
	 * Sets the UDP ports when followed by a value from the range {1024..49150}.
	 * To erase the current setting, omit the value.
	 * 
	 * @param port
	 *            [{1024..49150}]
	 * 
	 * @return
	 */
	public static String set(int port) {
		return "udpports set " + port + delimiter + "udpports set " + port;
	}
}

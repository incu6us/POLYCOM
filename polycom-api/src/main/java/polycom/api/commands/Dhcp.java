package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets DHCP options.
 * 
 * @author vpryimak
 *
 */
public class Dhcp {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the selected DHCP option.
	 * 
	 * @return
	 */
	public static String get() {
		return "dhcp get" + delimiter + "dhcp get ";
	}

	/**
	 * Disables DHCP.
	 * 
	 * @return
	 */
	public static String off() {
		return "dhcp off" + delimiter + "dhcp off ";
	}

	/**
	 * Enables DHCP client, setting the system to obtain an IP address from a
	 * server on your network.
	 * 
	 * @return
	 */
	public static String client() {
		return "dhcp client" + delimiter + "dhcp client ";
	}
}

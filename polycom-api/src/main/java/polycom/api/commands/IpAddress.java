package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the LAN IP address (IPv4) of the system.
 * 
 * @author vpryimak
 *
 */
public class IpAddress {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ipaddress get" + delimiter + "ipaddress get ";
	}

	/**
	 * Sets the LAN IP address to the “xxx.xxx.xxx.xxx” parameter. This setting
	 * can only be changed when DHCP is off.
	 * 
	 * @param ipaddr
	 *            IP address of the system.
	 * 
	 * @return
	 */
	public static String set(String ipaddr) {
		return "ipaddress set " + ipaddr + delimiter + "ipaddress set " + ipaddr + " ";
	}
}

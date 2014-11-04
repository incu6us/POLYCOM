package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the WAN IP address.
 * 
 * @author vpryimak
 *
 */
public class WanIpAddress {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the WAN IP address.
	 * 
	 * @return
	 */
	public static String get() {
		return "wanipaddress get" + delimiter + "wanipaddress get ";
	}

	/**
	 * Sets the WAN IP address when followed by the “xxx.xxx.xxx.xxx” parameter.
	 * To erase the current setting, omit the “xxx.xxx.xxx.xxx” parameter.
	 * 
	 * @param ipAddress
	 *            WAN IP address.
	 * 
	 * @return
	 */
	public static String set(String ipAddress) {
		return "wanipaddress set " + ipAddress + delimiter + "wanipaddress set " + ipAddress + " ";
	}
}

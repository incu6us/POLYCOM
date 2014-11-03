package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the IPv6 link global address.
 * 
 * @author vpryimak
 *
 */
public class Ipv6GlobalAddress {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ipv6globaladdress get" + delimiter + "ipv6globaladdress get ";
	}

	/**
	 * Sets the IPv6 global address.
	 * 
	 * @param ipv6Address
	 *            The local IPv6 global address.
	 * 
	 * @return
	 */
	public static String set(String ipv6Address) {
		return "ipv6globaladdress set " + ipv6Address + delimiter + "ipv6globaladdress set " + ipv6Address + " ";
	}
}

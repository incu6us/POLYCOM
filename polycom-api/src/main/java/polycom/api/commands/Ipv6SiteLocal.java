package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the IPv6 site local address.
 * 
 * @author vpryimak
 *
 */
public class Ipv6SiteLocal {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ipv6sitelocal get" + delimiter + "ipv6sitelocal get ";
	}

	/**
	 * Sets the IPv6 site local address.
	 * 
	 * @param localAddress
	 *            The local IPv6 site local address.
	 * 
	 * @return
	 */
	public static String set(String localAddress) {
		return "ipv6sitelocal set " + localAddress + delimiter + "ipv6sitelocal set " + localAddress + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the IPv6 link local address.
 * 
 * @author vpryimak
 *
 */
public class Ipv6LinkLocal {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ipv6linklocal get" + delimiter + "ipv6linklocal get ";
	}

	/**
	 * Sets the IPv6 link local address.
	 * 
	 * @param localAddress
	 *            The local IPv6 link local address.
	 * 
	 * @return
	 */
	public static String set(String localAddress) {
		return "ipv6linklocal set " + localAddress + delimiter + "ipv6linklocal set " + localAddress + " ";
	}
}

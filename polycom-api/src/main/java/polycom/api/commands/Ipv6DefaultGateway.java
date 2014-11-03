package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the IPv6 default gateway.
 * 
 * @author vpryimak
 *
 */
public class Ipv6DefaultGateway {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ipv6defaultgateway get" + delimiter + "ipv6defaultgateway get ";
	}

	/**
	 * Sets the IPv6 default gateway.
	 * 
	 * @param gw
	 *            The local IPv6 default gateway.
	 * 
	 * @return
	 */
	public static String set(String gw) {
		return "ipv6defaultgateway set " + gw + delimiter + "ipv6defaultgateway set " + gw + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ability for the system to act as a client and receive an
 * address, specify an address manually, or completely disable IPv6.
 * 
 * @author vpryimak
 *
 */
public class Ipv6AddrMode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ipv6addrmode get" + delimiter + "ipv6addrmode get ";
	}

	/**
	 * IPv6 addresses from network elements.
	 * 
	 * @return
	 */
	public static String client() {
		return "ipv6addrmode client" + delimiter + "ipv6addrmode client ";
	}

	/**
	 * Allows full configuration of IPv6 addresses.
	 * 
	 * @return
	 */
	public static String manual() {
		return "ipv6addrmode manual" + delimiter + "ipv6addrmode manual ";
	}

	/**
	 * Disables IPv6 addressing.
	 * 
	 * @return
	 */
	public static String off() {
		return "ipv6addrmode off" + delimiter + "ipv6addrmode off ";
	}
}

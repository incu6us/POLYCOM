package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the NAT configuration.
 * 
 * @author vpryimak
 *
 */
public class NatConfig {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "natconfig get" + delimiter + "natconfig get ";
	}

	/**
	 * Specifies that the system is behind a NAT; specifies that the system will
	 * automatically discover the public (WAN) address.
	 * 
	 * @return
	 */
	public static String auto() {
		return "natconfig auto" + delimiter + "natconfig auto ";
	}

	/**
	 * Specifies that the system is behind a NAT. Requires the WAN address to be
	 * assigned using the wanipaddress command on page 4-360.
	 * 
	 * @return
	 */
	public static String manual() {
		return "natconfig manual" + delimiter + "natconfig manual ";
	}

	/**
	 * Disables the option when the system is not behind a NAT.
	 * 
	 * @return
	 */
	public static String off() {
		return "natconfig off" + delimiter + "natconfig off ";
	}
}

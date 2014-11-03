package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the NAT is H.323 Compatible setting.
 * 
 * @author vpryimak
 *
 */
public class NatH323Compatible {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "nath323compatible get" + delimiter + "nath323compatible get ";
	}

	/**
	 * Specifies that NAT is capable of translating H.323 traffic.
	 * 
	 * @return
	 */
	public static String yes() {
		return "nath323compatible yes" + delimiter + "nath323compatible yes ";
	}

	/**
	 * Specifies that NAT is not capable of translating H.323 traffic.
	 * 
	 * @return
	 */
	public static String no() {
		return "nath323compatible no" + delimiter + "nath323compatible no ";
	}
}

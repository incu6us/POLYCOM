package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ability of the system to redirect messages, which may come
 * from a router as part of the IPv6 Neighbor Discovery protocol.
 * 
 * @author vpryimak
 *
 */
public class IgnoreRedirect {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current IPv6 ignore redirect setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ignoreredirect get" + delimiter + "ignoreredirect get ";
	}

	/**
	 * Enables the IPv6 ignore redirect setting.
	 * 
	 * @return
	 */
	public static String yes() {
		return "ignoreredirect yes" + delimiter + "ignoreredirect yes ";
	}

	/**
	 * Disables the IPv6 ignore redirect setting.
	 * 
	 * @return
	 */
	public static String no() {
		return "ignoreredirect no" + delimiter + "ignoreredirect no ";
	}
}

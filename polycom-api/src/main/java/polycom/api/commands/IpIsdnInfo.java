package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether the Home screen displays IP information, ISDN
 * information, both, or neither.
 * 
 * @author vpryimak
 *
 */
public class IpIsdnInfo {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ipisdninfo get" + delimiter + "ipisdninfo get ";
	}

	/**
	 * Displays IP and ISDN information on the Home screen.
	 * 
	 * @return
	 */
	public static String both() {
		return "ipisdninfo both" + delimiter + "ipisdninfo both ";
	}

	/**
	 * Displays only IP information on the Home screen
	 * 
	 * @return
	 */
	public static String ipOnly() {
		return "ipisdninfo ip-only" + delimiter + "ipisdninfo ip-only ";
	}

	/**
	 * Displays only ISDN information on the Home screen.
	 * 
	 * @return
	 */
	public static String isdnOnly() {
		return "ipisdninfo isdn-only" + delimiter + "ipisdninfo isdn-only ";
	}

	/**
	 * Does not display any IP or ISDN information on the Home screen.
	 * 
	 * @return
	 */
	public static String none() {
		return "ipisdninfo none" + delimiter + "ipisdninfo none ";
	}
}

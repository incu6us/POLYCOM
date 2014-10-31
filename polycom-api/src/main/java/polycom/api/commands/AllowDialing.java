package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ability to dial out from the system.
 * 
 * @author vpryimak
 *
 */
public class AllowDialing {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return allowdialing yes|no
	 */
	public static String get() {
		return "allowdialing get" + delimiter + "allowdialing get ";
	}

	/**
	 * Allows users to place calls.
	 * 
	 * @return allowdialing yes
	 */
	public static String yes() {
		return "allowdialing yes" + delimiter + "allowdialing yes ";
	}

	/**
	 * Disables dialing so that the system can only receive calls.
	 * 
	 * @return allowdialing no
	 */
	public static String no() {
		return "allowdialing no" + delimiter + "allowdialing no ";
	}
}

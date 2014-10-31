package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ability to place and receive mixed protocol multipoint calls
 * (IP and ISDN). It allows the administrator to disable this ability for
 * security reasons.
 * 
 * @author vpryimak
 *
 */
public class AllowMixedCalls {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return allowmixedcalls yes|no
	 */
	public static String get() {
		return "allowmixedcalls get" + delimiter + "allowmixedcalls get ";
	}

	/**
	 * Enables mixed IP and ISDN calls.
	 * 
	 * @return allowmixedcalls yes
	 */
	public static String yes() {
		return "allowmixedcalls yes" + delimiter + "allowmixedcalls yes ";
	}

	/**
	 * Disables mixed IP and ISDN calls.
	 * 
	 * @return allowmixedcalls no
	 */
	public static String no() {
		return "allowmixedcalls no" + delimiter + "allowmixedcalls no ";
	}
}

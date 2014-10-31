package polycom.api.commands;

import polycom.api.Constants;

/**
 * Adds or removes the User Settings icon on the System screen, which allows
 * users to access the User Settings screen.
 * 
 * @author vpryimak
 *
 */
public class AllowUserSetup {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return allowusersetup yes|no
	 */
	public static String get() {
		return "allowusersetup get" + delimiter + "allowusersetup get ";
	}

	/**
	 * Enables the User Settings icon.
	 * 
	 * @return allowusersetup yes
	 */
	public static String yes() {
		return "allowusersetup yes" + delimiter + "allowusersetup yes ";
	}

	/**
	 * Disables the User Settings icon.
	 * 
	 * @return allowusersetup no
	 */
	public static String no() {
		return "allowusersetup no" + delimiter + "allowusersetup no ";
	}
}

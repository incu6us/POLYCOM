package polycom.api.commands;

import polycom.api.Constants;

/**
 * Disables or enables navigation to specified user interface screens of the
 * system.
 * 
 * @author vpryimak
 *
 */
public class ScreenControl {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Enables navigation to the specified user interface screen(s).
	 * 
	 * All of the user interface screens.
	 * 
	 * @return
	 */
	public static String enableAll() {
		return "screencontrol enable all" + delimiter + "screencontrol enable all ";
	}

	/**
	 * Enables navigation to the specified user interface screen(s).
	 * 
	 * None of the user interface screens.
	 * 
	 * @return
	 */
	public static String enableNone() {
		return "screencontrol enable none" + delimiter + "screencontrol enable none ";
	}

	/**
	 * Enables navigation to the specified user interface screen(s).
	 * 
	 * @param screenName
	 *            Name of a specific user interface screen.
	 * 
	 * @return
	 */
	public static String enable(String screenName) {
		return "screencontrol enable " + screenName + delimiter + "screencontrol enable " + screenName + " ";
	}

	/**
	 * Disables navigation to the specified user interface screen(s).
	 * 
	 * All of the user interface screens.
	 * 
	 * @return
	 */
	public static String disableAll() {
		return "screencontrol disable all" + delimiter + "screencontrol disable all ";
	}

	/**
	 * Disables navigation to the specified user interface screen(s).
	 * 
	 * None of the user interface screens.
	 * 
	 * @return
	 */
	public static String disableNone() {
		return "screencontrol disable none" + delimiter + "screencontrol disable none ";
	}

	/**
	 * Disables navigation to the specified user interface screen(s).
	 * 
	 * @param screenName
	 *            Name of a specific user interface screen.
	 * 
	 * @return
	 */
	public static String disable(String screenName) {
		return "screencontrol disable " + screenName + delimiter + "screencontrol disable " + screenName + " ";
	}
}

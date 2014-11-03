package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether users are allowed to access a list of recent calls made
 * with the system by displaying the Recent Calls button on the Home screen.
 * 
 * @author vpryimak
 *
 */
public class HomeRecentCalls {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "homerecentcalls get" + delimiter + "homerecentcalls get ";
	}

	/**
	 * Displays the Recent Calls button on the Home screen.
	 * 
	 * @return
	 */
	public static String yes() {
		return "homerecentcalls yes" + delimiter + "homerecentcalls yes ";
	}

	/**
	 * Removes the Recent Calls button from the Home screen.
	 * 
	 * @return
	 */
	public static String no() {
		return "homerecentcalls no" + delimiter + "homerecentcalls no ";
	}
}

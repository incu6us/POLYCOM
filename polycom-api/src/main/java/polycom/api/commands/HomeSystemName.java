package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether to display the name of the system on the Home screen,
 * above the PIP window.
 * 
 * @author vpryimak
 *
 */
public class HomeSystemName {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "homesystemname get" + delimiter + "homesystemname get ";
	}

	/**
	 * Displays the system name on the Home screen.
	 * 
	 * @return
	 */
	public static String yes() {
		return "homesystemname yes" + delimiter + "homesystemname yes ";
	}

	/**
	 * Removes the system name from the Home screen.
	 * 
	 * @return
	 */
	public static String no() {
		return "homesystemname no" + delimiter + "homesystemname no ";
	}
}

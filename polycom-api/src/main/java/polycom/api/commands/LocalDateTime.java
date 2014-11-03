package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether to display the local date and time on the Home screen.
 * 
 * @author vpryimak
 *
 */
public class LocalDateTime {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "localdatetime get" + delimiter + "localdatetime get ";
	}

	/**
	 * Displays the local date and time on the Home screen.
	 * 
	 * @return
	 */
	public static String yes() {
		return "localdatetime yes" + delimiter + "localdatetime yes ";
	}

	/**
	 * Removes the local date and time from the Home screen.
	 * 
	 * @return
	 */
	public static String no() {
		return "localdatetime no" + delimiter + "localdatetime no ";
	}
}

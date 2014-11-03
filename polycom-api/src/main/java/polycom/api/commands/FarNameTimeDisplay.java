package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the length of time the far-site name is displayed on the system.
 * 
 * @author vpryimak
 *
 */
public class FarNameTimeDisplay {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Disables the far site name display.
	 * 
	 * @return
	 */
	public static String off() {
		return "farnametimedisplay off" + delimiter + "farnametimedisplay off ";
	}

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "farnametimedisplay get" + delimiter + "farnametimedisplay get ";
	}

	/**
	 * Displays the far site name for the duration of the call.
	 * 
	 * @return
	 */
	public static String on() {
		return "farnametimedisplay on" + delimiter + "farnametimedisplay on ";
	}

	/**
	 * Specifies the number of seconds to display the far site name at the
	 * beginning of a call.
	 * 
	 * @param sec
	 * @return
	 */
	public static String setSecondsToDisplay(int sec) {
		return "farnametimedisplay " + sec + delimiter + "farnametimedisplay " + sec + " ";
	}
}

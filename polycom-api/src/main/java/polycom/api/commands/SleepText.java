package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the text to be displayed with the logo for 15 seconds as the
 * system goes into sleep mode.
 * 
 * @author vpryimak
 *
 */
public class SleepText {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current text.
	 * 
	 * @return
	 */
	public static String get() {
		return "sleeptext get" + delimiter + "sleeptext get ";
	}

	/**
	 * Sets the text to be displayed on the screen saver when followed by the
	 * “text” parameter. To erase the current setting, omit “text”.
	 * 
	 * @param text
	 *            Screen saver text to be displayed when the system is in sleep
	 *            mode. Enclose the text in quotation marks if it includes
	 *            spaces.
	 * 
	 * @return
	 */
	public static String set(String text) {
		return "sleeptext set " + text + delimiter + "sleeptext set " + text + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the wait time value before the system goes to sleep and displays
 * the screen saver.
 * 
 * @author vpryimak
 *
 */
public class SleepTime {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "sleeptime get" + delimiter + "sleeptime get ";
	}

	/**
	 * Set sleep time.
	 * 
	 * @param sec
	 *            Sets the number of minutes from last user interaction to
	 *            entering sleep mode. The default value is 3. A value of 0
	 *            indicates that the system will never go to sleep.
	 * 
	 * @return
	 */
	public static String set(int sec) {
		return "sleeptime set " + sec + delimiter + "sleeptime set " + sec + " ";
	}
}

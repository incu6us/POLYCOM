package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Backlight Compensation mode.
 * 
 * @author vpryimak
 *
 */
public class BacklightCompensation {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "backlightcompensation get" + delimiter + "backlightcompensation get ";
	}

	/**
	 * Enables Backlight Compensation. The camera automatically adjusts for a
	 * bright background.
	 * 
	 * @return
	 */
	public static String yes() {
		return "backlightcompensation yes" + delimiter + "backlightcompensation yes ";
	}

	/**
	 * Disables the option.
	 * 
	 * @return
	 */
	public static String no() {
		return "backlightcompensation no" + delimiter + "backlightcompensation no ";
	}
}

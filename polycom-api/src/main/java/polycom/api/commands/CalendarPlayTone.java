package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enables or disables the reminder alert tone that plays with the meeting
 * reminder when the Polycom HDX system is registered with the calendaring
 * service.
 * 
 * @author vpryimak
 *
 */
public class CalendarPlayTone {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Gets the current setting for the alert tone.
	 * 
	 * @return
	 */
	public static String get() {
		return "calendarplaytone get" + delimiter + "calendarplaytone get ";
	}

	/**
	 * Enables the alert tone.
	 * 
	 * @return
	 */
	public static String yes() {
		return "calendarplaytone yes" + delimiter + "calendarplaytone yes ";
	}

	/**
	 * Disables the alert tone.
	 * 
	 * @return
	 */
	public static String no() {
		return "calendarplaytone no" + delimiter + "calendarplaytone no ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enables or disables the display of private meetings in the calendar when the
 * system is registered with the calendaring service.
 * 
 * @author vpryimak
 *
 */
public class CalendarShowPvtMeetings {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Gets the current setting for private meeting display.
	 * 
	 * @return
	 */
	public static String get() {
		return "calendarshowpvtmeetings get" + delimiter + "calendarshowpvtmeetings get ";
	}

	/**
	 * Enables the display of private meetings.
	 * 
	 * @return
	 */
	public static String yes() {
		return "calendarshowpvtmeetings yes" + delimiter + "calendarshowpvtmeetings yes ";
	}

	/**
	 * Blocks the display of private meetings.
	 * 
	 * @return
	 */
	public static String no() {
		return "calendarshowpvtmeetings no" + delimiter + "calendarshowpvtmeetings no ";
	}
}

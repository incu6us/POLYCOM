package polycom.api.commands;

import polycom.api.Constants;

/**
 * Gets and sets the reminder time for meetings in the calendar when the system
 * is registered with the calendaring service.
 * 
 * @author vpryimak
 *
 */
public class CalendarReminderTime {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Gets the current reminder time.
	 * 
	 * @return
	 */
	public static String get() {
		return "calendarremindertime get" + delimiter + "calendarremindertime get ";
	}

	/**
	 * 
	 * @param value
	 *            The number of minutes before a meeting starts that a meeting
	 *            reminder is given. Example: 1|5|10|15|30|none
	 * 
	 * @return
	 */
	public static String set(String value) {
		return "calendarremindertime " + value + delimiter + "calendarremindertime get " + value + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enables or disables the calendaring service.
 * 
 * @author vpryimak
 *
 */
public class CalendarRegisterWithServer {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current server registration status.
	 * 
	 * @return
	 */
	public static String get() {
		return "calendarregisterwithserver get" + delimiter + "calendarregisterwithserver get ";
	}

	/**
	 * Disables the calendaring service.
	 * 
	 * @return
	 */
	public static String no() {
		return "calendarregisterwithserver no" + delimiter + "calendarregisterwithserver no ";
	}

	/**
	 * Enables the calendaring service.
	 * 
	 * @return
	 */
	public static String yes() {
		return "calendarregisterwithserver yes" + delimiter + "calendarregisterwithserver yes ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns the status of the Microsoft Exchange server connection.
 * 
 * @author vpryimak
 *
 */
public class CalendarStatus {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the Microsoft Exchange server connection status.
	 * 
	 * @return
	 */
	public static String get() {
		return "calendarstatus get" + delimiter + "calendarstatus get ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the password used by the calendaring service to log in to the Microsoft
 * Exchange server.
 * 
 * @author vpryimak
 *
 */
public class CalendarPassword {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * 
	 * @param password
	 *            The password used by the calendaring service to log in to the
	 *            Microsoft Exchange server.
	 * 
	 * @return
	 */
	public static String set(String password) {
		return "calendarpassword set " + password + delimiter + "calendarpassword set ";
	}
}

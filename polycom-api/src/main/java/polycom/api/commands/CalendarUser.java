package polycom.api.commands;

import polycom.api.Constants;

/**
 * Gets or sets the user name the calendaring service uses to log in to the
 * Microsoft Exchange server.
 * 
 * @author vpryimak
 *
 */
public class CalendarUser {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the user name being used by the calendaring service.
	 * 
	 * @return
	 */
	public static String get() {
		return "calendaruser get" + delimiter + "calendaruser get ";
	}

	/**
	 * 
	 * @param username
	 *            The user name the calendaring service uses to log in to the
	 *            Microsoft Exchange server.
	 * 
	 * @return
	 */
	public static String setUserName(String username) {
		return "calendaruser " + username + delimiter + "calendaruser " + username + " ";
	}
}

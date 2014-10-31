package polycom.api.commands;

import polycom.api.Constants;

/**
 * Gets or sets the Microsoft Exchange server used by the calendaring service.
 * 
 * @author vpryimak
 *
 */
public class CalendarServer {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Gets the current Microsoft Exchange server used by the calendaring
	 * service.
	 * 
	 * @return
	 */
	public static String get() {
		return "calendarserver get" + delimiter + "calendarserver get ";
	}

	/**
	 * Set server
	 * 
	 * @param server
	 *            The IP address or DNS name of the Microsoft Exchange server to
	 *            be used by the calendaring service.
	 * 
	 * @return
	 */
	public static String setServer(String server) {
		return "calendarserver " + server + delimiter + "calendarserver " + server + " ";
	}
}

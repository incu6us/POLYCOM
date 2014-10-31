package polycom.api.commands;

import polycom.api.Constants;

/**
 * Gets and sets the mailbox account being monitored for calendar events. The
 * mailbox account is called a resource.
 * 
 * @author vpryimak
 *
 */
public class CalendarResource {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the resource being monitored for calendar events.
	 * 
	 * @return
	 */
	public static String get() {
		return "calendarresource get" + delimiter + "calendarresource get ";
	}

	/**
	 * Returns the resource being monitored for calendar events.
	 * 
	 * @param resource
	 *            The resource to monitor for calendaring events.
	 * 
	 * @return
	 */
	public static String get(String resource) {
		return "calendarresource " + resource + delimiter + "calendarresource " + resource + " ";
	}
}

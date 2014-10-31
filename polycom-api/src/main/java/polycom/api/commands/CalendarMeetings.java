package polycom.api.commands;

import polycom.api.Constants;

/**
 * Retrieves scheduled meetings within the given time span or with the given
 * meeting ID.
 * 
 * @author vpryimak
 *
 */
public class CalendarMeetings {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the meeting id or ids for meetings that start at or after the
	 * specified start time and end time.
	 * 
	 * @param startTime
	 *            The start time of meetings to be retrieved. The start time can
	 *            be entered in one of the following formats: • YYYY-MM-DD:HH:MM
	 *            • today:HH:MM • today • tomorrow:HH:MM • tomorrow The times
	 *            are interpreted to be local times in the time zone the system
	 *            was configured for.
	 * 
	 * @return
	 */
	public static String list(String startTime) {
		return "calendarmeetings list " + startTime + delimiter + "calendarmeetings list " + startTime + " ";
	}

	/**
	 * Returns the meeting id or ids for meetings that start at or after the
	 * specified start time and end time.
	 * 
	 * @param startTime
	 *            The start time of meetings to be retrieved. The start time can
	 *            be entered in one of the following formats: • YYYY-MM-DD:HH:MM
	 *            • today:HH:MM • today • tomorrow:HH:MM • tomorrow The times
	 *            are interpreted to be local times in the time zone the system
	 *            was configured for.
	 * 
	 * @param endTime
	 *            The end time of meetings to be retrieved. This parameter can
	 *            be given in the following format. • YYYY-MM-DD:HH:MM •
	 *            today:HH:MM • today • tomorrow:HH:MM • tomorrow The times are
	 *            interpreted to be local times in the time zone the system was
	 *            configured for.
	 * 
	 * @return
	 */
	public static String list(String startTime, String endTime) {
		return "calendarmeetings list " + startTime + " " + endTime + delimiter + "calendarmeetings list " + startTime + " " + endTime + " ";
	}

	/**
	 * Retrieves meeting details for scheduled meetings when the Polycom HDX
	 * system is registered with the calendaring service. Returns information
	 * such as the location, subject and organizer of the meeting.
	 * 
	 * @return
	 */
	public static String info() {
		return "calendarmeetings info" + delimiter + "calendarmeetings info ";
	}

	/**
	 * Retrieves meeting details for scheduled meetings when the Polycom HDX
	 * system is registered with the calendaring service. Returns information
	 * such as the location, subject and organizer of the meeting.
	 * 
	 * @param meetingId
	 *            The ID of the meeting for which you want to find details.
	 * 
	 * @return
	 */
	public static String info(String meetingId) {
		return "calendarmeetings info " + meetingId + delimiter + "calendarmeetings info " + meetingId + " ";
	}

}

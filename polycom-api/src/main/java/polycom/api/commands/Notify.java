package polycom.api.commands;

import polycom.api.Constants;

/**
 * Lists the notification types that are currently being received, or registers
 * to receive status notifications.
 * 
 * 
 * @author vpryimak
 *
 */
public class Notify {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Stops the system from receiving changes in call status, such as a
	 * connection or disconnection.
	 * 
	 * @return
	 */
	public static String callstatus() {
		return "notify callstatus" + delimiter + "notify callstatus ";
	}

	/**
	 * Stops the system from capturing closed captions as they appear on the
	 * screen.
	 * 
	 * @return
	 */
	public static String captions() {
		return "notify captions" + delimiter + "notify captions ";
	}

	/**
	 * Stops the system from receiving line status notifications.
	 * 
	 * @return
	 */
	public static String linestatus() {
		return "notify linestatus" + delimiter + "notify linestatus ";
	}

	/**
	 * Stops the system from receiving changes in audio mute status.
	 * 
	 * @return
	 */
	public static String mutestatus() {
		return "notify mutestatus" + delimiter + "notify mutestatus ";
	}

	/**
	 * Stops the system from receiving notification when a user interface screen
	 * is displayed.
	 * 
	 * @return
	 */
	public static String screenchanges() {
		return "notify screenchanges" + delimiter + "notify screenchanges ";
	}

	/**
	 * Stops the system from receiving system status notifications.
	 * 
	 * @return
	 */
	public static String sysstatus() {
		return "notify sysstatus" + delimiter + "notify sysstatus ";
	}

	/**
	 * Stops the system from receiving system alerts.
	 * 
	 * @return
	 */
	public static String sysalerts() {
		return "notify sysalerts" + delimiter + "notify sysalerts ";
	}

	/**
	 * Stops the system from receiving notification of camera source changes.
	 * 
	 * @return
	 */
	public static String vidsourcechanges() {
		return "notify vidsourcechanges" + delimiter + "notify vidsourcechanges ";
	}

	/**
	 * Stops the system from receiving meeting reminders.
	 * 
	 * @return
	 */
	public static String calendarmeetings() {
		return "notify calendarmeetings" + delimiter + "notify calendarmeetings ";
	}
}

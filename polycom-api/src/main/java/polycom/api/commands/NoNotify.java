package polycom.api.commands;

import polycom.api.Constants;

/**
 * Unregisters the API client to receive status notifications.
 * 
 * @author vpryimak
 *
 */
public class NoNotify {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Stops the system from receiving changes in call status, such as a
	 * connection or disconnection.
	 * 
	 * @return
	 */
	public static String callstatus() {
		return "nonotify callstatus" + delimiter + "nonotify callstatus ";
	}

	/**
	 * Stops the system from capturing closed captions as they appear on the
	 * screen.
	 * 
	 * @return
	 */
	public static String captions() {
		return "nonotify captions" + delimiter + "nonotify captions ";
	}

	/**
	 * Stops the system from receiving line status notifications.
	 * 
	 * @return
	 */
	public static String linestatus() {
		return "nonotify linestatus" + delimiter + "nonotify linestatus ";
	}

	/**
	 * Stops the system from receiving changes in audio mute status.
	 * 
	 * @return
	 */
	public static String mutestatus() {
		return "nonotify mutestatus" + delimiter + "nonotify mutestatus ";
	}

	/**
	 * Stops the system from receiving notification when a user interface screen
	 * is displayed.
	 * 
	 * @return
	 */
	public static String screenchanges() {
		return "nonotify screenchanges" + delimiter + "nonotify screenchanges ";
	}

	/**
	 * Stops the system from receiving system status notifications.
	 * 
	 * @return
	 */
	public static String sysstatus() {
		return "nonotify sysstatus" + delimiter + "nonotify sysstatus ";
	}

	/**
	 * Stops the system from receiving system alerts.
	 * 
	 * @return
	 */
	public static String sysalerts() {
		return "nonotify sysalerts" + delimiter + "nonotify sysalerts ";
	}

	/**
	 * Stops the system from receiving notification of camera source changes.
	 * 
	 * @return
	 */
	public static String vidsourcechanges() {
		return "nonotify vidsourcechanges" + delimiter + "nonotify vidsourcechanges ";
	}

	/**
	 * Stops the system from receiving meeting reminders.
	 * 
	 * @return
	 */
	public static String calendarmeetings() {
		return "nonotify calendarmeetings" + delimiter + "nonotify calendarmeetings ";
	}
}

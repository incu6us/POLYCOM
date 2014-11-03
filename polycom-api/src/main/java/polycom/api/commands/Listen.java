package polycom.api.commands;

import polycom.api.Constants;

/**
 * Registers the RS-232 session to listen for incoming video calls, phone calls,
 * or system sleep or awake state and, consequently, to give notification when
 * the registered state occurs.
 * 
 * @author vpryimak
 *
 */
public class Listen {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Instructs the session to listen for incoming video calls. When this event
	 * occurs, the message “listen video ringing” is received.
	 * 
	 * @return
	 */
	public static String video() {
		return "listen video" + delimiter + "listen video ";
	}

	/**
	 * Instructs the session to listen for incoming phone calls. When this event
	 * occurs, the message “listen phone ringing” is received.
	 * 
	 * @return
	 */
	public static String phone() {
		return "listen phone" + delimiter + "listen phone ";
	}

	/**
	 * Instructs the session to listen for when the system goes into sleep mode.
	 * When this event occurs, the message “listen going to sleep” is received.
	 * When the system wakes up, the message “listen waking up” is received.
	 * Deprecated. Polycom recommends using sleep register instead of this
	 * command.
	 * 
	 * @return
	 */
	public static String sleep() {
		return "listen sleep" + delimiter + "listen sleep ";
	}
}

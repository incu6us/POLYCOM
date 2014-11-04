package polycom.api.commands;

import polycom.api.Constants;

/**
 * This command is used within script files or control panel programs to wait
 * for a specific event before executing the next statement. It causes the API
 * session to wait until a call being placed either connects or fails, or until
 * system is ready to place a call (such as after a reboot waiting for the ISDN
 * lines to come up).
 * 
 * @author vpryimak
 *
 */
public class WaitFor {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Causes the API session to wait until a call being placed either connects
	 * or fails.
	 * 
	 * @return
	 */
	public static String callcomplete() {
		return "waitfor callcomplete" + delimiter + "waitfor callcomplete ";
	}

	/**
	 * Causes the system to return the message “system is ready” when the system
	 * is ready to make a call.
	 * 
	 * @return
	 */
	public static String systemready() {
		return "waitfor systemready" + delimiter + "waitfor systemready ";
	}
}

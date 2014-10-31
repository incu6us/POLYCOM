package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the call state notification for call state events.
 * 
 * @author vpryimak
 *
 */
public class CallState {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "callstate get" + delimiter + "callstate get ";
	}

	/**
	 * Registers the system to give notification of call activities.
	 * 
	 * @return
	 */
	public static String register() {
		return "callstate register" + delimiter + "callstate register ";
	}

	/**
	 * Disables the register mode.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "callstate unregister" + delimiter + "callstate unregister ";
	}
}

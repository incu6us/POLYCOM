package polycom.api.commands;

import polycom.api.Constants;

/**
 * Names or finds an active API session.
 * 
 * @author vpryimak
 *
 */
public class Session {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Names the current API session.
	 * 
	 * @param sessionName
	 *            Unique string that identifies the session.
	 * 
	 * @return
	 */
	public static String name(String sessionName) {
		return "session name " + sessionName + delimiter + "session name  " + sessionName + " ";
	}

	/**
	 * Finds an active API session for this system.
	 * 
	 * @param sessionName
	 *            Unique string that identifies the session.
	 * 
	 * @return
	 */
	public static String find(String sessionName) {
		return "session find " + sessionName + delimiter + "session find  " + sessionName + " ";
	}
}

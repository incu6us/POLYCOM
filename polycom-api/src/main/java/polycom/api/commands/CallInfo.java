package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns information about the current call. If you are in a multipoint call,
 * this command returns one line for each site in the call.
 * 
 * @author vpryimak
 *
 */
public class CallInfo {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns information about each connection in the call.
	 * 
	 * @return
	 */
	public static String all() {
		return "callinfo all" + delimiter + "callinfo all ";
	}

	/**
	 * Returns information about the connection with the specified call ID.
	 * 
	 * @param id
	 * @return
	 */
	public static String callId(String id) {
		return "callinfo callid" + id + delimiter + "callinfo callid " + id + " ";
	}
}

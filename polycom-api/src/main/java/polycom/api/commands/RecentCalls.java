package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns the list of recent calls.
 * 
 * @author vpryimak
 *
 */
public class RecentCalls {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String show() {
		return "recentcalls " + delimiter + "recentcalls ";
	}
}

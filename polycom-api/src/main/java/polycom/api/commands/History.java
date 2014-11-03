package polycom.api.commands;

import polycom.api.Constants;

/**
 * Lists the last commands used in the current session.
 * 
 * @author vpryimak
 *
 */
public class History {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String getHistory() {
		return "history" + delimiter + "history ";
	}
}

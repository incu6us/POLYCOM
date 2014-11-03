package polycom.api.commands;

import polycom.api.Constants;

/**
 * Ends the API command session.
 * 
 * @author vpryimak
 *
 */
public class Exit {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String exit() {
		return "exit" + delimiter + "exit ";
	}
}

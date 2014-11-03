package polycom.api.commands;

import polycom.api.Constants;

/**
 * Prints “string” back to the API client screen.
 * 
 * @author vpryimak
 *
 */
public class Echo {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * @param str
	 *            Text to be printed to the screen.
	 * 
	 * @return
	 */
	public static String print(String str) {
		return "echo " + str + delimiter + "echo " + str + " ";
	}
}

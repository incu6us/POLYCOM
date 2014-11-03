package polycom.api.commands;

import polycom.api.Constants;

/**
 * Pauses the command interpreter before executing the next command. Pauses are
 * useful when commands are retrieved from a script file.
 * 
 * @author vpryimak
 *
 */
public class Pause {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String setPause(String second) {
		return "pause " + second + delimiter + "pause " + second + " ";
	}
}

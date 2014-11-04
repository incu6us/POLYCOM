package polycom.api.commands;

import polycom.api.Constants;

/**
 * Wakes the system from sleep mode.
 * 
 * @author vpryimak
 *
 */
public class Wake {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String wake() {
		return "wake" + delimiter + "wake ";
	}
}

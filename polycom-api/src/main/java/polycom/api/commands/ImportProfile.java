package polycom.api.commands;

import polycom.api.Constants;

/**
 * Imports system and user profile information in a CSV format. The input is
 * submitted through the telnet or serial port.
 * 
 * @author vpryimak
 *
 */
public class ImportProfile {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String importProfile() {
		return "importprofile" + delimiter + "importprofile ";
	}
}

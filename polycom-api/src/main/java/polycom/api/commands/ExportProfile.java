package polycom.api.commands;

import polycom.api.Constants;

/**
 * Exports system and user profile information in a CSV format. The output is
 * available through a telnet or serial port connection.
 * 
 * @author vpryimak
 *
 */
public class ExportProfile {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String export() {
		return "exportprofile" + delimiter + "exportprofile ";
	}
}

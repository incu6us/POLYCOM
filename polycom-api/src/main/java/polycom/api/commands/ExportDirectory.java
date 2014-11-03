package polycom.api.commands;

import polycom.api.Constants;

/**
 * Exports a directory in XML format.
 * 
 * @author vpryimak
 *
 */
public class ExportDirectory {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String export() {
		return "exportdirectory" + delimiter + "exportdirectory ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Imports a directory in CSV or XML format
 * 
 * @author vpryimak
 *
 */
public class ImportDirectory {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String importDir() {
		return "importdirectory" + delimiter + "importdirectory ";
	}
}

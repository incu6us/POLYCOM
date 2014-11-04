package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns the current system’s version information.

 * @author vpryimak
 *
 */
public class Version {
	
	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String getVersion() {
		return "version" + delimiter + "version ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Completes the setup wizard and restarts the Polycom HDX system.

 * @author vpryimak
 *
 */
public class OobComplete {
	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String oobcomplete() {
		return "oobcomplete" + delimiter + "oobcomplete ";
	}
}

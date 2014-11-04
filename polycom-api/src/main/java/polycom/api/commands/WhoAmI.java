package polycom.api.commands;

import polycom.api.Constants;

/**
 * Displays the same initial banner information as when the RS-232/Telnet
 * session was started with the system.
 * 
 * @author vpryimak
 *
 */
public class WhoAmI {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String getInfo() {
		return "whoami" + delimiter + "whoami ";
	}
}

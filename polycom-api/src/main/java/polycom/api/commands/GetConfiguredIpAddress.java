package polycom.api.commands;

import polycom.api.Constants;

/**
 * Retrieves the currently configured IPv4 address from the system.
 * 
 * @author vpryimak
 *
 */
public class GetConfiguredIpAddress {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String get() {
		return "getconfiguredipaddress" + delimiter + "getconfiguredipaddress ";
	}
}

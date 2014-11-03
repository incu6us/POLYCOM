package polycom.api.commands;

import polycom.api.Constants;

/**
 * Lists all available speeds and values at once.
 * 
 * @author vpryimak
 *
 */
public class GatewaySetup {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String setup() {
		return "gatewaysetup" + delimiter + "gatewaysetup ";
	}
}

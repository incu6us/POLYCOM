package polycom.api.commands;

import polycom.api.Constants;

/**
 * Simultaneously unregisters all registered user feedback so that the API no
 * longer reports changes to the parameters.
 * 
 * @author vpryimak
 *
 */
public class AllUnregister {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String getAllUnregister() {
		return "all unregister" + delimiter + "all unregister ";
	}
}

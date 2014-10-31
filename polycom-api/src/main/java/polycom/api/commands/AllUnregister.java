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

	/**
	 * 
	 * @return callstate unregistered camera unregistered chaircontrol
	 *         unregistered linestate unregistered chaircontrol unregistered
	 *         mute unregistered pip unregistered popupinfo unregistered preset
	 *         unregistered screen unregistered vcbutton unregistered volume
	 *         unregistered sleep unregistered
	 */
	public static String getAllUnregister() {
		return "all unregister" + delimiter + "all unregister ";
	}
}

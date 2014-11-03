package polycom.api.commands;

import polycom.api.Constants;

/**
 * Outputs a list of system settings.

 * @author vpryimak
 *
 */
public class DisplayParams {
	
	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns call summary information.
	 * 
	 * @return
	 */
	public static String get() {
		return "displayparams" + delimiter + "displayparams ";
	}
}

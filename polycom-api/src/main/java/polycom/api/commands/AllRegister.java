package polycom.api.commands;

import polycom.api.Constants;

/**
 * Registers for most commonly-used user registration events.
 * 
 * @author vpryimak
 *
 */
public class AllRegister {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * 
	 * @return callstate registered camera registered chaircontrol registered
	 *         linestate registered mute registered pip registered popupinfo
	 *         registered preset registered screen registered vcbutton
	 *         registered volume registered sleep registered
	 */
	public static String getAllRegister() {
		return "all register" + delimiter + "all register ";
	}
}

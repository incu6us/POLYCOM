package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns the name of the current screen so that the control panel programmer
 * knows which screen the user interface is currently displaying.
 * 
 * @author vpryimak
 *
 */
public class GetScreen {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String getScreen() {
		return "get screen" + delimiter + "get screen ";
	}
}

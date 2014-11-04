package polycom.api.commands;

import polycom.api.Constants;

/**
 * Displays a message box in the user interface.
 * 
 * @author vpryimak
 *
 */
public class ShowPopup {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Message to display to users. Enclose the text in quotation marks if it
	 * contains a space.
	 * 
	 * @param textToDisplay
	 * @return
	 */
	public static String show(String textToDisplay) {
		return "showpopup " + textToDisplay + delimiter + "showpopup " + textToDisplay + " ";
	}
}

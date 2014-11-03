package polycom.api.commands;

import polycom.api.Constants;

/**
 * Flashes the analog phone line.
 * 
 * @author vpryimak
 *
 */
public class Phone {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Clears phone number from the text box.
	 * 
	 * @return
	 */
	public static String clear() {
		return "phone clear" + delimiter + "phone clear ";
	}

	/**
	 * Sends flash hook to a POTS connection.
	 * 
	 * @return
	 */
	public static String flash() {
		return "phone flash" + delimiter + "phone flash ";
	}
}

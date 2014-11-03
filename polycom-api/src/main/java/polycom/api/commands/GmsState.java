package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Global Management System state information.
 * 
 * @author vpryimak
 *
 */
public class GmsState {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current state information.
	 * 
	 * @return
	 */
	public static String get() {
		return "gmsstate get" + delimiter + "gmsstate get ";
	}

	/**
	 * Sets the Global Management System state information when followed by the
	 * “state” parameter. To erase the current setting, omit the “state”
	 * parameter.
	 * 
	 * @param state
	 *            Character string specifying the state information. Enclose the
	 *            string in quotation marks if it includes spaces. Example:
	 *            “West Virginia”
	 * 
	 * @return
	 */
	public static String set(String state) {
		return "gmsstate set "+state + delimiter + "gmsstate set "+state+" ";
	}
}

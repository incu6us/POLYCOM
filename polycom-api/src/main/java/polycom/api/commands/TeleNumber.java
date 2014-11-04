package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the system’s telephone number.
 * 
 * @author vpryimak
 *
 */
public class TeleNumber {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "telenumber get" + delimiter + "telenumber get ";
	}

	/**
	 * Sets the telephone number when followed by the “telephone number”
	 * parameter. To erase the current setting, omit the parameter.
	 * 
	 * @param telephoneNumber
	 *            System’s telephone number. Enclose the string in quotation
	 *            marks if it includes spaces. Example: “408 555 2323”
	 * 
	 * @return
	 */
	public static String set(String telephoneNumber) {
		return "telenumber set " + telephoneNumber + delimiter + "telenumber set " + telephoneNumber + " ";
	}
}

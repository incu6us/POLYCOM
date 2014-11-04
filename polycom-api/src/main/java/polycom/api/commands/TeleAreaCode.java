package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the system’s area code.
 * 
 * @author vpryimak
 *
 */
public class TeleAreaCode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "teleareacode get" + delimiter + "teleareacode get ";
	}

	/**
	 * Sets the system’s area code when followed by the “telephone_area_code”
	 * parameter. To erase the current setting, omit the “telephone_area_code”
	 * parameter.
	 * 
	 * @param telephoneAreaCode
	 *            System’s area code.
	 * 
	 * @return
	 */
	public static String set(String telephoneAreaCode) {
		return "teleareacode set " + telephoneAreaCode + delimiter + "teleareacode set " + telephoneAreaCode + " ";
	}
}

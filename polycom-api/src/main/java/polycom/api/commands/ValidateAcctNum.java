package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the validation for the Global Management System account number
 * that is used when dialing out.
 * 
 * @author vpryimak
 *
 */
public class ValidateAcctNum {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "validateacctnum get" + delimiter + "validateacctnum get ";
	}

	/**
	 * Enables the Global Management System account number validation option.
	 * 
	 * @return
	 */
	public static String yes() {
		return "validateacctnum yes" + delimiter + "validateacctnum yes ";
	}

	/**
	 * Disables the Global Management System account number validation option.
	 * 
	 * @return
	 */
	public static String no() {
		return "validateacctnum no" + delimiter + "validateacctnum no ";
	}
}

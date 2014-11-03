package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Global Management System contact number information.
 * 
 * @author vpryimak
 *
 */
public class GmsContactNumber {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current contact number.
	 * 
	 * @return
	 */
	public static String get() {
		return "gmscontactnumber get" + delimiter + "gmscontactnumber get ";
	}

	/**
	 * Sets the Global Management System contact number when followed by the
	 * “number” parameter. To erase the current setting, omit “number”.
	 * 
	 * @param number
	 *            Numeric string specifying the contact number. Enclose the
	 *            string in quotation marks if it includes spaces. Example: “408
	 *            555 2323”
	 * 
	 * @return
	 */
	public static String set(String number) {
		return "gmscontactnumber set " + number + delimiter + "gmscontactnumber set " + number + " ";
	}
}

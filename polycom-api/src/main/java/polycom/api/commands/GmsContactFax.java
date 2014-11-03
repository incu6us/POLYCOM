package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Global Management System contact fax information.
 * 
 * @author vpryimak
 *
 */
public class GmsContactFax {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current contact fax information.
	 * 
	 * @return
	 */
	public static String get() {
		return "gmscontactfax get" + delimiter + "gmscontactfax get ";
	}

	/**
	 * Sets the Global Management System contact fax information when followed
	 * by the “fax number” parameter. To erase the current setting, omit “fax
	 * number”.
	 * 
	 * @param faxNumber
	 *            Character string specifying the fax number. Enclose the string
	 *            in quotation marks if it includes spaces. Example: “408 555
	 *            2323”
	 * 
	 * @return
	 */
	public static String set(String faxNumber) {
		return "gmscontactfax set " + faxNumber + delimiter + "gmscontactfax set " + faxNumber + " ";
	}
}

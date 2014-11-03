package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Global Management System contact person information.
 * 
 * @author vpryimak
 *
 */
public class GmsContactPerson {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current contact person information.
	 * 
	 * @return
	 */
	public static String get() {
		return "gmscontactperson get" + delimiter + "gmscontactperson get ";
	}

	/**
	 * Sets the Global Management System contact person name when followed by
	 * the “person” parameter. To erase the current setting, omit “person”.
	 * 
	 * @param person
	 *            Character string specifying the contact person. Enclose the
	 *            string in quotation marks if it includes spaces. Example:
	 *            “Mary Polycom”
	 * 
	 * @return
	 */
	public static String set(String person) {
		return "gmscontactperson set " + person + delimiter + "gmscontactperson set " + person + " ";
	}
}

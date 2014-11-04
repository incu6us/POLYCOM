package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sends your phone number to Global Management System technical support if your
 * system is managed by the Global Management System.
 * 
 * @author vpryimak
 *
 */
public class TechSupport {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * 
	 * @param phoneNumber
	 *            Phone number at which the user of this system will be
	 *            contacted. To obtain rapid assistance, include the area code
	 *            with the phone number. Enclose the string in quotation marks
	 *            if it includes spaces. Example: “408 555 2323”
	 * 
	 * @return
	 */
	public static String set(String phoneNumber) {
		return "techsupport " + phoneNumber + delimiter + "techsupport " + phoneNumber + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Global Management System technical support phone number.
 * 
 * @author vpryimak
 *
 */
public class GmsTechSupport {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current tech support phone number information.
	 * 
	 * @return
	 */
	public static String get() {
		return "gmstechsupport get" + delimiter + "gmstechsupport get ";
	}

	/**
	 * Sets the technical support information when followed by the
	 * “tech_support_digits” parameter. To erase the current setting, omit
	 * “tech_support_digits”.
	 * 
	 * @param techSupportDigits
	 *            Numeric string specifying the tech support phone number.
	 *            Enclose the string in quotation marks if it includes spaces.
	 *            Example: “408 555 2323”
	 * 
	 * @return
	 */
	public static String set(String techSupportDigits) {
		return "gmstechsupport set " + techSupportDigits + delimiter + "gmstechsupport set " + techSupportDigits + " ";
	}
}

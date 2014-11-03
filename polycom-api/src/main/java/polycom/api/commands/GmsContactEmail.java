package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Global Management System contact email information.
 * 
 * @author vpryimak
 *
 */
public class GmsContactEmail {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current contact email address.
	 * 
	 * @return
	 */
	public static String get() {
		return "gmscontactemail get" + delimiter + "gmscontactemail get ";
	}

	/**
	 * Sets the Global Management system contact email address when followed by
	 * the “email” parameter. To erase the current setting, omit “email”.
	 * 
	 * @param email
	 *            Alphanumeric string specifying the email address.
	 * 
	 * @return
	 */
	public static String set(String email) {
		return "gmscontactemail set " + email + delimiter + "gmscontactemail set " + email + " ";
	}
}

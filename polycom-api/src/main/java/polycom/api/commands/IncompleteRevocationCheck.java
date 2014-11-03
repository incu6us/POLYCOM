package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ability to use or reject a certificate if revocation
 * checking is incomplete.
 * 
 * @author vpryimak
 *
 */
public class IncompleteRevocationCheck {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "incompleterevocationcheck get" + delimiter + "incompleterevocationcheck get ";
	}

	/**
	 * Allows the system to continue to use a certificate in some cases if
	 * revocation checking is incomplete.
	 * 
	 * @return
	 */
	public static String yes() {
		return "incompleterevocationcheck set yes" + delimiter + "incompleterevocationcheck set yes ";
	}

	/**
	 * Rejects a certificate with incomplete revocation checking.
	 * 
	 * @return
	 */
	public static String no() {
		return "incompleterevocationcheck set no" + delimiter + "incompleterevocationcheck set no ";
	}
}

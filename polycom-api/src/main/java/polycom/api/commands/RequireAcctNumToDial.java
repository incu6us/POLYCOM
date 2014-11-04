package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enables or disables the Require Account Number to Dial option. It is used to
 * log calls to a specific account so that they can be tracked and billed to the
 * appropriate departments.
 * 
 * @author vpryimak
 *
 */
public class RequireAcctNumToDial {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "requireacctnumtodial get" + delimiter + "requireacctnumtodial get ";
	}

	/**
	 * Enables the option.
	 * 
	 * @return
	 */
	public static String yes() {
		return "requireacctnumtodial yes" + delimiter + "requireacctnumtodial yes ";
	}

	/**
	 * Disables the option.
	 * 
	 * @return
	 */
	public static String no() {
		return "requireacctnumtodial no" + delimiter + "requireacctnumtodial no ";
	}
}

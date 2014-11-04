package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the account number when it is required for dialing out.
 * 
 * @author vpryimak
 *
 */
public class SetAccountNumber {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * 
	 * @param accountNumber
	 *            Number that is needed to validate the account before dialing
	 *            out. To erase the current setting, omit this parameter.
	 * 
	 * @return
	 */
	public static String set(String accountNumber) {
		return "setaccountnumber " + accountNumber + delimiter + "setaccountnumber " + accountNumber + " ";
	}
}

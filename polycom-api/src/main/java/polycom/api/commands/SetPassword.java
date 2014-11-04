package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the admin password for the Polycom HDX system local admin account.

 * @author vpryimak
 *
 */
public class SetPassword {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String set(String currentAccountPassword, String newAccountPassword) {
		return "setpassword admin room "+currentAccountPassword+" "+newAccountPassword + delimiter + "setpassword admin room "+currentAccountPassword+" "+newAccountPassword+" ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the password to gain access to the Global Directory Server.
 * 
 * @author vpryimak
 *
 */
public class GabPassword {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns all current entries.
	 * 
	 * @return
	 */
	public static String all() {
		return "gabpassword all" + delimiter + "gabpassword all ";
	}

	/**
	 * Sets the GDS password to “password”. To erase the current setting, omit
	 * “password”.
	 * 
	 * @param passwd
	 *            Password to access the GDS server. Valid characters are: a
	 *            through z (lower and uppercase), -, _, @, /, ;, ,, ., \, 0
	 *            through 9. Enclose the string in quotation marks if it
	 *            includes spaces.
	 * 
	 * @return
	 */
	public static String setPasswd(String passwd) {
		return "gabpassword set " + passwd + delimiter + "gabpassword set " + passwd + " ";
	}

	/**
	 * Sets the GDS password to “password”. To erase the current setting, omit
	 * “password”.
	 * 
	 * @param passwd
	 *            Password to access the GDS server. Valid characters are: a
	 *            through z (lower and uppercase), -, _, @, /, ;, ,, ., \, 0
	 *            through 9. Enclose the string in quotation marks if it
	 *            includes spaces.
	 * 
	 * @param server
	 *            References GDS server {1..5}.
	 * 
	 * @return
	 */
	public static String setPasswdByServer(String passwd, int server) {
		return "gabpassword " + server + " set " + passwd + delimiter + "gabpassword " + server + " set " + passwd + " ";
	}
}

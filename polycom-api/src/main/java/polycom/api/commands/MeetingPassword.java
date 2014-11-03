package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the meeting password.
 * 
 * @author vpryimak
 *
 */
public class MeetingPassword {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Sets the meeting password if followed by the password parameter. To erase
	 * the current setting, omit the password parameter.
	 * 
	 * @param passwd
	 *            User-defined password. Valid characters are: A through Z
	 *            (lower and uppercase), -, _, @, /, ;, ,, ., \, and 0 through
	 *            9. The length is limited to 33 characters. The password cannot
	 *            include spaces.
	 * 
	 * @return
	 */
	public static String setPasswd(String passwd) {
		return "meetingpassword set " + passwd + delimiter + "meetingpassword set " + passwd + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Use Room Password for Remote Access setting.
 * 
 * @author vpryimak
 *
 */
public class UseRoomPassword {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "useroompassword get" + delimiter + "useroompassword get ";
	}

	/**
	 * Configures the system to use a separate room password and remote access
	 * password.
	 * 
	 * @return
	 */
	public static String yes() {
		return "useroompassword yes" + delimiter + "useroompassword yes ";
	}

	/**
	 * Configures the system to use the same password for room and remote
	 * access.
	 * 
	 * @return
	 */
	public static String no() {
		return "useroompassword no" + delimiter + "useroompassword no ";
	}
}

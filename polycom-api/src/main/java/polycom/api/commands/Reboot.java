package polycom.api.commands;

import polycom.api.Constants;

/**
 * Restarts the system.
 * 
 * @author vpryimak
 *
 */
public class Reboot {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Reboots the system without prompting you.
	 * 
	 * @return
	 */
	public static String yes() {
		return "reboot y" + delimiter + "reboot y ";
	}

	/**
	 * Does not reboot the system.
	 * 
	 * @return
	 */
	public static String no() {
		return "reboot n" + delimiter + "reboot n ";
	}

	/**
	 * Reboots the system without prompting you.
	 * 
	 * @return
	 */
	public static String now() {
		return "reboot now" + delimiter + "reboot now ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the system’s IP address to be registered and displayed in the
 * global directory when the system is powered on.
 * 
 * @author vpryimak
 *
 */
public class RegisterThisSystem {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "registerthissystem get" + delimiter + "registerthissystem get ";
	}

	/**
	 * Enables this option (register this system).
	 * 
	 * @return
	 */
	public static String yes() {
		return "registerthissystem yes" + delimiter + "registerthissystem yes ";
	}

	/**
	 * Disables this option.
	 * 
	 * @return
	 */
	public static String no() {
		return "registerthissystem no" + delimiter + "registerthissystem no ";
	}
}

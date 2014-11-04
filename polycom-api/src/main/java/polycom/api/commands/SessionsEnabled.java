package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ability to monitor for and terminate inactive Polycom HDX
 * web sessions.
 * 
 * @author vpryimak
 *
 */
public class SessionsEnabled {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting for web sessions monitoring.
	 * 
	 * @return
	 */
	public static String get() {
		return "sessionsenabled get" + delimiter + "sessionsenabled get ";
	}

	/**
	 * Enables web session monitoring.
	 * 
	 * @return
	 */
	public static String yes() {
		return "sessionsenabled yes" + delimiter + "sessionsenabled yes ";
	}

	/**
	 * Disables web session monitoring.
	 * 
	 * @return
	 */
	public static String no() {
		return "sessionsenabled no" + delimiter + "sessionsenabled no ";
	}
}

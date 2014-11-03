package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the H.239 People+Content setting.
 * 
 * @author vpryimak
 *
 */
public class H239Enable {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "h239enable get" + delimiter + "h239enable get ";
	}

	/**
	 * Enables H.239 People+Content on the system.
	 * 
	 * @return
	 */
	public static String yes() {
		return "h239enable yes" + delimiter + "h239enable yes ";
	}

	/**
	 * Disables H.239 People+Content on the system.
	 * 
	 * @return
	 */
	public static String no() {
		return "h239enable no" + delimiter + "h239enable no ";
	}
}

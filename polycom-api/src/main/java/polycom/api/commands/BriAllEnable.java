package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the configuration of all ISDN BRI lines. This command is only
 * applicable if you have a BRI network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class BriAllEnable {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the status of all BRI lines—yes if enabled, no if disabled.
	 * 
	 * @return
	 */
	public static String get() {
		return "briallenable get" + delimiter + "briallenable get ";
	}

	/**
	 * Enables all BRI lines.
	 * 
	 * @return
	 */
	public static String yes() {
		return "briallenable yes" + delimiter + "briallenable yes ";
	}

	/**
	 * Disables all BRI lines.
	 * 
	 * @return
	 */
	public static String no() {
		return "briallenable no" + delimiter + "briallenable no ";
	}

}

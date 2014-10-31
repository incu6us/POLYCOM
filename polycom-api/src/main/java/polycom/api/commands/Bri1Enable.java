package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the configuration of the specified ISDN BRI line. This command
 * is only applicable if you have a BRI network interface connected to your
 * system.
 * 
 * @author vpryimak
 *
 */
public class Bri1Enable {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the status of the BRI line—yes if enabled, no if disabled.
	 * 
	 * @return
	 */
	public static String get() {
		return "bri1enable get"+delimiter+"bri1enable get ";
	}

	/**
	 * Enables the BRI line.
	 * 
	 * @return
	 */
	public static String yes() {
		return "bri1enable yes"+delimiter+"bri1enable yes ";
	}

	/**
	 * Disables the BRI line.
	 * 
	 * @return
	 */
	public static String no() {
		return "bri1enable no"+delimiter+"bri1enable no ";
	}
}

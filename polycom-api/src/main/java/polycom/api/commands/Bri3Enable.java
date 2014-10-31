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
public class Bri3Enable {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the status of the BRI line—yes if enabled, no if disabled.
	 * 
	 * @return
	 */
	public static String get() {
		return "bri3enable get"+delimiter+"bri3enable get ";
	}

	/**
	 * Enables the BRI line.
	 * 
	 * @return
	 */
	public static String yes() {
		return "bri3enable yes"+delimiter+"bri3enable yes ";
	}

	/**
	 * Disables the BRI line.
	 * 
	 * @return
	 */
	public static String no() {
		return "bri3enable no"+delimiter+"bri3enable no ";
	}
}

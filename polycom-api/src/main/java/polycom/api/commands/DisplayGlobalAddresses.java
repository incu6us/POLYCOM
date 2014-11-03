package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the display of global addresses in the global directory.
 * 
 * @author vpryimak
 *
 */
public class DisplayGlobalAddresses {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "displayglobaladdresses get" + delimiter + "displayglobaladdresses get ";
	}

	/**
	 * Enables the display of global addresses.
	 * 
	 * @return
	 */
	public static String yes() {
		return "displayglobaladdresses yes" + delimiter + "displayglobaladdresses yes ";
	}

	/**
	 * Disables the display of global addresses.
	 * 
	 * @return
	 */
	public static String no() {
		return "displayglobaladdresses no" + delimiter + "displayglobaladdresses no ";
	}
}

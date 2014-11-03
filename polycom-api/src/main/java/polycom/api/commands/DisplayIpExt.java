package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the display of the IP extension field. This extension is needed
 * when placing a call through a gateway.
 * 
 * @author vpryimak
 *
 */
public class DisplayIpExt {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "displayipext get" + delimiter + "displayipext get ";
	}

	/**
	 * Enables the display of the IP extension.
	 * 
	 * @return
	 */
	public static String yes() {
		return "displayipext yes" + delimiter + "displayipext yes ";
	}

	/**
	 * Enables the display of the IP extension.
	 * 
	 * @return
	 */
	public static String no() {
		return "displayipext no" + delimiter + "displayipext no ";
	}
}

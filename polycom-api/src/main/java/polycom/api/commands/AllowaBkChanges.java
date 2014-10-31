package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Allow Directory Changes setting.
 * 
 * @author vpryimak
 *
 */
public class AllowaBkChanges {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return allowabkchanges yes|no
	 */
	public static String get() {
		return "allowabkchanges get" + delimiter + "allowabkchanges get ";
	}

	/**
	 * Enables the Allow Directory Changes setting.
	 * 
	 * @return allowabkchanges yes
	 */
	public static String yes() {
		return "allowabkchanges yes" + delimiter + "allowabkchanges yes ";
	}

	/**
	 * Disables the Allow Directory Changes setting.
	 * 
	 * @return allowabkchanges no
	 */
	public static String no() {
		return "allowabkchanges no" + delimiter + "allowabkchanges no ";
	}
}

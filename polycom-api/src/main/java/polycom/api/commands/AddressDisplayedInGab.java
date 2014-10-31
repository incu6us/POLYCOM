package polycom.api.commands;

import polycom.api.Constants;

/**
 * Specifies whether to display the system address in the global directory
 * 
 * @author vpryimak
 *
 */
public class AddressDisplayedInGab {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting
	 * 
	 * @return
	 */
	public static String get() {
		return "addressdisplayedingab get" + delimiter + "addressdisplayedingab get ";
	}

	/**
	 * Specifies not to display the system address in the global directory
	 * 
	 * @return
	 */
	public static String private1() {
		return "addressdisplayedingab private" + delimiter + "addressdisplayedingab private ";
	}

	/**
	 * Displays the system address in the global directory
	 * 
	 * @return
	 */
	public static String public1() {
		return "addressdisplayedingab public" + delimiter + "addressdisplayedingab public ";
	}
}

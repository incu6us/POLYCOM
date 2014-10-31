package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the area code for all ISDN lines. This command is only
 * applicable if you have a network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class AreaCode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the area code information.
	 * 
	 * @return
	 */
	public static String get() {
		return "areacode get" + delimiter + "areacode get ";
	}

	/**
	 * Sets the ISDN area code when followed by the area code parameter. To
	 * erase the current setting, omit “areacode”.
	 * 
	 * @param areaCode
	 *            - Area code to use for all lines.
	 * 
	 * @return
	 */
	public static String set(String areaCode) {
		return "areacode set " + areaCode + delimiter + "areacode set " + areaCode + " ";
	}
}

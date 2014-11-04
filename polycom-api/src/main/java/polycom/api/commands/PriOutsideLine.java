package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the PRI number that is dialed for outside line access.
 * 
 * @author vpryimak
 *
 */
public class PriOutsideLine {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "prioutsideline get" + delimiter + "prioutsideline get ";
	}

	/**
	 * Sets the outside-line-access PRI number when followed by the parameter
	 * “outside_line”. To erase the current setting, omit the parameter.
	 * 
	 * @param outsideLine
	 *            Numeric string. This number is provided by your network
	 *            service provider.
	 * 
	 * @return
	 */
	public static String set(String outsideLine) {
		return "prioutsideline set " + outsideLine + delimiter + "prioutsideline set " + outsideLine + " ";
	}
}

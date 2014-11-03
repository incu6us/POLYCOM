package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the maximum number of minutes allowed for call length.
 * 
 * @author vpryimak
 *
 */
public class MaxTimeInCall {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "maxtimeincall get" + delimiter + "maxtimeincall get ";
	}

	/**
	 * Sets the maximum time for calls when followed by a parameter from
	 * {0..999}. To erase the current setting, omit the time parameter or set it
	 * to 0. The call will then stay up indefinitely.
	 * 
	 * @param callInMinutes
	 *            Maximum call time in minutes. Must be an integer in the range
	 *            {0..999}.
	 * 
	 * @return
	 */
	public static String set(int callInMinutes) {
		return "maxtimeincall set " + callInMinutes + delimiter + "maxtimeincall set " + callInMinutes;
	}
}

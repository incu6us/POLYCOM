package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether to generate a report of all calls made with the system.
 * 
 * @author vpryimak
 *
 */
public class CallDetailReport {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "calldetailreport get" + delimiter + "calldetailreport get ";
	}

	/**
	 * Turns on call detail reporting.
	 * 
	 * @return
	 */
	public static String yes() {
		return "calldetailreport yes" + delimiter + "calldetailreport yes ";
	}

	/**
	 * Turns off call detail reporting.
	 * 
	 * @return
	 */
	public static String no() {
		return "calldetailreport no" + delimiter + "calldetailreport no ";
	}
}

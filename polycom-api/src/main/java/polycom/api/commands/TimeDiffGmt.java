package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the time difference from where the system is installed and
 * Greenwich Mean Time (GMT). This allows the Global Management System to view
 * the local time of the managed system.
 * 
 * @author vpryimak
 *
 */
public class TimeDiffGmt {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "timediffgmt get" + delimiter + "timediffgmt get ";
	}

	/**
	 * Sets the time difference from GMT to this value. +00:00 is GMT time.
	 * 
	 * @param gmt
	 *            {-12:00..+12:00}
	 * 
	 * @return
	 */
	public static String set(String gmt) {
		return "timediffgmt set " + gmt + delimiter + "timediffgmt set " + gmt;
	}
}

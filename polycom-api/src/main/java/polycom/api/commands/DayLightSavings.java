package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the daylight savings time setting. When you enable this setting,
 * the system clock automatically changes for daylight saving time.
 * 
 * @author vpryimak
 *
 */
public class DayLightSavings {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "daylightsavings get" + delimiter + "daylightsavings get ";
	}

	/**
	 * Enables automatic adjustment for daylight savings time.
	 * 
	 * @return
	 */
	public static String yes() {
		return "daylightsavings yes" + delimiter + "daylightsavings yes ";
	}

	/**
	 * Disables automatic adjustment for daylight savings time.
	 * 
	 * @return
	 */
	public static String no() {
		return "daylightsavings no" + delimiter + "daylightsavings no ";
	}
}

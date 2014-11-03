package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether users are allowed to select the bandwidth for calls from
 * the Place a Call screen.
 * 
 * @author vpryimak
 *
 */
public class HomeCallQuality {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "homecallquality get" + delimiter + "homecallquality get ";
	}

	/**
	 * Displays the Call Quality menu on the home Place a Call screen.
	 * 
	 * @return
	 */
	public static String yes() {
		return "homecallquality yes" + delimiter + "homecallquality yes ";
	}

	/**
	 * Removes the Call Quality menu from the Place a Call screen.
	 * 
	 * @return
	 */
	public static String no() {
		return "homecallquality no" + delimiter + "homecallquality no ";
	}
}

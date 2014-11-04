package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the bandwidth split for people and content video.
 * 
 * @author vpryimak
 *
 */
public class VgaQualityPreference {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "vgaqualitypreference get" + delimiter + "vgaqualitypreference get ";
	}

	/**
	 * Sets the VGA quality preference to content video.
	 * 
	 * @return
	 */
	public static String content() {
		return "vgaqualitypreference content" + delimiter + "vgaqualitypreference content ";
	}

	/**
	 * Sets the VGA quality preference to people video.
	 * 
	 * @return
	 */
	public static String people() {
		return "vgaqualitypreference people" + delimiter + "vgaqualitypreference people ";
	}

	/**
	 * Sets the VGA quality preference to both people and content video.
	 * 
	 * @return
	 */
	public static String both() {
		return "vgaqualitypreference both" + delimiter + "vgaqualitypreference both ";
	}
}

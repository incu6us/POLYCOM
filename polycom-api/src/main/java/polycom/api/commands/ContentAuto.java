package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the automatic bandwidth adjustment for people and content in
 * point-to-point H.323 calls. Automatic adjustment maintains equal image
 * quality in the two streams.
 * 
 * @author vpryimak
 *
 */
public class ContentAuto {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "contentauto get" + delimiter + "contentauto get ";
	}

	/**
	 * Enables automatic bandwidth adjustment for people and content.
	 * 
	 * @return
	 */
	public static String on() {
		return "contentauto on" + delimiter + "contentauto on ";
	}

	/**
	 * Disables automatic bandwidth adjustment for people and content. The
	 * system Quality Preference settings is used instead.
	 * 
	 * @return
	 */
	public static String off() {
		return "contentauto off" + delimiter + "contentauto off ";
	}
}

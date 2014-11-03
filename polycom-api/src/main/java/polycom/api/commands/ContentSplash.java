package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enables or disables the splash screen display on content monitors.
 * 
 * @author vpryimak
 *
 */
public class ContentSplash {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "contentsplash get" + delimiter + "contentsplash get ";
	}

	/**
	 * Turns on the content splash screen.
	 * 
	 * @return
	 */
	public static String yes() {
		return "contentsplash yes" + delimiter + "contentsplash yes ";
	}

	/**
	 * Turns off the content splash screen.
	 * 
	 * @return
	 */
	public static String no() {
		return "contentsplash no" + delimiter + "contentsplash no ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the text to display in the dialing entry field on the Place a
 * Call screen.
 * 
 * @author vpryimak
 *
 */
public class MarqueeDisplayText {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current marquee display text.
	 * 
	 * @return
	 */
	public static String get() {
		return "marqueedisplaytext get" + delimiter + "marqueedisplaytext get ";
	}

	/**
	 * Sets the text to display in the dialing entry field followed by the text
	 * to use. Enclose the string in quotation marks if it includes spaces.
	 * 
	 * @param text
	 *            Text to display. Enclose the character string in quotation
	 *            marks if it includes spaces. If “text” is omitted, the system
	 *            automatically sets it to Welcome.
	 * 
	 * @return
	 */
	public static String set(String text) {
		return "marqueedisplaytext set " + text + delimiter + "marqueedisplaytext set " + text + " ";
	}
}

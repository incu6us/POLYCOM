package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the tone used for user alerts
 * 
 * @author vpryimak
 *
 */
public class AlertUserTone {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting
	 * 
	 * @return
	 */
	public static String getTone() {
		return "alertusertone get" + delimiter + "alertusertone get ";
	}

	/**
	 * Sets the user alert to the corresponding tone
	 * 
	 * @param tone - 1|2|3|4 
	 * @return
	 */
	public static String setTone(int tone) {
		return "alertusertone " + tone + delimiter + "alertusertone " + tone + " ";
	}
}

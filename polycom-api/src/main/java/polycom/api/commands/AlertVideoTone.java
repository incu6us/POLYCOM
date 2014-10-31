package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the tone used for incoming video calls
 * 
 * @author vpryimak
 *
 */
public class AlertVideoTone {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting
	 * 
	 * @return
	 */
	public static String getTone() {
		return "alertvideotone get" + delimiter + "alertvideotone get ";
	}

	/**
	 * Sets the incoming video alert to the corresponding tone
	 * 
	 * @param tone - 1|2|3|4|5|6|7|8|9|10 
	 * @return
	 */
	public static String setTone(int tone) {
		return "alertvideotone " + tone + delimiter + "alertvideotone " + tone + " ";
	}
}

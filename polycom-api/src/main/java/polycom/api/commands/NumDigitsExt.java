package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the number of digits in the Number+Extension Gateway number
 * (E.164 dialing).
 * 
 * @author vpryimak
 *
 */
public class NumDigitsExt {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "numdigitsext get" + delimiter + "numdigitsext get ";
	}

	/**
	 * The number of digits in the gateway number if gatewaynumbertype command
	 * on page 4-148 is set to number+extension.
	 * 
	 * 
	 * @param didNumbers
	 * @return
	 */
	public static String set(String digits) {
		return "numdigitsext " + digits + delimiter + "numdigitsext " + digits + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the st serial interface control signal (send timing: clock)
 * setting. This command is only applicable if you have a V.35 network interface
 * connected to your system.
 * 
 * @author vpryimak
 *
 */
public class St {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "st get" + delimiter + "st get ";
	}

	/**
	 * Sets the signal to normal (falling edge sends data).
	 * 
	 * @return
	 */
	public static String normal() {
		return "st normal" + delimiter + "st normal ";
	}

	/**
	 * Sets the signal to inverted (rising edge sends data).
	 * 
	 * @return
	 */
	public static String inverted() {
		return "st inverted" + delimiter + "st inverted ";
	}
}

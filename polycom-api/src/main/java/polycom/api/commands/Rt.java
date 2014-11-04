package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the RT serial interface control signal (receive timing: clock).
 * This command is only applicable if you have a V.35 network interface
 * connected to your system.
 * 
 * @author vpryimak
 *
 */
public class Rt {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "rt get" + delimiter + "rt get ";
	}

	/**
	 * Sets the signal to normal (rising edge receives data).
	 * 
	 * @return
	 */
	public static String normal() {
		return "rt normal" + delimiter + "rt normal ";
	}

	/**
	 * Sets the signal to inverted (falling edge receives data).
	 * 
	 * @return
	 */
	public static String inverted() {
		return "rt inverted" + delimiter + "rt inverted ";
	}
}

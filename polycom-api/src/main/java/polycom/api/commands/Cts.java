package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the CTS serial interface control signal (clear to send)
 * configuration. This command is only applicable if you have a V.35 network
 * interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class Cts {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "cts get" + delimiter + "cts get ";
	}

	/**
	 * Sets the signal to normal (high voltage is logic 1).
	 * 
	 * @return
	 */
	public static String normal() {
		return "cts normal" + delimiter + "cts normal ";
	}

	/**
	 * Sets the signal to inverted (low voltage is logic 1).
	 * 
	 * @return
	 */
	public static String inverted() {
		return "cts inverted" + delimiter + "cts inverted ";
	}

	/**
	 * Ignores the signal.
	 * 
	 * @return
	 */
	public static String ignore() {
		return "cts ignore" + delimiter + "cts ignore ";
	}
}

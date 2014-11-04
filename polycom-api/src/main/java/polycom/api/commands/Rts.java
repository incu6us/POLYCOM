package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the RTS serial interface control signal (request to send). This
 * command is only applicable if you have a V.35 network interface connected to
 * your system.
 * 
 * @author vpryimak
 *
 */
public class Rts {

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
	 * Sets the signal to normal (high voltage is logic 1).
	 * 
	 * @return
	 */
	public static String normal() {
		return "rt normal" + delimiter + "rt normal ";
	}

	/**
	 * Sets the signal to inverted (low voltage is logic 1).
	 * 
	 * @return
	 */
	public static String inverted() {
		return "rt inverted" + delimiter + "rt inverted ";
	}
}

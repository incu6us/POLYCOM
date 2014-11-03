package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the configuration of the DTR serial interface control signal
 * (data terminal ready). This command is only applicable if you have a V.35
 * network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class Dtr {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "dtr get" + delimiter + "dtr get ";
	}

	/**
	 * Sets the signal to normal (high voltage is logic 1).
	 * 
	 * @return
	 */
	public static String normal() {
		return "dtr normal" + delimiter + "dtr normal ";
	}

	/**
	 * Sets the signal to inverted (low voltage is logic 1).
	 * 
	 * @return
	 */
	public static String inverted() {
		return "dtr inverted" + delimiter + "dtr inverted ";
	}

	/**
	 * Sets constant high voltage. If this option is selected, inverted is not
	 * an option.
	 * 
	 * @return
	 */
	public static String on() {
		return "dtr on" + delimiter + "dtr on ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the configuration of the DSR serial interface control signal
 * (data set ready). This command is only applicable if you have a V.35 network
 * interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class Dsr {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "dsr get" + delimiter + "dsr get ";
	}

	/**
	 * Sets the signal to normal (high voltage is logic 1).
	 * 
	 * @return
	 */
	public static String normal() {
		return "dsr normal" + delimiter + "dsr normal ";
	}

	/**
	 * Sets the signal to inverted (low voltage is logic 1).
	 * 
	 * @return
	 */
	public static String inverted() {
		return "dsr inverted" + delimiter + "dsr inverted ";
	}
}

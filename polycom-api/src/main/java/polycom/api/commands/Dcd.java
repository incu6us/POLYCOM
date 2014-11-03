package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the configuration for the DCD serial interface control signal (data
 * carrier detect). This command is only applicable if you have a V.35 network
 * interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class Dcd {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Sets the signal to normal (high voltage is logic 1).
	 * 
	 * @return
	 */
	public static String normal() {
		return "dcd normal" + delimiter + "dcd normal ";
	}

	/**
	 * Sets the signal to inverted (low voltage is logic 1).
	 * 
	 * @return
	 */
	public static String inverted() {
		return "dcd inverted" + delimiter + "dcd inverted ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the configuration of the DSR serial interface control signal to
 * indicate an incoming call. This command is only applicable if you have a V.35
 * network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class DsrAnswer {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "dsranswer get" + delimiter + "dsranswer get ";
	}

	/**
	 * Turns on the option.
	 * 
	 * @return
	 */
	public static String on() {
		return "dsranswer on" + delimiter + "dsranswer on ";
	}

	/**
	 * Turns off the option.
	 * 
	 * @return
	 */
	public static String off() {
		return "dsranswer off" + delimiter + "dsranswer off ";
	}
}

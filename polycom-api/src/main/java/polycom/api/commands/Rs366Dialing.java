package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets RS-366 dialing. This command is only applicable if you have a
 * V.35 network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class Rs366Dialing {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "rs366dialing get" + delimiter + "rs366dialing get ";
	}

	/**
	 * Enables RS-366 dialing.
	 * 
	 * @return
	 */
	public static String on() {
		return "rs366dialing on" + delimiter + "rs366dialing on ";
	}

	/**
	 * Disables RS-366 dialing.
	 * 
	 * @return
	 */
	public static String off() {
		return "rs366dialing off" + delimiter + "rs366dialing off ";
	}
}

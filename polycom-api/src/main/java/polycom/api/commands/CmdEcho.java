package polycom.api.commands;

import polycom.api.Constants;

/**
 * Turns command echoing on or off.
 * 
 * @author vpryimak
 *
 */
public class CmdEcho {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Turns on command echoing so that everything you type is echoed on the
	 * screen.
	 * 
	 * @return
	 */
	public static String on() {
		return "cmdecho on" + delimiter + "cmdecho on ";
	}

	/**
	 * Turns off command echoing so that nothing you type is echoed on the
	 * screen.
	 * 
	 * @return
	 */
	public static String off() {
		return "cmdecho off" + delimiter + "cmdecho off ";
	}
}

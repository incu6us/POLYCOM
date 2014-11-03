package polycom.api.commands;

import polycom.api.Constants;

/**
 * Activates or deactivates the Near End Loop test.
 * 
 * @author vpryimak
 *
 */
public class NearLoop {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Activates the Near End Loop, a complete internal test of the system.
	 * 
	 * @return
	 */
	public static String on() {
		return "nearloop on" + delimiter + "nearloop on ";
	}

	/**
	 * Deactivates the Near End Loop.
	 * 
	 * @return
	 */
	public static String off() {
		return "nearloop off" + delimiter + "nearloop off ";
	}
}

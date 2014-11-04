package polycom.api.commands;

import polycom.api.Constants;

/**
 * Puts the system in sleep mode within 15 seconds and returns sleep.
 * 
 * @author vpryimak
 *
 */
public class Sleep {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Puts the system in sleep mode if not followed by other parameters.
	 * 
	 * @return
	 */
	public static String setSleep() {
		return "sleep" + delimiter + "sleep ";
	}

	/**
	 * Registers for sleep or wake events.
	 * 
	 * @return
	 */
	public static String regiter() {
		return "sleep regiter" + delimiter + "sleep regiter ";
	}

	/**
	 * Unregisters from sleep or wake events.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "sleep unregister" + delimiter + "sleep unregister ";
	}
}

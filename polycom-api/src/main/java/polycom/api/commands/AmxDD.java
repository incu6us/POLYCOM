package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the AMX Device Discovery beacon.
 * 
 * @author vpryimak
 *
 */
public class AmxDD {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return amxdd yes|no
	 */
	public static String get() {
		return "amxdd get" + delimiter + "amxdd get ";
	}

	/**
	 * Turns on the AMX Device Discovery beacon.
	 * 
	 * @return amxdd yes
	 */
	public static String on() {
		return "amxdd on" + delimiter + "amxdd on ";
	}

	/**
	 * Turns off the AMX Device Discovery beacon.
	 * 
	 * @return amxdd no
	 */
	public static String off() {
		return "amxdd off" + delimiter + "amxdd off ";
	}
}

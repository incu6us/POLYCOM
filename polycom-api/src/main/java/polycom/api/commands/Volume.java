package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the call audio volume (not sound effects) on the system or
 * registration for volume changes.
 * 
 * @author vpryimak
 *
 */
public class Volume {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Registers to receive notification when the volume changes.
	 * 
	 * @return
	 */
	public static String register() {
		return "volume register" + delimiter + "volume register ";
	}

	/**
	 * Disables register mode.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "volume unregister" + delimiter + "volume unregister ";
	}

	/**
	 * Returns the current volume level.
	 * 
	 * @return
	 */
	public static String get() {
		return "volume get" + delimiter + "volume get ";
	}

	/**
	 * Increases the audio volume by 1.
	 * 
	 * @return
	 */
	public static String up() {
		return "volume up" + delimiter + "volume up ";
	}

	/**
	 * Decreases the audio volume by 1.
	 * 
	 * @return
	 */
	public static String down() {
		return "volume down" + delimiter + "volume down ";
	}

	/**
	 * Sets the volume to a specified level. Requires a volume setting from
	 * {0..50}.
	 * 
	 * @param value
	 * @return
	 */
	public static String set(int value) {
		return "volume set " + value + delimiter + "volume set " + value + " ";
	}

	/**
	 * Returns the valid volume range available to the user.
	 * 
	 * @return
	 */
	public static String range() {
		return "volume range" + delimiter + "volume range ";
	}
}

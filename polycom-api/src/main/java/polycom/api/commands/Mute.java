package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the near or far site mute settings.
 * 
 * @author vpryimak
 *
 */
public class Mute {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Registers to receive notification when the mute mode changes.
	 * 
	 * @return
	 */
	public static String register() {
		return "mute register" + delimiter + "mute register ";
	}

	/**
	 * Disables register mode.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "mute unregister" + delimiter + "mute unregister ";
	}

	/**
	 * Sets the command for the near site. Requires on, off, toggle, or get.
	 * Returns the current setting for the near or far site.
	 * 
	 * @return
	 */
	public static String nearGet() {
		return "mute near get" + delimiter + "mute near get ";
	}

	/**
	 * Sets the command for the near site. Requires on, off, toggle, or get.
	 * Mutes the near site (mute near on).
	 * 
	 * @return
	 */
	public static String nearOn() {
		return "mute near on" + delimiter + "mute near on ";
	}

	/**
	 * Sets the command for the near site. Requires on, off, toggle, or get.
	 * Unmutes the near site (mute near off).
	 * 
	 * @return
	 */
	public static String nearOff() {
		return "mute near off" + delimiter + "mute near off ";
	}

	/**
	 * Sets the command for the near site. Requires on, off, toggle, or get. If
	 * mute near mode is mute near on, this switches to mute near off, and vice
	 * versa.
	 * 
	 * @return
	 */
	public static String nearToggle() {
		return "mute near toggle" + delimiter + "mute near toggle ";
	}

	/**
	 * Returns the mute state of the far site system. Requires the parameter
	 * get.
	 * 
	 * @return
	 */
	public static String farGet() {
		return "mute far get" + delimiter + "mute far get ";
	}
}

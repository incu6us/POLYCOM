package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the on-screen PIP mode. The PIP feature allows the near site to
 * adjust near-camera views while in a video conference.
 * 
 * @author vpryimak
 *
 */
public class Pip {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "pip get" + delimiter + "pip get ";
	}

	/**
	 * Enables PIP mode. The system shows a PIP window that remains in the lower
	 * right corner of the screen until the video call is completed.
	 * 
	 * @return
	 */
	public static String on() {
		return "pip on" + delimiter + "pip on ";
	}

	/**
	 * Disables PIP mode.
	 * 
	 * @return
	 */
	public static String off() {
		return "pip off" + delimiter + "pip off ";
	}

	/**
	 * Causes the PIP window to appear when the selected camera position is
	 * changed. The PIP window disappears when the camera has finished moving.
	 * 
	 * @return
	 */
	public static String camera() {
		return "pip camera" + delimiter + "pip camera ";
	}

	/**
	 * Toggles the content of the PIP and the main display between the near-site
	 * and far-site view.
	 * 
	 * @return
	 */
	public static String swap() {
		return "pip swap" + delimiter + "pip swap ";
	}

	/**
	 * Registers the system to give notification when PIP is turned on or off.
	 * 
	 * @return
	 */
	public static String register() {
		return "pip register" + delimiter + "pip register ";
	}

	/**
	 * Unregisters the system to give notification when PIP is turned on or off.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "pip unregister" + delimiter + "pip unregister ";
	}

	/**
	 * Places the PIP window in the specified corner of the screen:
	 * 
	 * get = Returns the current location
	 * 
	 * @return
	 */
	public static String location() {
		return "pip location get" + delimiter + "pip location get ";
	}

	/**
	 * Places the PIP window in the specified corner of the screen:
	 * 
	 * 0 = bottom right corner
	 * 
	 * 1 = top right corner
	 * 
	 * 2 = top left corner
	 * 
	 * 3 = bottom left corner
	 * 
	 * @param corner
	 * @return
	 */
	public static String location(String corner) {
		return "pip location " + corner + delimiter + "pip location " + corner;
	}

}

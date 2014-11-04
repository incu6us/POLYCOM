package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns the name of the current user interface screen on the system,
 * registers or unregisters for screen changes, or goes to a specific user
 * interface screen.
 * 
 * @author vpryimak
 *
 */
public class Screen {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the name of the current user interface screen if not followed by
	 * other parameters.
	 * 
	 * @return
	 */
	public static String show() {
		return "screen" + delimiter + "screen ";
	}

	/**
	 * Returns the registration state for screen change events when followed by
	 * the get parameter.
	 * 
	 * @return
	 */
	public static String registerGet() {
		return "screen register get" + delimiter + "screen register get ";
	}

	/**
	 * Registers for user interface screen changes. In register mode, the name
	 * of every screen accessed is listed.
	 * 
	 * @return
	 */
	public static String register() {
		return "screen register" + delimiter + "screen register ";
	}

	/**
	 * Unregisters from user interface screen changes.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "screen unregister" + delimiter + "screen unregister ";
	}

	/**
	 * @param screen
	 *            Changes the user interface to display the specified screen.
	 *            The supported screens depend on the system configuration. To
	 *            determine the name to use for a specific screen, navigate to
	 *            that screen in the user interface and send the screen command.
	 * 
	 * @return
	 */
	public static String set(String screen) {
		return "screen " + screen + delimiter + "screen " + screen + " ";
	}
}

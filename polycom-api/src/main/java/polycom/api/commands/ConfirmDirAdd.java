package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the configuration for prompting users to add directory entries
 * for the far sites when a call disconnects.
 * 
 * @author vpryimak
 *
 */
public class ConfirmDirAdd {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "confirmdiradd get" + delimiter + "confirmdiradd get ";
	}

	/**
	 * When a call disconnects, the user is prompted to create a local directory
	 * entry for the far site if it is not already in the directory.
	 * 
	 * @return
	 */
	public static String yes() {
		return "confirmdiradd yes" + delimiter + "confirmdiradd yes ";
	}

	/**
	 * The user is not prompted to create a local directory entry after a call
	 * disconnects.
	 * 
	 * @return
	 */
	public static String no() {
		return "confirmdiradd no" + delimiter + "confirmdiradd no ";
	}
}

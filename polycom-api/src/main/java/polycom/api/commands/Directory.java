package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether the Directory button appears on the Home screen.
 * 
 * @author vpryimak
 *
 */
public class Directory {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "directory get" + delimiter + "directory get ";
	}

	/**
	 * Displays the Directory button on the Home screen.
	 * 
	 * @return
	 */
	public static String yes() {
		return "directory yes" + delimiter + "directory yes ";
	}

	/**
	 * Removes the Directory button from the Home screen.
	 * 
	 * @return
	 */
	public static String no() {
		return "directory no" + delimiter + "directory no ";
	}
}

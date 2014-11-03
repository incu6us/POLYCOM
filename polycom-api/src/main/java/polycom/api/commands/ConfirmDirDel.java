package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the configuration for requiring users to confirm directory
 * deletions.
 * 
 * @author vpryimak
 *
 */
public class ConfirmDirDel {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "confirmdirdel get" + delimiter + "confirmdirdel get ";
	}

	/**
	 * When deleting an entry from the directory (address book), the user is
	 * prompted with “Are you sure you want to delete this entry?”
	 * 
	 * @return
	 */
	public static String yes() {
		return "confirmdirdel yes" + delimiter + "confirmdirdel yes ";
	}

	/**
	 * When deleting an entry from the directory (address book), the user is not
	 * prompted with a message.
	 * 
	 * @return
	 */
	public static String no() {
		return "confirmdirdel no" + delimiter + "confirmdirdel no ";
	}
}

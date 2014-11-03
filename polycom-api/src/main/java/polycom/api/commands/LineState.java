package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets API session registration to receive notifications about IP or
 * ISDN line state changes.
 * 
 * @author vpryimak
 *
 */
public class LineState {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "linestate get" + delimiter + "linestate get ";
	}

	/**
	 * Registers to receive notification when IP or ISDN line states change.
	 * 
	 * @return
	 */
	public static String register() {
		return "linestate register" + delimiter + "linestate register ";
	}

	/**
	 * Unregisters to receive notification when IP or ISDN line states change.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "linestate unregister" + delimiter + "linestate unregister ";
	}
}

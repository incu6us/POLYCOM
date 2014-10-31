package polycom.api.commands;

import polycom.api.Constants;

/**
 * Specifies whether to send content automatically when a computer is connected
 * to the system.
 * 
 * @author vpryimak
 *
 */
public class AutoShowContent {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "autoshowcontent get" + delimiter + "autoshowcontent get ";
	}

	/**
	 * Sets the system to send content automatically when a computer is
	 * connected to the system.
	 * 
	 * @return
	 */
	public static String on() {
		return "autoshowcontent on" + delimiter + "autoshowcontent on ";
	}

	/**
	 * Sets the system to not send content automatically.
	 * 
	 * @return
	 */
	public static String off() {
		return "autoshowcontent off" + delimiter + "autoshowcontent off ";
	}
}

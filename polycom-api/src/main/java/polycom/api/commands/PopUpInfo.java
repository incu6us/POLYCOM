package polycom.api.commands;

import polycom.api.Constants;

/**
 * Registers or unregisters the session to receive popup text and button choices
 * text.
 * 
 * @author vpryimak
 *
 */
public class PopUpInfo {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Registers to receive popup information.
	 * 
	 * @return
	 */
	public static String get() {
		return "popupinfo get" + delimiter + "popupinfo get ";
	}

	/**
	 * Unregisters to receive popup information.
	 * 
	 * @return
	 */
	public static String register() {
		return "popupinfo register" + delimiter + "popupinfo register ";
	}

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "popupinfo unregister" + delimiter + "popupinfo unregister ";
	}
}

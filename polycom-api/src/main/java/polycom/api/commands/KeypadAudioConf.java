package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the keypad audio confirmation. When this option is enabled, an
 * audio response is echoed when a numeric key is pressed on the remote control.
 * 
 * @author vpryimak
 *
 */
public class KeypadAudioConf {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "keypadaudioconf get" + delimiter + "keypadaudioconf get ";
	}

	/**
	 * Enables audio confirmation.
	 * 
	 * @return
	 */
	public static String yes() {
		return "keypadaudioconf yes" + delimiter + "keypadaudioconf yes ";
	}

	/**
	 * Disables audio confirmation.
	 * 
	 * @return
	 */
	public static String no() {
		return "keypadaudioconf no" + delimiter + "keypadaudioconf no ";
	}
}

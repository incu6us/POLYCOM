package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether to send either black video or "No Signal" to Monitor 1
 * when the screen saver activates.
 * 
 * @author vpryimak
 *
 */
public class Monitor1ScreenSaverOutput {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "monitor1screensaveroutput get" + delimiter + "monitor1screensaveroutput get ";
	}

	/**
	 * Sends black video to Monitor 1 when the system goes to sleep and the
	 * screen saver activates.
	 * 
	 * @return
	 */
	public static String black() {
		return "monitor1screensaveroutput black" + delimiter + "monitor1screensaveroutput black ";
	}

	/**
	 * Sends no signal to Monitor 1 when the system goes to sleep and the screen
	 * saver activates.
	 * 
	 * @return
	 */
	public static String noSignal() {
		return "monitor1screensaveroutput no_signal" + delimiter + "monitor1screensaveroutput no_signal ";
	}
}

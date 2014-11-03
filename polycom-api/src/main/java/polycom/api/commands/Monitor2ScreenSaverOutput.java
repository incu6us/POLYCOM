package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether to send either black video or "No Signal" to Monitor 2
 * when the screen saver activates.
 * 
 * @author vpryimak
 *
 */
public class Monitor2ScreenSaverOutput {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "monitor2screensaveroutput get" + delimiter + "monitor2screensaveroutput get ";
	}

	/**
	 * Sends black video to Monitor 2 when the system goes to sleep and the
	 * screen saver activates.
	 * 
	 * @return
	 */
	public static String black() {
		return "monitor2screensaveroutput black" + delimiter + "monitor2screensaveroutput black ";
	}

	/**
	 * Sends no signal to Monitor 1 when the system goes to sleep and the screen
	 * saver activates.
	 * 
	 * @return
	 */
	public static String noSignal() {
		return "monitor2screensaveroutput no_signal" + delimiter + "monitor2screensaveroutput no_signal ";
	}
}

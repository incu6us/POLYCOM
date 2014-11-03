package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the frame rate sent during H.331 calls. This command is only
 * applicable if you have a V.35 network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class H331FrameRate {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "h331framerate get" + delimiter + "h331framerate get ";
	}

	/**
	 * Sets the frame rate to this value for H.331 calls.
	 * 
	 * @param frameRate
	 * @return
	 */
	public static String set(double frameRate) {
		return "h331framerate " + frameRate + delimiter + "h331framerate " + frameRate + " ";
	}
}

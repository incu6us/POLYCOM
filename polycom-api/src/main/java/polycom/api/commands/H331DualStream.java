package polycom.api.commands;

import polycom.api.Constants;

/**
 * Set or gets the dual stream setting used for H.331 calls. This command is
 * only applicable if you have a V.35 network interface connected to your
 * system.
 * 
 * @author vpryimak
 *
 */
public class H331DualStream {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "h331dualstream get" + delimiter + "h331dualstream get ";
	}

	/**
	 * Turns on dual stream for H.331 calls.
	 * 
	 * @return
	 */
	public static String on() {
		return "h331dualstream on" + delimiter + "h331dualstream on ";
	}

	/**
	 * Turns off dual stream for H.331 calls.
	 * 
	 * @return
	 */
	public static String off() {
		return "h331dualstream off" + delimiter + "h331dualstream off ";
	}
}

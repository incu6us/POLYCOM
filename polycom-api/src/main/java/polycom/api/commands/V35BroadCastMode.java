package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the V.35 broadcast mode. This command is only applicable if you
 * have a V.35 network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class V35BroadCastMode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "v35broadcastmode get" + delimiter + "v35broadcastmode get ";
	}

	/**
	 * Turns on V.35 broadcast.
	 * 
	 * @return
	 */
	public static String on() {
		return "v35broadcastmode on" + delimiter + "v35broadcastmode on ";
	}

	/**
	 * Turns off V.35 broadcast.
	 * 
	 * @return
	 */
	public static String off() {
		return "v35broadcastmode off" + delimiter + "v35broadcastmode off ";
	}
}

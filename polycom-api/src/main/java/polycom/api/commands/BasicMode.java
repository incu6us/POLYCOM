package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Basic Mode configuration, a limited operating mode that uses
 * H.261 for video and G.711 for audio. Basic mode provides administrators with
 * a workaround for interoperability issues that cannot be solved using other
 * methods.
 * 
 * @author vpryimak
 *
 */
public class BasicMode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "basicmode get" + delimiter + "basicmode get ";
	}

	/**
	 * Enables basic mode.
	 * 
	 * @return
	 */
	public static String on() {
		return "basicmode on" + delimiter + "basicmode on ";
	}

	/**
	 * Disables basic mode.
	 * 
	 * @return
	 */
	public static String off() {
		return "basicmode off" + delimiter + "basicmode off ";
	}
}

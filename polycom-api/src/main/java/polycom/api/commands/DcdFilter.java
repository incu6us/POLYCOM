package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the filter setting of the DCD serial interface control signal
 * (data carrier detect). This command is only applicable if you have a V.35
 * network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class DcdFilter {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "dcdfilter get" + delimiter + "dcdfilter get ";
	}

	/**
	 * Enables the DCD filter.
	 * 
	 * @return
	 */
	public static String on() {
		return "dcdfilter on" + delimiter + "dcdfilter on ";
	}

	/**
	 * Disables the DCD filter.
	 * 
	 * @return
	 */
	public static String off() {
		return "dcdfilter off" + delimiter + "dcdfilter off ";
	}
}

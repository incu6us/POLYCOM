package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the port to use when accessing the system using the web
 * interface.
 * 
 * @author vpryimak
 *
 */
public class WebPort {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "webport get" + delimiter + "webport get ";
	}

	/**
	 * Sets the web access port to “port”.
	 * 
	 * @param port
	 * @return
	 */
	public static String set(int port) {
		return "webport set " + port + delimiter + "webport set " + port + " ";
	}
}

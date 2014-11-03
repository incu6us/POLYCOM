package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the configuration of echo cancellation, which prevents users
 * from hearing their voices loop back from the far site.
 * 
 * @author vpryimak
 *
 */
public class EchoCanceller {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "echocanceller get" + delimiter + "echocanceller get ";
	}

	/**
	 * Enables the echo canceller option.
	 * 
	 * @return
	 */
	public static String yes() {
		return "echocanceller yes" + delimiter + "echocanceller yes ";
	}

	/**
	 * Disables the echo canceller option.
	 * 
	 * @return
	 */
	public static String no() {
		return "echocanceller no" + delimiter + "echocanceller no ";
	}
}

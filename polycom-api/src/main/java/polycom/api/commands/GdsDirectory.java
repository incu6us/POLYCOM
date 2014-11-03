package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether the Polycom GDS directory server is enabled.
 * 
 * @author vpryimak
 *
 */
public class GdsDirectory {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "gdsdirectory get" + delimiter + "gdsdirectory get ";
	}

	/**
	 * Enables the Polycom GDS directory server
	 * 
	 * @return
	 */
	public static String yes() {
		return "gdsdirectory yes" + delimiter + "gdsdirectory yes ";
	}

	/**
	 * Disables the Polycom GDS directory server. This is the default setting.
	 * 
	 * @return
	 */
	public static String no() {
		return "gdsdirectory no" + delimiter + "gdsdirectory no ";
	}

}

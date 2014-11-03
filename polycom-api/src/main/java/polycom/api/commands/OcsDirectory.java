package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enable Polycom HDX systems to retrieve and display the Microsoft Office
 * Communications Server contact list and to disable other global directory
 * services.
 * 
 * @author vpryimak
 *
 */
public class OcsDirectory {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ocsdirectory get" + delimiter + "ocsdirectory get ";
	}

	/**
	 * Enables the Microsoft Office Communications Server 2007 directory server.
	 * 
	 * @return
	 */
	public static String yes() {
		return "ocsdirectory yes" + delimiter + "ocsdirectory yes ";
	}

	/**
	 * Disables the Microsoft Office Communications Server 2007 directory
	 * server. This is the default setting.
	 * 
	 * @return
	 */
	public static String no() {
		return "ocsdirectory no" + delimiter + "ocsdirectory no ";
	}
}

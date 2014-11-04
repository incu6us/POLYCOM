package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Fixed Ports configuration.
 * 
 * @author vpryimak
 *
 */
public class UseFixedPorts {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "usefixedports get" + delimiter + "usefixedports get ";
	}

	/**
	 * Enables the use of Fixed Ports.
	 * 
	 * @return
	 */
	public static String yes() {
		return "usefixedports yes" + delimiter + "usefixedports yes ";
	}

	/**
	 * Disables the use of Fixed Ports.
	 * 
	 * @return
	 */
	public static String no() {
		return "usefixedports no" + delimiter + "usefixedports no ";
	}
}

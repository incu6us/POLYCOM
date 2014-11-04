package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the name of the system.
 * 
 * @author vpryimak
 *
 */
public class SystemName {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "systemname get" + delimiter + "systemname get ";
	}

	/**
	 * Sets the system name to “system name”.
	 * 
	 * @param systemName
	 *            Character string specifying the system name. Enclose the
	 *            string in quotation marks if it includes spaces. Example:
	 *            “Polycom HDX Demo”
	 * 
	 * @return
	 */
	public static String set(String systemName) {
		return "systemname set " + systemName + delimiter + "systemname set " + systemName + " ";
	}
}

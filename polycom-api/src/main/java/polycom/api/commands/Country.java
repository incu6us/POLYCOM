package polycom.api.commands;

import polycom.api.Constants;

/**
 * Gets the country setting for the system.
 * 
 * @author vpryimak
 *
 */
public class Country {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "country get" + delimiter + "country get ";
	}
}

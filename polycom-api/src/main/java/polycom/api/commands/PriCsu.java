package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the PRI CSU mode for a T1 interface.
 * 
 * @author vpryimak
 *
 */
public class PriCsu {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "pricsu get" + delimiter + "pricsu get ";
	}

	/**
	 * Sets the internal CSU mode. This is the default.
	 * 
	 * @return
	 */
	public static String internal() {
		return "pricsu internal" + delimiter + "pricsu internal ";
	}

	/**
	 * Sets the external CSU mode. When selected, you must specify the PRI line
	 * buildout.
	 * 
	 * @return
	 */
	public static String external() {
		return "pricsu external" + delimiter + "pricsu external ";
	}
}

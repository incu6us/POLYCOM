package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the PRI international dialing prefix.
 * 
 * @author vpryimak
 *
 */
public class PriIntlPrefix {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "priintlprefix get" + delimiter + "priintlprefix get ";
	}

	/**
	 * Sets the PRI international dialing prefix when followed by the parameter
	 * “prefix”. To erase the current setting, omit the parameter.
	 * 
	 * @param prefix
	 *            Numeric string.
	 * 
	 * @return
	 */
	public static String set(String prefix) {
		return "priintlprefix set " + prefix + delimiter + "priintlprefix set " + prefix + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the PRI call-by-call value. This command is only applicable if
 * you have a PRI network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class PriCallByCall {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "pricallbycall get" + delimiter + "pricallbycall get ";
	}

	/**
	 * Sets PRI call-by-call when followed by a value from {0..31}.
	 * 
	 * @param value
	 *            Range of call-by-call values.
	 * 
	 * @return
	 */
	public static String set(int value) {
		return "pricallbycall set " + value + delimiter + "pricallbycall set " + value + " ";
	}
}

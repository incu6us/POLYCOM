package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the use of dynamic bandwidth allocation for Quality of Service.
 * 
 * @author vpryimak
 *
 */
public class DynamicBandwidth {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "dynamicbandwidth get" + delimiter + "dynamicbandwidth get ";
	}

	/**
	 * Enables the dynamic bandwidth option.
	 * 
	 * @return
	 */
	public static String yes() {
		return "dynamicbandwidth yes" + delimiter + "dynamicbandwidth yes ";
	}

	/**
	 * Disables the dynamic bandwidth option.
	 * 
	 * @return
	 */
	public static String no() {
		return "dynamicbandwidth no" + delimiter + "dynamicbandwidth no ";
	}
}

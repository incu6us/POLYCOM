package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the gateway number.
 * 
 * @author vpryimak
 *
 */
public class GatewayNumber {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "gatewaynumber get" + delimiter + "gatewaynumber get ";
	}

	/**
	 * Sets the gateway number when followed by the “number” parameter. To erase
	 * the current setting, omit “number”.
	 * 
	 * @param number
	 *            Numeric string specifying the gateway number.
	 * 
	 * @return
	 */
	public static String set(int number) {
		return "gatewaynumber set " + number + delimiter + "gatewaynumber set " + number + " ";
	}
}

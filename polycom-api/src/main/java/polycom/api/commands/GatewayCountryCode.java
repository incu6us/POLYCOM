package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the gateway country code.
 * 
 * @author vpryimak
 *
 */
public class GatewayCountryCode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "gatewaycountrycode get" + delimiter + "gatewaycountrycode get ";
	}

	/**
	 * Sets the gateway country code when followed by the “countrycode”
	 * parameter. To erase the current setting, omit “countrycode”.
	 * 
	 * @param countryCode
	 *            Numeric string specifying the gateway country code.
	 * 
	 * @return
	 */
	public static String set(String countryCode) {
		return "gatewaycountrycode set " + countryCode + delimiter + "gatewaycountrycode set " + countryCode+" ";
	}
}

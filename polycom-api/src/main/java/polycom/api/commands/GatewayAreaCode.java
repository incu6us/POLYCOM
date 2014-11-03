package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the gateway area code.
 * 
 * @author vpryimak
 *
 */
public class GatewayAreaCode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the area code for the gateway.
	 * 
	 * @return
	 */
	public static String get() {
		return "gatewayareacode get" + delimiter + "gatewayareacode get ";
	}

	/**
	 * Sets the area code when followed by the “areacode” parameter. To erase
	 * the current setting, omit “areacode”.
	 * 
	 * @param areaCode
	 * @return
	 */
	public static String set(int areaCode) {
		return "gatewayareacode set " + areaCode + delimiter + "gatewayareacode set " + areaCode + " ";
	}
}

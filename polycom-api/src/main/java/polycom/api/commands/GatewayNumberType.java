package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Gateway Number Type, which can be either Direct Inward Dial
 * (DID) or Number+Extension.
 * 
 * @author vpryimak
 *
 */

public class GatewayNumberType {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "gatewaynumbertype get" + delimiter + "gatewaynumbertype get ";
	}

	/**
	 * Indicates that the gateway number is a direct inward dial number; it has
	 * no extension.
	 * 
	 * @return
	 */
	public static String did() {
		return "gatewaynumbertype did" + delimiter + "gatewaynumbertype did ";
	}

	/**
	 * Indicates that the gateway number includes an extension. This option
	 * allows the call to go through directly (it dials the Gateway Number + ##
	 * + Extension as one number).
	 * 
	 * @return
	 */
	public static String numberAndExtension() {
		return "gatewaynumbertype number+extension" + delimiter + "gatewaynumbertype number+extension ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the gateway extension number.
 * 
 * @author vpryimak
 *
 */
public class GatewayExt {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "gatewayext get" + delimiter + "gatewayext get ";
	}

	/**
	 * Sets the gateway extension number when followed by the “extension”
	 * parameter. To reset the default value, omit “extension”.
	 * 
	 * @param ext
	 *            Numeric string specifying the gateway extension.
	 * 
	 * @return
	 */
	public static String set(String ext) {
		return "gatewayext set " + ext + delimiter + "gatewayext set " + ext + " ";
	}
}

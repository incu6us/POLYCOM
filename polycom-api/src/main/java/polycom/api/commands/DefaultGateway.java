package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the default gateway.
 * 
 * @author vpryimak
 *
 */
public class DefaultGateway {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the default gateway IP address.
	 * 
	 * @return
	 */
	public static String get() {
		return "defaultgateway get" + delimiter + "defaultgateway get ";
	}

	/**
	 * Sets the default gateway when followed by the “xxx.xxx.xxx.xxx”
	 * parameter.
	 * 
	 * @param gatewayIp
	 *            IP address to use as the default gateway.
	 * 
	 * @return
	 */
	public static String set(String gatewayIp) {
		return "defaultgateway set " + gatewayIp + delimiter + "defaultgateway set " + gatewayIp + " ";
	}
}

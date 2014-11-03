package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enables certificate validation by specifying whether the HDX system requires
 * the server to present a valid certificate when the server makes secure
 * connections for services such as provisioning, directory search, and session
 * initiation protocol (SIP) calling.
 * 
 * @author vpryimak
 *
 */
public class ClientValidatePeerCert {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the peer certificate validation setting for client.
	 * 
	 * @return
	 */
	public static String get() {
		return "clientvalidatepeercert get" + delimiter + "clientvalidatepeercert get ";
	}

	/**
	 * Enables the peer certificate validation requirement for client.
	 * 
	 * @return
	 */
	public static String yes() {
		return "clientvalidatepeercert yes" + delimiter + "clientvalidatepeercert yes ";
	}

	/**
	 * Disables the peer certificate validation requirement for client.
	 * 
	 * @return
	 */
	public static String no() {
		return "clientvalidatepeercert no" + delimiter + "clientvalidatepeercert no ";
	}
}

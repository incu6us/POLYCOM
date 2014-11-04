package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enables certificate validation by specifying whether the HDX system requires
 * a browser to present a valid certificate when it tries to connect to the HDX
 * web interface.
 * 
 * @author vpryimak
 *
 */
public class ServerValidatePeerCert {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the peer certificate validation setting for web servers.
	 * 
	 * @return
	 */
	public static String get() {
		return "servervalidatepeercert get" + delimiter + "servervalidatepeercert get ";
	}

	/**
	 * Enables peer certificate validation requirement for web servers.
	 * 
	 * @return
	 */
	public static String yes() {
		return "servervalidatepeercert yes" + delimiter + "servervalidatepeercert yes ";
	}

	/**
	 * Disables peer certificate validation requirement for web servers.
	 * 
	 * @return
	 */
	public static String no() {
		return "servervalidatepeercert no" + delimiter + "servervalidatepeercert no ";
	}
}

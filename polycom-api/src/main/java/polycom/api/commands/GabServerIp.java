package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the IP address of the Global Directory Server.
 * 
 * @author vpryimak
 *
 */
public class GabServerIp {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "gabserverip get" + delimiter + "gabserverip get ";
	}

	/**
	 * Sets the GDS server’s IP address when followed by the parameter
	 * “xxx.xxx.xxx.xxx”. To erase the current setting, omit the
	 * “xxx.xxx.xxx.xxx” parameter.
	 * 
	 * @param ipAddr
	 * @return
	 */
	public static String set(String ipAddr) {
		return "gabserverip set " + ipAddr + delimiter + "gabserverip set " + ipAddr + " ";
	}
}

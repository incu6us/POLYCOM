package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the IP address of the gatekeeper.
 * 
 * @author vpryimak
 *
 */
public class GateKeeperIp {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "gatekeeperip get" + delimiter + "gatekeeperip get ";
	}

	/**
	 * Sets the gatekeeper IP address when followed by the “xxx.xxx.xxx.xxx”
	 * parameter. To erase the current setting, omit “xxx.xxx.xxx.xxx”.
	 * 
	 * @param ipAddr
	 * @return
	 */
	public static String set(String ipAddr) {
		return "gatekeeperip set " + ipAddr + delimiter + "gatekeeperip set " + ipAddr;
	}
}

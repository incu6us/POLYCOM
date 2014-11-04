package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the subnet mask of the system.
 * 
 * @author vpryimak
 *
 */
public class SubNetmask {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current subnet mask.
	 * 
	 * @return
	 */
	public static String get() {
		return "subnetmask get" + delimiter + "subnetmask get ";
	}

	/**
	 * Sets the subnet mask of the system when followed by the ”xxx.xxx.xxx.xxx”
	 * parameter. To erase the current setting, omit “xxx.xxx.xxx.xxx”.
	 * 
	 * @param netmask
	 *            Subnet mask of the system.
	 * 
	 * @return
	 */
	public static String set(String netmask) {
		return "subnetmask set " + netmask + delimiter + "subnetmask set " + netmask + " ";
	}
}

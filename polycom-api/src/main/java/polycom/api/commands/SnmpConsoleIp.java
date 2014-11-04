package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the SNMP console IP address.
 * 
 * @author vpryimak
 *
 */
public class SnmpConsoleIp {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "snmpconsoleip get" + delimiter + "snmpconsoleip get ";
	}

	/**
	 * Sets the SNMP console IP address when followed by the “xxx.xxx.xxx.xxx”
	 * parameter. To erase the current setting, omit the parameter.
	 * 
	 * @param ipAddress
	 *            IP address of the console.
	 * 
	 * @return
	 */
	public static String set(String ipAddress) {
		return "snmpconsoleip set " + ipAddress + delimiter + "snmpconsoleip set " + ipAddress + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the SNMP administrator name.
 * 
 * @author vpryimak
 *
 */
public class SnmpAdmin {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "snmpadmin get" + delimiter + "snmpadmin get ";
	}

	/**
	 * Sets the administrator name when followed by the “admin name” parameter.
	 * To erase the current setting, omit “admin name”.
	 * 
	 * @param adminName
	 *            SNMP administrator contact name. Character string. Enclose the
	 *            character string in quotation marks if it includes spaces.
	 *            Example: “John Admin”
	 * 
	 * @return
	 */
	public static String set(String adminName) {
		return "snmpadmin set " + adminName + delimiter + "snmpadmin set " + adminName + " ";
	}
}

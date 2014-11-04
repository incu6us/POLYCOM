package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the SNMP community name.
 * 
 * @author vpryimak
 *
 */
public class SnmpCommunity {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "snmpcommunity get" + delimiter + "snmpcommunity get ";
	}

	/**
	 * Sets the SNMP community name when followed by the “community name”
	 * parameter. To erase the current setting, omit the parameter.
	 * 
	 * @param community
	 *            SNMP community name. Character string. Enclose the character
	 *            string in quotation marks if it includes spaces.
	 * 
	 * @return
	 */
	public static String set(String community) {
		return "snmpcommunity set " + community + delimiter + "snmpcommunity set " + community + " ";
	}
}

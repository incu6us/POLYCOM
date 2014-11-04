package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the SNMP trap version.
 * 
 * @author vpryimak
 *
 */
public class SnmpTrapVersion {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "snmptrapversion get" + delimiter + "snmptrapversion get ";
	}

	/**
	 * Sets the SNMP trap protocol that the system uses.
	 * 
	 * @return
	 */
	public static String setV1() {
		return "snmptrapversion set v1" + delimiter + "snmptrapversion set v1 ";
	}

	/**
	 * Sets the SNMP trap protocol that the system uses.
	 * 
	 * @return
	 */
	public static String setV1c() {
		return "snmptrapversion set v2c" + delimiter + "snmptrapversion set v2c ";
	}
}

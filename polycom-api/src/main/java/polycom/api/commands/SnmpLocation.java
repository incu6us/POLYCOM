package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the SNMP location name.
 * 
 * @author vpryimak
 *
 */
public class SnmpLocation {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "snmplocation get" + delimiter + "snmplocation get ";
	}

	/**
	 * Sets the SNMP location name when followed by the “location name”
	 * parameter. To erase the current setting, omit the parameter.
	 * 
	 * @param locationName
	 *            SNMP location name. Enclose the location name in quotation
	 *            marks if it includes spaces.
	 * 
	 * @return
	 */
	public static String set(String locationName) {
		return "snmplocation set " + locationName + delimiter + "snmplocation set " + locationName + " ";
	}
}

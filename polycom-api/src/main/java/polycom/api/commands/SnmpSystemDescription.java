package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the SNMP system description.
 * 
 * @author vpryimak
 *
 */
public class SnmpSystemDescription {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "snmpsystemdescription get" + delimiter + "snmpsystemdescription get ";
	}

	/**
	 * Sets the SNMP system description when followed by the “system
	 * description” parameter. To erase the current setting, omit the parameter.
	 * 
	 * @param systemDescription
	 *            SNMP system description.
	 * 
	 * @return
	 */
	public static String set(String systemDescription) {
		return "snmpsystemdescription set " + systemDescription + delimiter + "snmpsystemdescription set " + systemDescription + " ";
	}
}

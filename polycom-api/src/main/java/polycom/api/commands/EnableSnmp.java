package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the SNMP configuration.
 * 
 * @author vpryimak
 *
 */
public class EnableSnmp {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "enablesnmp get" + delimiter + "enablesnmp get ";
	}

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String yes() {
		return "enablesnmp yes" + delimiter + "enablesnmp yes ";
	}

	/**
	 * Disables the SNMP option.
	 * 
	 * @return
	 */
	public static String no() {
		return "enablesnmp no" + delimiter + "enablesnmp no ";
	}
}

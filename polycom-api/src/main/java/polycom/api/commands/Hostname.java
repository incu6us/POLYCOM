package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the LAN host name, which is assigned to the system for TCP/IP
 * configuration and can be used in place of an IP address when dialing IP
 * calls.
 * 
 * @author vpryimak
 *
 */
public class Hostname {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "hostname get" + delimiter + "hostname get ";
	}

	/**
	 * Sets the system’s LAN host name when followed by the “hostname”
	 * parameter. If “hostname” is omitted, the system automatically sets it to
	 * Admin.
	 * 
	 * @param hostname
	 *            Character string specifying the LAN host name of the system.
	 *            The LAN host name follows these format rules: Starts with a
	 *            letter (A-a to Z-z). It is not case sensitive. Ends with a
	 *            letter (A-a to Z-z) or a number (0 to 9). May include letters,
	 *            numbers, and a hyphen. May not be longer than 63 characters.
	 *            Note: The LAN host name is initialized during the out-of-box
	 *            setup sequence. The LAN host name is the same as the system
	 *            name, if the system name conforms to the rules above. If the
	 *            system name does not conform to these rules, the invalid
	 *            characters are removed from the system name. If the resulting
	 *            string is empty, the default LAN host name is Admin.
	 * 
	 * @return
	 */
	public static String set(String hostname) {
		return "hostname set " + hostname + delimiter + "hostname set " + hostname + " ";
	}
}

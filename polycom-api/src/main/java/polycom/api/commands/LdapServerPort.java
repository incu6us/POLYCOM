package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the port number of an LDAP server.
 * 
 * @author vpryimak
 *
 */
public class LdapServerPort {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ldapserverport get" + delimiter + "ldapserverport get ";
	}

	/**
	 * Sets the port number of an LDAP server. To erase the current setting,
	 * omit the “port number” parameter. Note: This parameter does not change
	 * the setting on the server. Instead, this parameter changes how the
	 * Polycom system recognizes the server.
	 * 
	 * @param port
	 *            Specifies the port number of an LDAP server. The default
	 *            setting is 389.
	 * 
	 * @return
	 */
	public static String set(int port) {
		return "ldapserverport set " + port + delimiter + "ldapserverport set " + port + " ";
	}
}

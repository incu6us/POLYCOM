package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the user name for NTLM authentication of an LDAP server.
 * 
 * @author vpryimak
 *
 */
public class LdapUserName {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ldapusername get" + delimiter + "ldapusername get ";
	}

	/**
	 * Sets the user name for NTLM authentication of an LDAP server. To erase
	 * the current setting, omit the “user name” parameter. Note: This parameter
	 * does not change the setting on the server. Instead, this parameter
	 * changes how the Polycom system recognizes the server.
	 * 
	 * @param username
	 *            Specifies the user name for NTLM authentication of an LDAP
	 *            server. Valid characters include: Unicode (ISO-10646)
	 *            characters, including IA5/ASCII characters and extended
	 *            characters such as é, Ø, and å.
	 * 
	 * @return
	 */
	public static String set(String username) {
		return "ldapusername set " + username + delimiter + "ldapusername set " + username + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the base distinguished name (DN) of an LDAP server.
 * 
 * @author vpryimak
 *
 */
public class LdapBaseDn {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ldapbasedn get" + delimiter + "ldapbased get ";
	}

	/**
	 * Sets the base DN of an LDAP server. To erase the current setting, omit
	 * the “base dn” parameter. Notes: This parameter does not change the
	 * setting on the server. Instead, this parameter changes how the Polycom
	 * system recognizes the server.
	 * 
	 * @param ldapBaseDn
	 *            Specifies the base DN of an LDAP server. Valid characters
	 *            include: Unicode (ISO-10646) characters, including IA5/ASCII
	 *            characters and extended characters such as é, Ø, and å.
	 * 
	 * @return
	 */
	public static String set(String ldapBaseDn) {
		return "ldapbasedn set" + ldapBaseDn + delimiter + "ldapbased set " + ldapBaseDn + " ";
	}
}

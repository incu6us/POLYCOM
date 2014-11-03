package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the bind DN for LDAP Simple Authentication.
 * 
 * @author vpryimak
 *
 */
public class LdapBindDn {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ldapbinddn get" + delimiter + "ldapbinddn get ";
	}

	/**
	 * Sets the bind DN for LDAP Simple Authentication. To erase the current
	 * setting, omit the “bind dn” parameter. Note: This parameter does not
	 * change the setting on the server. Instead, this parameter changes how the
	 * Polycom system recognizes the server.
	 * 
	 * @param ldapBindDn
	 *            Specifies the bind DN of an LDAP server. Valid characters
	 *            include: Unicode (ISO-10646) characters, including IA5/ASCII
	 *            characters and extended characters such as é, Ø, and å.
	 * 
	 * @return
	 */
	public static String set(String ldapBindDn) {
		return "ldapbinddn set " + ldapBindDn + delimiter + "ldapbinddn set " + ldapBindDn;
	}
}

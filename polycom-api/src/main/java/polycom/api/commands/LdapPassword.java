package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the password for Simple or NT LAN Manager (NTLM) authentication of an
 * LDAP server.
 * 
 * @author vpryimak
 *
 */
public class LdapPassword {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Specifies setting the password for NTLM authentication of an LDAP server.
	 * 
	 * @param passwd
	 *            Specifies the password for Simple or NTLM authentication of an
	 *            LDAP server. Valid characters include: Unicode (ISO-10646)
	 *            characters, including IA5/ASCII characters and extended
	 *            characters such as é, Ø, and å. Note: The server administrator
	 *            may specify additional restrictions for password creation.
	 * 
	 * @return
	 */
	public static String setNtlm(String passwd) {
		return "ldappassword set ntlm" + delimiter + "ldappassword set ntlm ";
	}

	/**
	 * Specifies setting the password for Simple authentication of an LDAP
	 * server.
	 * 
	 * @param passwd
	 *            Specifies the password for Simple or NTLM authentication of an
	 *            LDAP server. Valid characters include: Unicode (ISO-10646)
	 *            characters, including IA5/ASCII characters and extended
	 *            characters such as é, Ø, and å. Note: The server administrator
	 *            may specify additional restrictions for password creation.
	 * 
	 * @return
	 */
	public static String setBasic(String passwd) {
		return "ldappassword set basic" + delimiter + "ldappassword set basic ";
	}
}

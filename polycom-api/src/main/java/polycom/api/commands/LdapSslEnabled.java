package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Secure Sockets Layer (SSL)/Transport Layer Security (TLS)
 * encryption state for LDAP operations.
 * 
 * @author vpryimak
 *
 */
public class LdapSslEnabled {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ldapsslenabled get" + delimiter + "ldapsslenabled get ";
	}

	/**
	 * Specifies “on” as the encryption state for LDAP operations. This is the
	 * default setting.
	 * 
	 * @return
	 */
	public static String on() {
		return "ldapsslenabled set on" + delimiter + "ldapsslenabled set on ";
	}

	/**
	 * Specifies “off” as the encryption state for LDAP operations.
	 * 
	 * @return
	 */
	public static String off() {
		return "ldapsslenabled set off" + delimiter + "ldapsslenabled set off ";
	}
}

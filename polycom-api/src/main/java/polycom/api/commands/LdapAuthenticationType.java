package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the authentication type required to authenticate with an LDAP
 * server.
 * 
 * @author vpryimak
 *
 */
public class LdapAuthenticationType {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ldapauthenticationtype get" + delimiter + "ldapauthenticationtype get ";
	}

	/**
	 * Specifies “anonymous” as the authentication type of an LDAP server.
	 * 
	 * @return
	 */
	public static String setAnonynous() {
		return "ldapauthenticationtype set anonymous " + delimiter + "ldapauthenticationtype set anonymous ";
	}

	/**
	 * Specifies “basic” as the authentication type of an LDAP server.
	 * 
	 * @return
	 */
	public static String setBasic() {
		return "ldapauthenticationtype set basic " + delimiter + "ldapauthenticationtype set basic ";
	}

	/**
	 * Specifies “ntlm” as the authentication type of an LDAP server. This is
	 * the default setting.
	 * 
	 * @return
	 */
	public static String setNtlm() {
		return "ldapauthenticationtype set ntlm " + delimiter + "ldapauthenticationtype set ntlm ";
	}
}

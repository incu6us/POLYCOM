package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether the LDAP directory server is enabled.
 * 
 * @author vpryimak
 *
 */
public class LdapDirectory {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ldapdirectory get" + delimiter + "ldapdirectory get ";
	}

	/**
	 * Enables the LDAP directory server.
	 * 
	 * @return
	 */
	public static String yes() {
		return "ldapdirectory yes" + delimiter + "ldapdirectory yes ";
	}

	/**
	 * Disables the LDAP directory server. This is the default setting.
	 * 
	 * @return
	 */
	public static String no() {
		return "ldapdirectory no" + delimiter + "ldapdirectory no ";
	}
}

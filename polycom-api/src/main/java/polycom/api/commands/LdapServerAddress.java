package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the LDAP server address.
 * 
 * @author vpryimak
 *
 */
public class LdapServerAddress {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ldapserveraddress get" + delimiter + "ldapserveraddress get ";
	}

	/**
	 * Sets the IP address or the DNS name of an LDAP server. To erase the
	 * current setting, omit the “address” parameter. Note: This parameter does
	 * not change the setting on the server. Instead, this parameter changes how
	 * the Polycom system recognizes the server.
	 * 
	 * @param address
	 *            Specifies the IP address or the DNS name of an LDAP server.
	 *            The DNS name requires alphanumeric characters. Valid
	 *            characters include: 0 through 9 a through z A through Z -
	 *            Note: The “-” character cannot be used as the first or last
	 *            character in the DNS name.
	 * 
	 * @return
	 */
	public static String set(String address) {
		return "ldapserveraddress set " + address + delimiter + "ldapserveraddress set " + address + " ";
	}
}

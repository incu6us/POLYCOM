package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the domain in which authentication takes place in the Active
 * Directory server.
 * 
 * @author vpryimak
 *
 */
public class LdapNtlmDomain {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "ldapntlmdomain get" + delimiter + "ldapntlmdomain get ";
	}

	/**
	 * Sets the domain in which authentication takes place in the Active
	 * Directory server. To erase the current setting, omit the “domain”
	 * parameter. Note: This parameter does not change the setting on the
	 * server. Instead, this parameter changes how the Polycom system recognizes
	 * the server.
	 * 
	 * @param domain
	 *            Specifies the domain in which authentication takes place in
	 *            the Active Directory server. Valid characters include: 0
	 *            through 9, a through z, A through Z, hyphen (-), and period
	 *            (.) Note: The domain name cannot begin or end with a hyphen or
	 *            a period.
	 * 
	 * @return
	 */
	public static String set(String domain) {
		return "ldapntlmdomain set " + domain + delimiter + "ldapntlmdomain set " + domain + " ";
	}
}

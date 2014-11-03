package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the configuration for up to four DNS servers.
 * 
 * @author vpryimak
 *
 */
public class Dns {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current IP address of the specified server. A server
	 * identification number {1..4} is required.
	 * 
	 * @param idNumberIdentifier
	 *            Specifies the server identification number.
	 * 
	 * @return
	 */
	public static String get(int idNumberIdentifier) {
		return "dns get " + idNumberIdentifier + delimiter + "dns get " + idNumberIdentifier + " ";
	}

	/**
	 * Sets the IP address of the specified DNS server when followed by the
	 * “xxx.xxx.xxx.xxx” parameter. A server identification number {1..4} is
	 * required.
	 * 
	 * @param idNumberIdentifier
	 *            Specifies the server identification number.
	 * 
	 * @param dnsIpAddress
	 *            Specifies the IP address for the specified server.
	 * 
	 * @return
	 */
	public static String set(int idNumberIdentifier, String dnsIpAddress) {
		return "dns set " + idNumberIdentifier + " " + dnsIpAddress + delimiter + "dns set " + idNumberIdentifier + " " + dnsIpAddress + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns the LAN host name, WINS resolution, DHCP, IP address, DNS servers
 * 1-4, default gateway, WINS server, and subnet mask.
 * 
 * @author vpryimak
 *
 */
public class IpStat {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String getStat() {
		return "ipstat" + delimiter + "ipstat ";
	}
}

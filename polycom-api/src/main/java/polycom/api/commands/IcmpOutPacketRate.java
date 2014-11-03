package polycom.api.commands;

import polycom.api.Constants;

/**
 * Specify minimum number of milliseconds between packets to limit the ICMP
 * packet transmission rate.
 * 
 * @author vpryimak
 *
 */
public class IcmpOutPacketRate {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the minimum number of milliseconds between transmitted ICMP
	 * packets.
	 * 
	 * @return
	 */
	public static String get() {
		return "icmpoutpacketrate get" + delimiter + "icmpoutpacketrate get ";
	}

	/**
	 * Sets the minimum number of milliseconds between transmitted ICMP packets.
	 * 
	 * @param packetRate
	 *            The packet rate. This must be an integer in the range
	 *            {0..60000}. 1000=1 packet per second.
	 * 
	 * @return
	 */
	public static String set(int packetRate) {
		return "icmpoutpacketrate set " + packetRate + delimiter + "icmpoutpacketrate set " + packetRate;
	}
}

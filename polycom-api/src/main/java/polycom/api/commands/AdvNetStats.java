package polycom.api.commands;

import polycom.api.Constants;

/**
 * Gets advanced network statistics for a call connection
 * 
 * @author vpryimak
 *
 */
public class AdvNetStats {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Specifies a connection in a multipoint call, where n is the maximum
	 * number of connections supported by the system. 0 is call #1, 1 is call
	 * #2, 2 is call #3, and so on. Select a number from this range to specify a
	 * remote site call for which you want to obtain advanced network
	 * statistics. Omit this parameter when retrieving statistics for a
	 * point-to-point call.
	 * 
	 * @param connection
	 * @return tar=Transmit audio rate rar=Receive audio rate tvr=Transmit video
	 *         rate rvr=Receive video rate tvru=Transmit video rate used
	 *         rvru=Receive video rate used tvfr=Transmit video frame rate
	 *         rvfr=Receive video frame rate vfe=Video FEC errors tapl=Transmit
	 *         audio packet loss (H.323 calls only) tlsdp=Transmit LSD protocol
	 *         (H.320 calls only) rapl=Receive audio packet loss (H.323 calls
	 *         only) rlsdp=Receive LSD protocol (H.320 calls only) taj=Transmit
	 *         audio jitter (H.323 calls only) tlsdr=Transmit LSD rate (H.320
	 *         calls only) raj=Receive audio jitter (H.323 calls only)
	 *         rlsd=Receive LSD rate (H.320 calls only) tvpl=Transmit video
	 *         packet loss (H.323 calls only) tmlpp=Transmit MLP protocol (H.320
	 *         calls only) rvpl=Receive video packet loss (H.323 calls only)
	 */
	public static String setConnection(int connection) {
		return "advnetstats " + connection + delimiter + "advnetstats " + connection + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns network statistics for each call.
 * 
 * @author vpryimak
 *
 */
public class NetStats {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String getStat() {
		return "netstats" + delimiter + "netstats ";
	}

	/**
	 * @param maxCalls
	 *            Call in a multipoint call, where n is the maximum number of
	 *            calls supported by the system. 0 is the first site connected.
	 *            If no call is specified, netstats returns information about
	 *            the near site.
	 * 
	 * @return
	 */
	public static String getStat(int maxCalls) {
		return "netstats " + maxCalls + delimiter + "netstats " + maxCalls + " ";
	}
}

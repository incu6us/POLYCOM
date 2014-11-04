package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the number of PRI channels to dial in parallel. This command is
 * only applicable if you have a PRI network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class PriDialChannels {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current number of channels dialed in parallel.
	 * 
	 * @return
	 */
	public static String get() {
		return "pridialchannels get" + delimiter + "pridialchannels get ";
	}

	/**
	 * Sets the number of PRI channels to be dialed in parallel when followed by
	 * a parameter from {1..n}. To erase the current setting, omit the
	 * parameter.
	 * 
	 * @param rangePriChannels
	 *            Range of numbers of PRI channels that can be dialed in
	 *            parallel. For PRI T1, the range is 1..12. For PRI E1, the
	 *            range is 1..15.
	 * 
	 * @return
	 */
	public static String set(int rangePriChannels) {
		return "pridialchannels set "+rangePriChannels + delimiter + "pridialchannels set "+rangePriChannels+" ";
	}
}

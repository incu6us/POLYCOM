package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether to dial ISDN channels in parallel. This command is only
 * applicable if you have an ISDN network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class DialChannels {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "dialchannels get" + delimiter + "dialchannels get ";
	}

	/**
	 * Sets the number of channels to dial.
	 * 
	 * @param numOfChannels
	 *            Sets the number of channels to dial. n is 8 for QBRI, 12 for
	 *            PRI.
	 * 
	 * @return
	 */
	public static String set(int numOfChannels) {
		return "dialchannels set " + numOfChannels + delimiter + "dialchannels set " + numOfChannels + " ";
	}
}

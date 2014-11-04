package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the number of ports to use on the V.35/RS-449/RS-530 network
 * interface module.
 * 
 * @author vpryimak
 *
 */
public class V35PortsUsed {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "v35portsused get" + delimiter + "v35portsused get ";
	}

	/**
	 * 
	 * @param selectedChannels
	 *            1 - Selects one port for one-channel calls.
	 * 
	 *            1+2 - Selects two ports for two-channel calls (2 x 56 kbps or
	 *            2 x 64 kbps).
	 * 
	 * @return
	 */
	public static String set(String selectedChannels) {
		return "v35portsused set " + selectedChannels + delimiter + "v35portsused set " + selectedChannels;
	}
}

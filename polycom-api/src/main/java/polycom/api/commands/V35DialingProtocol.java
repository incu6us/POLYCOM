package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the V.35 dialing protocol. This command is only applicable if
 * you have a V.35 network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class V35DialingProtocol {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "v35dialingprotocol get" + delimiter + "v35dialingprotocol get ";
	}

	/**
	 * Enables RS-366 as the dialing protocol. At this time, RS-366 is the only
	 * supported dialing protocol on the system.
	 * 
	 * @return
	 */
	public static String rs366() {
		return "v35dialingprotocol rs366" + delimiter + "v35dialingprotocol rs366 ";
	}
}

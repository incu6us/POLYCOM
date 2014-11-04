package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the gatekeeper mode (off, specify, or auto).
 * 
 * @author vpryimak
 *
 */
public class UseGateKeeper {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting. Note: A gatekeeper is not required to make
	 * IP-to-IP LAN calls. In these situations, select the off option.
	 * 
	 * @return
	 */
	public static String get() {
		return "usegatekeeper get" + delimiter + "usegatekeeper get ";
	}

	/**
	 * Select this option if no gatekeeper is required or if you make IP-to-IP
	 * LAN calls.
	 * 
	 * @return
	 */
	public static String off() {
		return "usegatekeeper off" + delimiter + "usegatekeeper off ";
	}

	/**
	 * Specifies a gatekeeper. If this option is selected, you must enter the
	 * gatekeeper IP address or name using the gatekeeperip command on page
	 * 4-143.
	 * 
	 * @return
	 */
	public static String specify() {
		return "usegatekeeper specify" + delimiter + "usegatekeeper specify ";
	}

	/**
	 * Sets the system to automatically find an available gatekeeper.
	 * 
	 * @return
	 */
	public static String auto() {
		return "usegatekeeper auto" + delimiter + "usegatekeeper auto ";
	}
}

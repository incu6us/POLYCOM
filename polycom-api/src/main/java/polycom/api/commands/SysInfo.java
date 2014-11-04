package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets registration for ISDN, IP, and gatekeeper status notifications.
 * 
 * @author vpryimak
 *
 */
public class SysInfo {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns registration status.
	 * 
	 * @return
	 */
	public static String get() {
		return "sysinfo get" + delimiter + "sysinfo get ";
	}

	/**
	 * Registers the shell session to receive ISDN, IP, and gatekeeper status
	 * notifications.
	 * 
	 * @return
	 */
	public static String register() {
		return "sysinfo register" + delimiter + "sysinfo register ";
	}

	/**
	 * Unregisters the shell session for ISDN, IP, and gatekeeper status
	 * notifications.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "sysinfo unregister" + delimiter + "sysinfo unregister ";
	}
}

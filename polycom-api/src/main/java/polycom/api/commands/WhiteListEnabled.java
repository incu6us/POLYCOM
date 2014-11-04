package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enables or disables the ability to restrict a Polycom HDX system’s access to
 * only those systems with IP addresses that match one of the addresses or
 * patterns specified in the whitelist.
 * 
 * @author vpryimak
 *
 */
public class WhiteListEnabled {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "whitelistenabled get" + delimiter + "whitelistenabled get ";
	}

	/**
	 * Allows the Polycom HDX system to access only those systems with IP
	 * addresses that match one of the addresses or patterns specified in the
	 * whitelist.
	 * 
	 * @return
	 */
	public static String yes() {
		return "whitelistenabled yes" + delimiter + "whitelistenabled yes ";
	}

	/**
	 * Allows the Polycom HDX system to access systems with IP addresses that
	 * are not specified in the whitelist.
	 * 
	 * @return
	 */
	public static String no() {
		return "whitelistenabled no" + delimiter + "whitelistenabled no ";
	}
}

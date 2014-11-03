package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Enable H.460 Firewall Traversal setting. This feature
 * requires an Edgewater session border controller that supports H.460.
 * 
 * @author vpryimak
 *
 */
public class EnableFirewallTraversal {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "enablefirewalltraversal get" + delimiter + "enablefirewalltraversal get ";
	}

	/**
	 * Enables the firewall traversal feature.
	 * 
	 * @return
	 */
	public static String on() {
		return "enablefirewalltraversal on" + delimiter + "enablefirewalltraversal on ";
	}

	/**
	 * Disables the firewall traversal feature.
	 * 
	 * @return
	 */
	public static String off() {
		return "enablefirewalltraversal off" + delimiter + "enablefirewalltraversal off ";
	}
}

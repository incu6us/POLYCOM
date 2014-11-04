package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the PRI numbering plan. This command is only applicable if you
 * have a PRI network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class PriNumbeRingPlan {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "prinumberingplan get" + delimiter + "prinumberingplan get ";
	}

	/**
	 * With this parameter, the numbering plan is identified to the upstream
	 * switch as ISDN, and the number type, which is either national or
	 * international, is determined from the dialed phone number. If the dialed
	 * phone number starts with the international dialing prefix that is
	 * currently selected, the type is set to the international and the prefix
	 * is removed from the number before the number is sent to the upstream
	 * switch. Otherwise, the number is marked as national and passed to the
	 * upstream switch without modification.
	 * 
	 * @return
	 */
	public static String isdn() {
		return "prinumberingplan isdn" + delimiter + "prinumberingplan isdn ";
	}

	/**
	 * This is the default selection. With this parameter, the numbering plan
	 * and number type are sent to the upstream as unknown, and the dialed phone
	 * number is sent without notification. The unknown parameter is preferred
	 * and should work with all properly configured PBXs and with most telephone
	 * company switches. A notable exception in North America is an ATT 5ESS
	 * switch, which is provisioned with Accunet, or an ATT 4ESS switch. For
	 * these switches, set the numbering type to ISDN.
	 * 
	 * @return
	 */
	public static String unknown() {
		return "prinumberingplan unknown" + delimiter + "prinumberingplan unknown ";
	}
}

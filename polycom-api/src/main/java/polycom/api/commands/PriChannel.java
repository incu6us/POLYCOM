package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the PRI channels that will be active for the PRI line. This
 * command is only applicable if you have a PRI network interface connected to
 * your system.
 * 
 * @author vpryimak
 *
 */
public class PriChannel {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Selects all PRI channels and returns all channels and settings similar to
	 * briallenable.
	 * 
	 * @return
	 */
	public static String getAll() {
		return "prichannel get all" + delimiter + "prichannel get all ";
	}

	/**
	 * Returns the current setting. Requires a parameter from <all|{1..n}>.
	 * 
	 * @param priChannel
	 *            Range of available PRI channels. For PRI T1, the range is
	 *            1..23. For PRI E1, the range is 1..30.
	 * 
	 * @return
	 */
	public static String get(int priChannel) {
		return "prichannel get " + priChannel + delimiter + "prichannel get " + priChannel + " ";
	}

	/**
	 * Selects all PRI channels and returns all channels and settings similar to
	 * briallenable.
	 * 
	 * @return
	 */
	public static String setAll() {
		return "prichannel set all" + delimiter + "prichannel set all ";
	}

	/**
	 * Sets the PRI channels to be active when followed by a parameter from
	 * <all|{1..n}> and from <on|off>.
	 * 
	 * @param priChannel
	 *            Range of available PRI channels. For PRI T1, the range is
	 *            1..23. For PRI E1, the range is 1..30.
	 *            
	 * @param active
	 *            Activates or deactivates selected PRI channels.
	 * 
	 * @return
	 */
	public static String set(int priChannel, boolean active) {
		if (active) {
			return "prichannel set " + priChannel + " on" + delimiter + "prichannel set " + priChannel + " on ";
		} else {
			return "prichannel set " + priChannel + " off" + delimiter + "prichannel set " + priChannel + " off ";
		}
	}
}

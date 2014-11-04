package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ISDN SPID numbers assigned to the BRI lines used by the
 * system. This command is only applicable if you have a BRI network interface
 * connected to your system.
 * 
 * @author vpryimak
 *
 */
public class SpidNum {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current SPID number associated with a B channel of a
	 * particular line.
	 * 
	 * @return
	 */
	public static String getAll() {
		return "spidnum get all" + delimiter + "spidnum get all ";
	}

	/**
	 * Returns the current SPID number associated with a B channel of a
	 * particular line.
	 * 
	 * @param bChannel
	 *            1b1|1b2|2b1|2b2|3b1|3b2|4b1|4b2
	 * 
	 * @return
	 */
	public static String get(String bChannel) {
		return "spidnum get " + bChannel + delimiter + "spidnum get " + bChannel + " ";
	}

	/**
	 * Sets the SPID number for a B channel line when followed by the “number”
	 * parameter. To erase the current setting, omit “number”.
	 * 
	 * @param bChannel
	 *            1b1|1b2|2b1|2b2|3b1|3b2|4b1|4b2
	 * 
	 * @return
	 */
	public static String set(String bChannel) {
		return "spidnum set " + bChannel + delimiter + "spidnum set " + bChannel + " ";
	}
}

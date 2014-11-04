package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ISDN video numbers assigned to the system. This command is
 * only applicable if you have a V.35 network interface connected to your
 * system.
 * 
 * @author vpryimak
 *
 */
public class V35Num {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current ISDN video number associated with a B channel of a
	 * particular line. Requires <1b1|1b2>.
	 * 
	 * @return
	 */
	public static String get1b1() {
		return "v35num get 1b1" + delimiter + "v35num get 1b1 ";
	}

	/**
	 * Returns the current ISDN video number associated with a B channel of a
	 * particular line. Requires <1b1|1b2>.
	 * 
	 * @return
	 */
	public static String get1b2() {
		return "v35num get 1b2" + delimiter + "v35num get 1b2 ";
	}

	/**
	 * Sets the ISDN video number for a B channel line when followed by a “v35
	 * number” parameter. To erase the current setting, omit the “v35 number”
	 * parameter. 1b1 is port 1 and 1b2 is port 2.
	 * 
	 * @return
	 */
	public static String set1b1() {
		return "v35num set 1b1" + delimiter + "v35num set 1b1 ";
	}

	/**
	 * Sets the ISDN video number for a B channel line when followed by a “v35
	 * number” parameter. To erase the current setting, omit the “v35 number”
	 * parameter. 1b1 is port 1 and 1b2 is port 2.
	 * 
	 * @return
	 */
	public static String set1b2() {
		return "v35num set 1b2" + delimiter + "v35num set 1b2 ";
	}

	/**
	 * Sets the ISDN video number for a B channel line when followed by a “v35
	 * number” parameter. To erase the current setting, omit the “v35 number”
	 * parameter. 1b1 is port 1 and 1b2 is port 2.
	 * 
	 * @param v35Number
	 *            Numeric string. This is the ISDN video number(s) provided by
	 *            your network service provider.
	 * 
	 * @return
	 */
	public static String set1b1(String v35Number) {
		return "v35num set 1b1 " + v35Number + delimiter + "v35num set 1b1 " + v35Number + " ";
	}

	/**
	 * Sets the ISDN video number for a B channel line when followed by a “v35
	 * number” parameter. To erase the current setting, omit the “v35 number”
	 * parameter. 1b1 is port 1 and 1b2 is port 2.
	 * 
	 * @param v35Number
	 *            Numeric string. This is the ISDN video number(s) provided by
	 *            your network service provider.
	 * 
	 * @return
	 */
	public static String set1b2(String v35Number) {
		return "v35num set 1b2 " + v35Number + delimiter + "v35num set 1b2 " + v35Number + " ";
	}
}

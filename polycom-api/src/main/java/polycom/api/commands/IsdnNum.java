package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ISDN video number or numbers assigned to the system. This
 * command is only applicable if you have an ISDN network interface connected to
 * your system.
 * 
 * @author vpryimak
 *
 */
public class IsdnNum {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current ISDN number associated with the specified B channel.
	 * 
	 * @param bChanel
	 *            The line and B channel. Valid values are: 1b1BRI line 1, B
	 *            channel 1 1b2BRI line 1, B channel 2 2b1BRI line 2, B channel
	 *            1 2b2BRI line 2, B channel 2 3b1BRI line 3, B channel 1 3b2BRI
	 *            line 3, B channel 2 4b1BRI line 4, B channel 1 4b2BRI line 4,
	 *            B channel 2
	 * 
	 * @return
	 */
	public static String get(String bChanel) {
		return "isdnnum get " + bChanel + delimiter + "isdnnum get " + bChanel + " ";
	}

	/**
	 * Sets the ISDN number for a B channel line when followed by the “number”
	 * parameter. To erase the current setting, omit “number”.
	 * 
	 * @param bChanel
	 *            The line and B channel. Valid values are: 1b1BRI line 1, B
	 *            channel 1 1b2BRI line 1, B channel 2 2b1BRI line 2, B channel
	 *            1 2b2BRI line 2, B channel 2 3b1BRI line 3, B channel 1 3b2BRI
	 *            line 3, B channel 2 4b1BRI line 4, B channel 1 4b2BRI line 4,
	 *            B channel 2
	 * 
	 * @return
	 */
	public static String set(String bChanel) {
		return "isdnnum set " + bChanel + delimiter + "isdnnum set " + bChanel + " ";
	}

	/**
	 * Sets the ISDN number for a B channel line when followed by the “number”
	 * parameter. To erase the current setting, omit “number”.
	 * 
	 * @param bChanel
	 *            The line and B channel. Valid values are: 1b1BRI line 1, B
	 *            channel 1 1b2BRI line 1, B channel 2 2b1BRI line 2, B channel
	 *            1 2b2BRI line 2, B channel 2 3b1BRI line 3, B channel 1 3b2BRI
	 *            line 3, B channel 2 4b1BRI line 4, B channel 1 4b2BRI line 4,
	 *            B channel 2
	 * 
	 * @param number
	 *            The ISDN number(s) provided by your network service provider
	 *            for the specified B channel.
	 * 
	 * @return
	 */
	public static String set(String bChanel, String number) {
		return "isdnnum set " + bChanel + " " + number + delimiter + "isdnnum set " + bChanel + " " + number + " ";
	}
}

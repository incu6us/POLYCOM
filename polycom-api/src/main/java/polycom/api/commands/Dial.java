package polycom.api.commands;

import polycom.api.Constants;

/**
 * Dials video or audio calls either manually or from the directory.
 * 
 * @author vpryimak
 *
 */
public class Dial {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Dials a directory (address book) entry. Requires the name of the entry.
	 * 
	 * @param addressBookName
	 *            The name of the directory (address book) entry. The name may
	 *            be up to 25 characters. Use quotation marks around strings
	 *            that contain spaces. For example: “John Doe”.
	 * 
	 * @return
	 */
	public static String addressbook(String addressBookName) {
		return "dial addressbook \"" + addressBookName + "\"" + delimiter + "dial addressbook \"" + addressBookName + "\" ";
	}

	/**
	 * Dials a video call number dialstr1 at speed of type h323 or h320.
	 * Requires the parameters “speed” and “dialstr”. Allows the user to
	 * automatically dial a number. The system first attempts H.323 and if that
	 * fails, rolls over to H.320. Deprecated. Instead of this command, Polycom
	 * recommends using dial manual and not specifying a call type.
	 * 
	 * @param speed
	 *            Valid data rate for the network.
	 * 
	 * @param dialStr
	 *            Valid ISDN or IP directory number.
	 * 
	 * @return
	 */
	public static String auto(int speed, String dialStr) {
		return "dial auto " + speed + " " + dialStr + delimiter + "dial auto " + speed + " " + dialStr + " ";
	}

	/**
	 * Dials a video call number dialstr1 at speed of type h323 or h320.
	 * Requires the parameters “speed” and “dialstr1”. Use dial manual “speed”
	 * “dialstr” “type” when you do not want automatic call rollover or when the
	 * dialstring might not convey the intended transport (for example, an
	 * extension with an IP gateway might look like an ISDN number, but in fact
	 * corresponds to an IP address).
	 * 
	 * @param speed
	 *            Valid data rate for the network.
	 * 
	 * @param dialStr1
	 *            Valid ISDN or IP directory number.
	 * 
	 * @param dialStr2
	 *            Valid ISDN or IP directory number.
	 * 
	 * @return
	 */
	public static String manual(int speed, String dialStr1, String dialStr2) {
		return "dial manual " + speed + " " + dialStr1 + " " + dialStr2 + delimiter + "dial manual " + speed + " " + dialStr1 + " " + dialStr2 + " ";
	}

	/**
	 * Dials a video call number dialstr1 at speed of type h323 or h320.
	 * Requires the parameters “speed” and “dialstr1”. Use dial manual “speed”
	 * “dialstr” “type” when you do not want automatic call rollover or when the
	 * dialstring might not convey the intended transport (for example, an
	 * extension with an IP gateway might look like an ISDN number, but in fact
	 * corresponds to an IP address).
	 * 
	 * @param speed
	 *            Valid data rate for the network.
	 * 
	 * @param dialStr1
	 *            Valid ISDN or IP directory number.
	 * 
	 * @param dialStr2
	 *            Valid ISDN or IP directory number.
	 * 
	 * @param typeOfCall
	 *            Type of call. Note: The parameters ip and isdn are deprecated.
	 * 
	 *            h323|h320|ip|isdn|sip
	 * 
	 * 
	 * @return
	 */
	public static String manual(int speed, String dialStr1, String dialStr2, String typeOfCall) {
		return "dial manual " + speed + " " + dialStr1 + " " + dialStr2 + " " + typeOfCall + delimiter + "dial manual " + speed + " " + dialStr1 + " " + dialStr2 + " "
				+ typeOfCall + " ";
	}

	/**
	 * Dials an analog phone number.
	 * 
	 * @param dialstring
	 *            Numeric string specifying the phone number to dial. Enclose
	 *            the string in quotation marks if it includes spaces. Example:
	 *            “512 555 1212”
	 * 
	 * @return
	 */
	public static String phone(String dialstring) {
		return "dial phone " + dialstring + delimiter + "dial phone " + dialstring + " ";
	}

	/**
	 * Dials an analog phone number.
	 * 
	 * @param dialPots
	 *            Specify to dial pots, ISDN or SIP call.
	 * 
	 *            pots|isdn_phone|sip_s peakerphone
	 * 
	 * @param dialstring
	 *            Numeric string specifying the phone number to dial. Enclose
	 *            the string in quotation marks if it includes spaces. Example:
	 *            “512 555 1212”
	 * @return
	 */
	public static String phone(String dialPots, String dialstring) {
		return "dial phone " + dialPots + " " + dialstring + delimiter + "dial phone " + dialPots + " " + dialstring + " ";
	}

}

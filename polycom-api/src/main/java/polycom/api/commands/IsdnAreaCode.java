package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ISDN area code or STD code associated with the area where
 * the system is used. This command is only applicable if you have an ISDN
 * network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class IsdnAreaCode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Sets or gets the ISDN area code or STD code associated with the area
	 * where the system is used. This command is only applicable if you have an
	 * ISDN network interface connected to your system.
	 * 
	 * @return
	 */
	public static String get() {
		return "isdnareacode get" + delimiter + "isdnareacode get ";
	}

	/**
	 * Sets the ISDN area code when followed by the “area code” parameter. To
	 * erase the current setting, omit “area code”.
	 * 
	 * @param areaCode
	 *            Numeric value.
	 * 
	 * @return
	 */
	public static String set(int areaCode) {
		return "isdnareacode set " + areaCode + delimiter + "isdnareacode set " + areaCode + " ";
	}
}

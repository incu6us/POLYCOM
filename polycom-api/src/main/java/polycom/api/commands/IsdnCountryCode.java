package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ISDN country code associated with the country where the
 * system is used. This command is only applicable if you have an ISDN network
 * interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class IsdnCountryCode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the country code information.
	 * 
	 * @return
	 */
	public static String get() {
		return "isdncountrycode get" + delimiter + "isdncountrycode get ";
	}

	/**
	 * Sets the ISDN country code when followed by the “country code” parameter.
	 * To erase the current setting, omit “country code”.
	 * 
	 * @param countryCode
	 *            The ISDN country code.
	 * 
	 * @return
	 */
	public static String set(String countryCode) {
		return "isdncountrycode set " + countryCode + delimiter + "isdncountrycode set " + countryCode + " ";
	}
}

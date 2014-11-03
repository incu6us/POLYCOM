package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Global Management System country information
 * 
 * @author vpryimak
 *
 */
public class GmsCountry {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current country setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "gmscountry get" + delimiter + "gmscountry get ";
	}

	/**
	 * Sets the Global Management System country information when followed by
	 * the “countryname” parameter. To erase the current setting, omit
	 * “countryname”.
	 * 
	 * @param countryName
	 *            Character string specifying the country. Enclose the string in
	 *            quotation marks if it includes spaces. Example: “United
	 *            States”
	 * 
	 * @return
	 */
	public static String set(String countryName) {
		return "gmscountry set " + countryName + delimiter + "gmscountry set " + countryName + " ";
	}
}

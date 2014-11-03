package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Polycom Global Management SystemTM city information.
 * 
 * @author vpryimak
 *
 */
public class GmsCity {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "gmscity get" + delimiter + "gmscity get ";
	}

	/**
	 * Sets the Global Management System city name when followed by the “city”
	 * parameter. To erase the current setting, omit “city”.
	 * 
	 * @param city
	 *            Character string specifying the city. Enclose the string in
	 *            quotation marks if it includes spaces. Example: “San Antonio”
	 * 
	 * @return
	 */
	public static String set(String city) {
		return "gmscity set " + city + delimiter + "gmscity set " + city + " ";
	}
}

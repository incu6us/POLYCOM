package polycom.api.commands;

import polycom.api.Constants;

/**
 * Gets and sets the domain used b
 * 
 * @author vpryimak
 *
 */
public class CalendarDomain {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the domain used by the calendaring service.
	 * 
	 * @return
	 */
	public static String get() {
		return "calendardomain get" + delimiter + "calendardomain get ";
	}

	/**
	 * Sets the domain to be used by the calendaring service.
	 * 
	 * @param domainName
	 *            - The domain to be used by the calendaring service.
	 * 
	 * @return
	 */
	public static String set(String domainName) {
		return "calendardomain set " + domainName + delimiter + "calendardomain set " + domainName + " ";
	}
}

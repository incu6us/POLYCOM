package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the system’s H.323 name.
 * 
 * @author vpryimak
 *
 */
public class H323Name {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "h323name get" + delimiter + "h323name get ";
	}

	/**
	 * Sets the H.323 name when followed by the “H.323name” parameter. To erase
	 * this setting, omit the “H.323name” parameter.
	 * 
	 * @param h323Name
	 *            Character string specifying the H.323 name. Use quotation
	 *            marks around strings that contain spaces. For example:
	 *            “Polycom HDX Demo”
	 * 
	 * @return
	 */
	public static String set(String h323Name) {
		return "h323name set " + h323Name + delimiter + "h323name set " + h323Name + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets an H.323 (IP) extension, also known as an E.164 name.
 * 
 * @author vpryimak
 *
 */
public class E164Ext {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "e164ext get" + delimiter + "e164ext get ";
	}

	/**
	 * Sets the E.164 extension when followed by the “e.164name” parameter. To
	 * erase the current setting, omit “e.164name”.
	 * 
	 * @param e164Name
	 *            A valid E.164 extension (usually a four-digit number).
	 * 
	 * 
	 * @return
	 */
	public static String set(String e164Name) {
		return "e164ext set " + e164Name + delimiter + "e164ext set " + e164Name + " ";
	}
}

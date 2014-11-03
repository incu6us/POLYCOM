package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the language that will display on the system.
 * 
 * @author vpryimak
 *
 */
public class Language {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current language used on the system.
	 * 
	 * @return
	 */
	public static String get() {
		return "language get" + delimiter + "language get ";
	}

	/**
	 * Sets the specified language. Requires a language parameter.
	 * 
	 * @param lang
	 *            <arabic|chinese|englishuk|englishus|french|german|
	 *            hungarian|italian|japanese|korean|norwegian|polish|portuguese|
	 *            russian|spanish|traditional_chinese>
	 * 
	 * @return
	 */
	public static String set(String lang) {
		return "language set " + lang + delimiter + "language set " + lang + " ";
	}
}

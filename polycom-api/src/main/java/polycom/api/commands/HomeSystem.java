package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether users are allowed to access the System screen by
 * displaying the System button on the Home screen.
 * 
 * @author vpryimak
 *
 */
public class HomeSystem {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "homesystem get" + delimiter + "homesystem get ";
	}

	/**
	 * Displays the System button on the Home screen.
	 * 
	 * @return
	 */
	public static String yes() {
		return "homesystem yes" + delimiter + "homesystem yes ";
	}

	/**
	 * Removes the System button from the Home screen.
	 * 
	 * @return
	 */
	public static String no() {
		return "homesystem no" + delimiter + "homesystem no ";
	}
}

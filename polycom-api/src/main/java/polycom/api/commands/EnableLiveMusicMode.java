package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Enable Live Music Mode setting.
 * 
 * @author vpryimak
 *
 */
public class EnableLiveMusicMode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "enablelivemusicmode get" + delimiter + "enablelivemusicmode get ";
	}

	/**
	 * Enables live music mode.
	 * 
	 * @return
	 */
	public static String yes() {
		return "enablelivemusicmode yes" + delimiter + "enablelivemusicmode yes ";
	}

	/**
	 * Disables live music mode.
	 * 
	 * @return
	 */
	public static String no() {
		return "enablelivemusicmode no" + delimiter + "enablelivemusicmode no ";
	}
}

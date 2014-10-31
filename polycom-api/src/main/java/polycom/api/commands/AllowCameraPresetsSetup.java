package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether users are allowed to change camera presets.
 * 
 * @author vpryimak
 *
 */
public class AllowCameraPresetsSetup {
	
	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;
	
	/**
	 * Returns the current setting.
	 * 
	 * @return allowcamerapresetssetup yes|no
	 */
	public static String get() {
		return "allowcamerapresetssetup get" + delimiter + "allowcamerapresetssetup get ";
	}

	/**
	 * Allows users to change camera presets.
	 * 
	 * @return allowcamerapresetssetup yes
	 */
	public static String yes() {
		return "allowcamerapresetssetup yes" + delimiter + "allowcamerapresetssetup yes ";
	}

	/**
	 * Prevents users from changing camera presets.
	 * 
	 * @return allowcamerapresetssetup no
	 */
	public static String no() {
		return "allowcamerapresetssetup no" + delimiter + "allowcamerapresetssetup no ";
	}
}

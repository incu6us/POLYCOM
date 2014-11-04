package polycom.api.commands;

import polycom.api.Constants;

/**
 * The rs232 mode command sets or gets the operational mode of the first RS-232
 * port. For systems with two
 * 
 * @author vpryimak
 *
 */
public class Rs232Mode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current mode setting.
	 * 
	 * @return
	 */
	public static String getMode() {
		return "rs232 mode get" + delimiter + "rs232 mode get ";
	}

	/**
	 * Set mode settings.
	 * 
	 * @param mode
	 *            |passthru|control|debug|camera_ptz|closed_caption|
	 *            vortex_mixer|cps|interactive_touch_board|polycom_annotation|
	 *            smartboard|pointmaker
	 * 
	 * @return
	 */
	public static String setMode(String mode) {
		return "rs232 mode " + mode + delimiter + "rs232 mode " + mode + " ";
	}
}

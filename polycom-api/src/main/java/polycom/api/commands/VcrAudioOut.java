package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enables, disables, or gets the VCR Audio Out Always On setting.
 * 
 * @author vpryimak
 *
 */
public class VcrAudioOut {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "vcraudioout get" + delimiter + "vcraudioout get ";
	}

	/**
	 * Enables VCR Audio Out Always On.
	 * 
	 * @return
	 */
	public static String yes() {
		return "vcraudioout yes" + delimiter + "vcraudioout yes ";
	}

	/**
	 * Disables VCR Audio Out Always On.
	 * 
	 * @return
	 */
	public static String no() {
		return "vcraudioout no" + delimiter + "vcraudioout no ";
	}
}

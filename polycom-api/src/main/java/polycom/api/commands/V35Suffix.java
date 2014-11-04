package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the V.35 dialing suffix. It assumes that a profile has already
 * been selected.
 * 
 * @author vpryimak
 *
 */
public class V35Suffix {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting for valid speed.
	 * 
	 * @param validSpeed
	 * @return
	 */
	public static String get(int validSpeed) {
		return "v35suffix get " + validSpeed + delimiter + "v35suffix get " + validSpeed + " ";
	}

	/**
	 * Sets the dialing suffix when followed by a “value” parameter. To erase
	 * the current setting, omit the “value” parameter.
	 * 
	 * @param validSpeed
	 *            Valid speeds are 56, 64, 2x56, 112, 2x64, 128, 168, 192, 224,
	 *            256, 280, 320, 336, 384, 392, 7x64, 504, 512, 560, 576, 616,
	 *            640, 672, 704, 728, 768, 784, 832, 840, 14x64, 952, 960, 1008,
	 *            1024, 1064, 1088, 1120, 1152, 1176, 1216, 1232, 1280, 1288,
	 *            21x64, 1400, 1408, 1456, 1472, 1512, 1536, 1568, 1600, 1624,
	 *            1664, 1680, 1728, 28x64, 1856, 1920, all. The parameter “all”
	 *            lists all the available speeds and their associated dialing
	 *            prefixes.
	 * 
	 * @return
	 */
	public static String set(int validSpeed) {
		return "v35suffix set " + validSpeed + delimiter + "v35suffix set " + validSpeed + " ";
	}

	/**
	 * Sets the dialing suffix when followed by a “value” parameter. To erase
	 * the current setting, omit the “value” parameter.
	 * 
	 * @param validSpeed
	 *            Valid speeds are 56, 64, 2x56, 112, 2x64, 128, 168, 192, 224,
	 *            256, 280, 320, 336, 384, 392, 7x64, 504, 512, 560, 576, 616,
	 *            640, 672, 704, 728, 768, 784, 832, 840, 14x64, 952, 960, 1008,
	 *            1024, 1064, 1088, 1120, 1152, 1176, 1216, 1232, 1280, 1288,
	 *            21x64, 1400, 1408, 1456, 1472, 1512, 1536, 1568, 1600, 1624,
	 *            1664, 1680, 1728, 28x64, 1856, 1920, all. The parameter “all”
	 *            lists all the available speeds and their associated dialing
	 *            prefixes.
	 * 
	 * @param value
	 *            The dialing suffix, which is a function of your DCE. Consult
	 *            the DCE user guide for information.
	 * 
	 * @return
	 */
	public static String set(int validSpeed, String value) {
		return "v35suffix set " + validSpeed + " " + value + delimiter + "v35suffix set " + validSpeed + " " + value + " ";
	}
}

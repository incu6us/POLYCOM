package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the gateway prefixes for the corresponding speeds.
 * 
 * @author vpryimak
 *
 */
public class GatewaySuffix {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current value for this speed.
	 * 
	 * @param validSpeed
	 *            Valid speeds are: 56, 64, 2x56, 112, 2x64, 128, 168, 192, 224,
	 *            256, 280, 320, 336, 384, 392, 7x64, 8x56, 504, 512, 560, 576,
	 *            616, 640, 672, 704, 728, 768, 784, 832, 840, 16x56, 14x64,
	 *            952, 960, 1008, 1024, 1064, 1088, 1120, 1152, 1176, 1216,
	 *            1232, 1280, 1288, 24x56, 21x64, 1400, 1408, 1456, 1472, 1512,
	 *            1536, 1568, 1600, 1624, 1664, 1680, 1728, 1736, 32x56, 28x64,
	 *            1848, 1856, 1904, and 1920 kbps.
	 * 
	 * @return
	 */
	public static String get(String validSpeed) {
		return "gatewaysuffix get " + validSpeed + delimiter + "gatewaysuffix get " + validSpeed + " ";
	}

	/**
	 * Sets the gateway suffix when followed by the “value” parameter. To erase
	 * the current setting, omit “value”.
	 * 
	 * @param validSpeed
	 *            Valid speeds are: 56, 64, 2x56, 112, 2x64, 128, 168, 192, 224,
	 *            256, 280, 320, 336, 384, 392, 7x64, 8x56, 504, 512, 560, 576,
	 *            616, 640, 672, 704, 728, 768, 784, 832, 840, 16x56, 14x64,
	 *            952, 960, 1008, 1024, 1064, 1088, 1120, 1152, 1176, 1216,
	 *            1232, 1280, 1288, 24x56, 21x64, 1400, 1408, 1456, 1472, 1512,
	 *            1536, 1568, 1600, 1624, 1664, 1680, 1728, 1736, 32x56, 28x64,
	 *            1848, 1856, 1904, and 1920 kbps.
	 * 
	 * @value Suffix (code) used for a particular call speed. Consult your
	 *        gateway instruction manual to determine which codes are
	 *        appropriate. Use quotation marks around a compound name or strings
	 *        that contain spaces. For example: “united states” or “111 222
	 *        333”.
	 * 
	 * 
	 * @return
	 */
	public static String set(String validSpeed, String value) {
		return "gatewaysuffix set " + validSpeed + " " + value + delimiter + "gatewaysuffix set " + validSpeed + " " + value + " ";
	}
}

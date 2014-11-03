package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the valid IP dialing speed, and enables or disables the
 * specified speed.
 * 
 * @author vpryimak
 *
 */
public class IpDialSpeed {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting. The parameter “valid speed” is required.
	 * 
	 * @param validSpeed
	 *            Valid speeds are: 56, 64, 2x56, 112, 2x64, 128, 168, 192, 224,
	 *            256, 280, 320, 336, 384, 392, 7x64, 504, 512, 560, 576, 616,
	 *            640, 672, 704, 728, 768, 784, 832, 840, 14x64, 952, 960, 1008,
	 *            1024, 1064, 1088, 1120, 1152, 1176, 1216, 1232, 1280, 1288,
	 *            21x64, 1400, 1408, 1456, 1472, 1512, 1536, 1568, 1600, 1624,
	 *            1664, 1680, 1728, 1792, 1856, 1920, 1960, 1984, 2016, 2048,
	 *            2304, 2560, 2816, 3072, 3328, 3584, 3840, and 4096 kbps.
	 * 
	 * @return
	 */
	public static String get(String validSpeed) {
		return "ipdialspeed get " + validSpeed + delimiter + "ipdialspeed get " + validSpeed + " ";
	}

	/**
	 * Enables the specified speed.
	 * 
	 * @param validSpeed
	 *            Valid speeds are: 56, 64, 2x56, 112, 2x64, 128, 168, 192, 224,
	 *            256, 280, 320, 336, 384, 392, 7x64, 504, 512, 560, 576, 616,
	 *            640, 672, 704, 728, 768, 784, 832, 840, 14x64, 952, 960, 1008,
	 *            1024, 1064, 1088, 1120, 1152, 1176, 1216, 1232, 1280, 1288,
	 *            21x64, 1400, 1408, 1456, 1472, 1512, 1536, 1568, 1600, 1624,
	 *            1664, 1680, 1728, 1792, 1856, 1920, 1960, 1984, 2016, 2048,
	 *            2304, 2560, 2816, 3072, 3328, 3584, 3840, and 4096 kbps.
	 * 
	 * @return
	 */
	public static String on(String validSpeed) {
		return "ipdialspeed set " + validSpeed + " on" + delimiter + "ipdialspeed set " + validSpeed + " on ";
	}

	/**
	 * Disables the specified speed.
	 * 
	 * @param validSpeed
	 *            Valid speeds are: 56, 64, 2x56, 112, 2x64, 128, 168, 192, 224,
	 *            256, 280, 320, 336, 384, 392, 7x64, 504, 512, 560, 576, 616,
	 *            640, 672, 704, 728, 768, 784, 832, 840, 14x64, 952, 960, 1008,
	 *            1024, 1064, 1088, 1120, 1152, 1176, 1216, 1232, 1280, 1288,
	 *            21x64, 1400, 1408, 1456, 1472, 1512, 1536, 1568, 1600, 1624,
	 *            1664, 1680, 1728, 1792, 1856, 1920, 1960, 1984, 2016, 2048,
	 *            2304, 2560, 2816, 3072, 3328, 3584, 3840, and 4096 kbps.
	 * 
	 * @return
	 */
	public static String off(String validSpeed) {
		return "ipdialspeed set " + validSpeed + " off" + delimiter + "ipdialspeed set " + validSpeed + " off ";
	}
}

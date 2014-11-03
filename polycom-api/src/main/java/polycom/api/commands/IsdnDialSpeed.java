package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the valid dialing speed of the ISDN network interface. This
 * command only applies if an ISDN network interface is connected to a system.
 * 
 * @author vpryimak
 *
 */
public class IsdnDialSpeed {

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
	 *            1664, 1680, 1728, 1792, 1856, and 1920 kbps. Note: The highest
	 *            speed for BRI systems is 512 kbps, the highest speed for T1
	 *            systems is 1472 kbps, and the highest speed for E1 systems is
	 *            1920 kbps.
	 * 
	 * @return
	 */
	public static String get(String validSpeed) {
		return "isdndialspeed get " + validSpeed + delimiter + "isdndialspeed get " + validSpeed + " ";
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
	 *            1664, 1680, 1728, 1792, 1856, and 1920 kbps. Note: The highest
	 *            speed for BRI systems is 512 kbps, the highest speed for T1
	 *            systems is 1472 kbps, and the highest speed for E1 systems is
	 *            1920 kbps.
	 * 
	 * @return
	 */
	public static String on(String validSpeed) {
		return "isdndialspeed set " + validSpeed + " on" + delimiter + "isdndialspeed set " + validSpeed + " on ";
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
	 *            1664, 1680, 1728, 1792, 1856, and 1920 kbps. Note: The highest
	 *            speed for BRI systems is 512 kbps, the highest speed for T1
	 *            systems is 1472 kbps, and the highest speed for E1 systems is
	 *            1920 kbps.
	 * 
	 * @return
	 */
	public static String off(String validSpeed) {
		return "isdndialspeed set " + validSpeed + " off" + delimiter + "isdndialspeed set " + validSpeed + " off ";
	}
}

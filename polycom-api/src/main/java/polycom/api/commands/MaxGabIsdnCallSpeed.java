package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the maximum speed for ISDN (H.320) calls made from the global
 * directory. This command is only applicable if you have an ISDN network
 * interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class MaxGabIsdnCallSpeed {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current valid speed.
	 * 
	 * @return
	 */
	public static String get() {
		return "maxgabisdncallspeed get" + delimiter + "maxgabisdncallspeed get ";
	}

	/**
	 * Sets the maximum speed for ISDN calls when followed by a valid speed
	 * value.
	 * 
	 * @param validSpeed
	 *            Valid speeds are: 56, 64, 128, 256, 384, 512, 768, 1024, and
	 *            1472 kbps.
	 * 
	 * @return
	 */
	public static String set(String validSpeed) {
		return "maxgabisdncallspeed set " + validSpeed + delimiter + "maxgabisdncallspeed set " + validSpeed + " ";
	}
}

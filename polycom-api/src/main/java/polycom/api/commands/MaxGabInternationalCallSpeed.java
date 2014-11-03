package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the maximum speed for international ISDN calls made from the
 * global directory. This command is only applicable if you have an ISDN network
 * interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class MaxGabInternationalCallSpeed {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current valid speed.
	 * 
	 * @return
	 */
	public static String get() {
		return "maxgabinternationalcallspeed get" + delimiter + "maxgabinternationalcallspeed get ";
	}

	/**
	 * Sets the maximum speed for international calls when followed by a valid
	 * speed value.
	 * 
	 * @param validSpeed
	 *            Valid speeds are: 2x64, 128, 256, 384, 512, 768, 1024, and
	 *            1472 kbps.
	 * 
	 * @return
	 */
	public static String set(String validSpeed) {
		return "maxgabinternationalcallspeed set " + validSpeed + delimiter + "maxgabinternationalcallspeed set " + validSpeed + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the maximum speed for Internet (IP/H.323) calls made from the
 * global directory.
 * 
 * @author vpryimak
 *
 */
public class MaxGabInternetCallSpeed {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current valid speed.
	 * 
	 * @return
	 */
	public static String get() {
		return "maxgabinternetcallspeed get" + delimiter + "maxgabinternetcallspeed get ";
	}

	/**
	 * Sets the maximum speed for Internet calls when followed by a valid speed
	 * value.
	 * 
	 * @param validSpeed
	 *            Valid speeds are: 128, 256, 384, 512, 768, 1024, and 1472
	 *            kbps.
	 * 
	 * @return
	 */
	public static String set(String validSpeed) {
		return "maxgabinternetcallspeed set " + validSpeed + delimiter + "maxgabinternetcallspeed set " + validSpeed + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Flashes the analog phone call.
 * 
 * @author vpryimak
 *
 */
public class Flash {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * @param clid
	 *            Specifies the callid to flash.
	 * @return
	 */
	public static String setflash(String clid) {
		return "flash " + clid + delimiter + "flash " + clid + " ";
	}

	/**
	 * 
	 * @param clid
	 *            Specifies the callid to flash.
	 * 
	 * @param duration
	 *            Specifies the pulse duration in ms.
	 * 
	 * @return
	 */
	public static String setflash(String clid, int duration) {
		return "flash " + clid + " " + duration + delimiter + "flash " + clid + " " + duration + " ";
	}
}

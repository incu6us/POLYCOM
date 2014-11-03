package polycom.api.commands;

import polycom.api.Constants;

/**
 * Hangs up the current video or phone call.
 * 
 * @author vpryimak
 *
 */
public class Hangup {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Disconnects the current analog phone (audio-only) site.
	 * 
	 * @return
	 */
	public static String phone() {
		return "hangup phone" + delimiter + "hangup phone ";
	}

	/**
	 * Disconnects the current video call. If the “callid” parameter is omitted,
	 * the system disconnects all video far sites in the call.
	 * 
	 * @param clid
	 * @return
	 */
	public static String video(String clid) {
		return "hangup video " + clid + delimiter + "hangup video " + clid + " ";
	}

	/**
	 * Disconnects all video and audio sites in the call.
	 * 
	 * @return
	 */
	public static String all() {
		return "hangup all" + delimiter + "hangup all ";
	}
}

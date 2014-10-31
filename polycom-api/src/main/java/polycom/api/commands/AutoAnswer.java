package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Auto Answer Point-to-Point Video mode, which determines how
 * the system will handle an incoming call in a point-to-point video conference.
 * 
 * @author vpryimak
 *
 */
public class AutoAnswer {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "autoanswer get" + delimiter + "autoanswer get ";
	}

	/**
	 * Allows any incoming video call to be connected automatically. This is the
	 * default setting.
	 * 
	 * @return
	 */
	public static String yes() {
		return "autoanswer yes" + delimiter + "autoanswer yes ";
	}

	/**
	 * Prompts the user to answer incoming video calls.
	 * 
	 * @return
	 */
	public static String no() {
		return "autoanswer no" + delimiter + "autoanswer no ";
	}

	/**
	 * Notifies the user of incoming calls, but does not connect the call. The
	 * site that placed the call receives a Far Site Busy (H.320) or Call
	 * Rejected (H.323) code.
	 * 
	 * @return
	 */
	public static String donotdisturb() {
		return "autoanswer donotdisturb" + delimiter + "autoanswer donotdisturb ";
	}
}

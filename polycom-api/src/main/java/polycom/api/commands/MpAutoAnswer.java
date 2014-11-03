package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Auto Answer Multipoint Video mode, which determines how the
 * system will handle an incoming call in a multipoint video conference.
 * 
 * @author vpryimak
 *
 */
public class MpAutoAnswer {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "mpautoanswer get" + delimiter + "mpautoanswer get ";
	}

	/**
	 * Connects incoming video calls automatically. The screen will split into a
	 * multipoint call progress screen as the incoming call is answered.
	 * 
	 * @return
	 */
	public static String yes() {
		return "mpautoanswer yes" + delimiter + "mpautoanswer yes ";
	}

	/**
	 * For an incoming video call, the user will be notified and given the
	 * choice to answer the call. If the user selects Yes, the call is added to
	 * the ongoing conference. If the user selects No, the call is rejected. The
	 * default is No.
	 * 
	 * @return
	 */
	public static String no() {
		return "mpautoanswer no" + delimiter + "mpautoanswer no ";
	}

	/**
	 * The user is not notified of incoming video calls. The sites that placed
	 * the calls receive a Far Site Busy (H.320) or Call Rejected (H.323) code.
	 * 
	 * @return
	 */
	public static String donotdisturb() {
		return "mpautoanswer donotdisturb" + delimiter + "mpautoanswer donotdisturb ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Answers incoming video or phone calls (analog voice or ISDN voice).
 * 
 * @author vpryimak
 *
 */
public class Answer {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Answers incoming video calls when Auto Answer Point-to-Point Video or
	 * Auto Answer Multipoint Video is set to No.
	 * 
	 * @return
	 */
	public static String video() {
		return "answer video" + delimiter + "answer video ";
	}

	/**
	 * Answers incoming analog phone or ISDN voice calls.
	 * 
	 * @return
	 */
	public static String phone() {
		return "answer phone" + delimiter + "answer phone ";
	}
}

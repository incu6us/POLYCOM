package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the video call order of the specified protocol to the specified slot.
 * 
 * @author vpryimak
 *
 */
public class VideoCallOrder {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * 
	 * @param order
	 *            1|2|3|4 - Sets the order in which the specified protocol is
	 *            attempted when a video call is placed.
	 * 
	 * @return
	 */
	public static String isdn(int order) {
		return "videocallorder isdn " + order + delimiter + "videocallorder isdn " + order + " ";
	}

	/**
	 * Specifies IP protocol.
	 * 
	 * @param order
	 *            1|2|3|4 - Sets the order in which the specified protocol is
	 *            attempted when a video call is placed.
	 * @return
	 */
	public static String h323(int order) {
		return "videocallorder h323 " + order + delimiter + "videocallorder h323 " + order + " ";
	}

	/**
	 * Specifies SIP protocol.
	 * 
	 * @param order
	 *            1|2|3|4 - Sets the order in which the specified protocol is
	 *            attempted when a video call is placed.
	 * @return
	 */
	public static String sip(int order) {
		return "videocallorder sip " + order + delimiter + "videocallorder sip " + order + " ";
	}

	/**
	 * Specifies H.323 gateway calling.
	 * 
	 * @param order
	 *            1|2|3|4 - Sets the order in which the specified protocol is
	 *            attempted when a video call is placed.
	 * @return
	 */
	public static String gateway323(int order) {
		return "videocallorder gateway323 " + order + delimiter + "videocallorder gateway323 " + order + " ";
	}
}

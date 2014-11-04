package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the voice call order of the specified protocol to the specified slot.
 * 
 * @author vpryimak
 *
 */
public class VoiceCallOrder {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Specifies ISDN phone line.
	 * 
	 * @param order
	 *            1|2 - Sets the order in which the specified method is
	 *            attempted when a voice call is placed. Positions 1-2 are
	 *            relative and are shown as 3-4 in the user interface if video
	 *            protocols are enabled.
	 * 
	 * @return
	 */
	public static String isdnPhone(int order) {
		return "voicecallorder isdn_phone " + order + delimiter + "voicecallorder isdn_phone " + order + " ";
	}

	/**
	 * Specifies analog phone line.
	 * 
	 * @param order
	 *            1|2 -Sets the order in which the specified method is attempted
	 *            when a voice call is placed. Positions 1-2 are relative and
	 *            are shown as 3-4 in the user interface if video protocols are
	 *            enabled.
	 * 
	 * @return
	 */
	public static String pots(int order) {
		return "voicecallorder pots " + order + delimiter + "voicecallorder pots " + order + " ";
	}
}

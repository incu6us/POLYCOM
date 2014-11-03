package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the system’s ability to generate a Destination Unreachable ICMP
 * message in response to a packet that cannot be delivered to its destination
 * for reasons other than congestion.
 * 
 * @author vpryimak
 *
 */
public class DestUnreachableTx {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "destunreachabletx get" + delimiter + "destunreachabletx get ";
	}

	/**
	 * Enables the system’s ability to generate a destination unreachable ICMP
	 * message in response to a packet that cannot be delivered to its
	 * destination for reasons other than congestion.
	 * 
	 * @return
	 */
	public static String yes() {
		return "destunreachabletx yes" + delimiter + "destunreachabletx yes ";
	}

	/**
	 * Disables the system’s ability to generate a destination unreachable ICMP
	 * message in response to a packet that cannot be delivered to its
	 * destination for reasons other than congestion.
	 * 
	 * @return
	 */
	public static String no() {
		return "destunreachabletx no" + delimiter + "destunreachabletx no ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the system’s ability to send an Echo Reply message in response
 * to an Echo Request message sent to an IPv6 multicast/anycast address.
 * 
 * @author vpryimak
 *
 */
public class EchoReply {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "echoreply get" + delimiter + "echoreply get ";
	}

	/**
	 * Enables the echo reply option.
	 * 
	 * @return
	 */
	public static String yes() {
		return "echoreply yes" + delimiter + "echoreply yes ";
	}

	/**
	 * Disables the echo reply option.
	 * 
	 * @return
	 */
	public static String no() {
		return "echoreply no" + delimiter + "echoreply no ";
	}
}

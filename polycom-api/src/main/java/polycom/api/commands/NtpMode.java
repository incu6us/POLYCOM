package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the mode of the system’s Network Time Protocol (NTP) server. NTP
 * server time is used to ensure synchronized time data in the local Call Detail
 * Report.
 * 
 * @author vpryimak
 *
 */
public class NtpMode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current time server mode.
	 * 
	 * @return
	 */
	public static String get() {
		return "ntpmode get" + delimiter + "ntpmode get ";
	}

	/**
	 * Automatically selects an NTP server from the Internet.
	 * 
	 * @return
	 */
	public static String auto() {
		return "ntpmode auto" + delimiter + "ntpmode auto ";
	}

	/**
	 * Turns off the use of an NTP server.
	 * 
	 * @return
	 */
	public static String off() {
		return "ntpmode off" + delimiter + "ntpmode off ";
	}

	/**
	 * Lets you specify a server using the ntpserver command on page 4-254.
	 * 
	 * @return
	 */
	public static String manual() {
		return "ntpmode manual" + delimiter + "ntpmode manual ";
	}
}

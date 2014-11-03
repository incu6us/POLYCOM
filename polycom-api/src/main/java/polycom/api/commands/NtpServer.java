package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets an Network Time Protocol (NTP) server, using the IP address or
 * the DNS name of the server.
 * 
 * @author vpryimak
 *
 */
public class NtpServer {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Gets the IP address of the secondary NTP server.
	 * 
	 * @return
	 */
	public static String get() {
		return "ntpserver get" + delimiter + "ntpserver get ";
	}

	/**
	 * Sets the IP address of the secondary NTP server when followed by a valid
	 * parameter. To erase the current setting, omit the
	 * ["xxx.xxx.xxx.xxx"|"server name"] parameter.
	 * 
	 * @param ntpServerAddr
	 *            The IP or DNS name of the secondary NTP server.
	 * 
	 * @return
	 */
	public static String set(String ntpServerAddr) {
		return "ntpserver set " + ntpServerAddr + delimiter + "ntpserver set " + ntpServerAddr + " ";
	}
}

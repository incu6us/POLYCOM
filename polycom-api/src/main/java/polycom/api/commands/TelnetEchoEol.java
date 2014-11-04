package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the echo end-of-line (EOL) characters to the default values of either
 * the API echo or the serial port echo.
 * 
 * @author vpryimak
 *
 */
public class TelnetEchoEol {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting for the end of line echo characters.
	 * 
	 * @return
	 */
	public static String get() {
		return "telnetechoeol get" + delimiter + "telnetechoeol get ";
	}

	/**
	 * Sets the echo EOL characters to <CR><LF>.
	 * 
	 * @return
	 */
	public static String crnl() {
		return "telnetechoeol crnl" + delimiter + "telnetechoeol crnl ";
	}

	/**
	 * Sets the echo EOL characters to <LF><CR>
	 * 
	 * @return
	 */
	public static String nlcr() {
		return "telnetechoeol nlcr" + delimiter + "telnetechoeol nlcr ";
	}
}

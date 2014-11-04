package polycom.api.commands;

import polycom.api.Constants;

/**
 * The rs232 baud command sets or gets the baud rate for the first RS-232 port.
 * For systems with two
 * 
 * @author vpryimak
 *
 */
public class Rs232Baud {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current baud rate setting.
	 * 
	 * @return
	 */
	public static String getBaud() {
		return "rs232 baud get" + delimiter + "rs232 baud get ";
	}

	/**
	 * Sets the RS-232 port to this baud rate.
	 * 
	 * @param baudRate
	 *            9600|14400|19200| 38400|57600|115200
	 * 
	 * @return
	 */
	public static String setBaud(int baudRate) {
		return "rs232 baud " + baudRate + delimiter + "rs232 baud " + baudRate + " ";
	}
}

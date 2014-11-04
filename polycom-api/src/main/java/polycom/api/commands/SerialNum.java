package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns the serial number of the system.
 * 
 * @author vpryimak
 *
 */
public class SerialNum {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String getNumber() {
		return "serialnum" + delimiter + "serialnum ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enters and sends the MCU password to the MCU.
 * 
 * @author vpryimak
 *
 */
public class McuPassword {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Specifies the password to send to the MCU.
	 * 
	 * @param passwd
	 * @return
	 */
	public static String setPasswd(String passwd) {
		return "mcupassword set " + passwd + delimiter + "mcupassword set " + passwd + " ";
	}
}

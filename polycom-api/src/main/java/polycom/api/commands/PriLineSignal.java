package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the PRI line signal.
 * 
 * @author vpryimak
 *
 */
public class PriLineSignal {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current PRI line signal setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "prilinesignal get" + delimiter + "prilinesignal get ";
	}

	/**
	 * Sets the PRI line signal. It requires one of the following parameters:
	 * esf/b8zs, crc4/hdb3, hdb3
	 * 
	 * @param signalEncoding
	 *            esf/b8zs - A method of signal encoding used with a T1
	 *            interface. This is the only choice for T1. This value actually
	 *            chooses both a framing format and an encoding method. Legacy
	 *            frame formats, such as D4, are not supported. In addition,
	 *            older encoding methods, such as B7ZS, are not supported.
	 * 
	 *            crc4/hdb3 - A method of signal encoding used with an E1
	 *            interface. This is the default value. Data is encoded using
	 *            HDB3 to ensure proper one-density, and CRC4 error checking is
	 *            enabled on both transmit and receive.
	 * 
	 *            hdb3 - A method of signal encoding used with an E1 interface.
	 *            CRC4 error checking is disabled.
	 * 
	 * @return
	 */
	public static String set(String signalEncoding) {
		return "prilinesignal set " + signalEncoding + delimiter + "prilinesignal set " + signalEncoding + " ";
	}
}

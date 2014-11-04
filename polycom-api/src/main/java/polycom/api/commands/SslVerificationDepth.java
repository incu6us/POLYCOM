package polycom.api.commands;

import polycom.api.Constants;

/**
 * Specifies how many links a certificate chain can have.
 * 
 * @author vpryimak
 *
 */
public class SslVerificationDepth {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "sslverificationdepth get" + delimiter + "sslverificationdepth get ";
	}

	/**
	 * Sets the number of links a certificate chain can have. Valid values are
	 * {0..12}.
	 * 
	 * @param value
	 * @return
	 */
	public static String set(int value) {
		return "sslverificationdepth set " + value + delimiter + "sslverificationdepth set " + value + " ";
	}
}

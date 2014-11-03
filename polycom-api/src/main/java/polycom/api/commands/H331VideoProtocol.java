package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the H.331 video protocol sent during H.331 calls. This command
 * is only applicable if you have a V.35 network interface connected to your
 * system.
 * 
 * @author vpryimak
 *
 */
public class H331VideoProtocol {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "h331videoprotocol get" + delimiter + "h331videoprotocol get ";
	}

	/**
	 * Sets the video protocol to this value for H.331 calls.
	 * 
	 * @param format
	 *            h264|h263+|h263|h261
	 * 
	 * @return
	 */
	public static String set(String format) {
		return "h331videoprotocol " + format + delimiter + "h331videoprotocol " + format;
	}
}

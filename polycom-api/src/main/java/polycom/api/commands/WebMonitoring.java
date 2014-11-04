package polycom.api.commands;

import polycom.api.Constants;

/**
 * Enables or disables the ability to view video from a Polycom HDX system via
 * the web interface. This command is available in serial API sessions only.
 * 
 * @author vpryimak
 *
 */
public class WebMonitoring {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Allows Polycom HDX video to be viewed via the web interface.
	 * 
	 * @param currecntRemotePassword
	 *            Current remote access password.
	 * 
	 * @return
	 */
	public static String yes(String currecntRemotePassword) {
		return "webmonitoring " + currecntRemotePassword + " yes" + delimiter + "webmonitoring " + currecntRemotePassword + " yes ";
	}

	/**
	 * Disables Polycom HDX video from being viewed via the web interface.
	 * 
	 * @param currecntRemotePassword
	 *            Current remote access password.
	 * 
	 * @return
	 */
	public static String no(String currecntRemotePassword) {
		return "webmonitoring " + currecntRemotePassword + " no" + delimiter + "webmonitoring " + currecntRemotePassword + " no ";
	}
}

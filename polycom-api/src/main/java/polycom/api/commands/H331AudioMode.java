package polycom.api.commands;

import polycom.api.Constants;

/**
 * Set or gets the audio protocol sent during H.331 calls. This command is only
 * applicable if you have a V.35 network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class H331AudioMode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "h331audiomode get" + delimiter + "h331audiomode get ";
	}

	/**
	 * Sets the audio protocol to this value for H.331 calls.
	 * 
	 * @param audioMode
	 *            g729|g728|g711u| g711a|g722-56| g722-48|g7221-16|
	 *            g7221-24|g7221-32| siren14| siren14stereo
	 * 
	 * @return
	 */
	public static String set(String audioMode) {
		return "h331audiomode '" + audioMode + "'" + delimiter + "h331audiomode get '" + audioMode + "' ";
	}

	/**
	 * Turns audio mode off for H.331 calls.
	 * 
	 * @return
	 */
	public static String off() {
		return "h331audiomode off" + delimiter + "h331audiomode off ";
	}
}

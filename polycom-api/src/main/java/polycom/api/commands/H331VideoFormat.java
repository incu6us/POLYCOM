package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the video format for H.331 calls. This command is only
 * applicable if you have a V.35 network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class H331VideoFormat {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "h331videoformat get" + delimiter + "h331videoformat get ";
	}

	/**
	 * Sets the video format to FCIF for H.331 calls.
	 * 
	 * @return
	 */
	public static String fcif() {
		return "h331videoformat fcif" + delimiter + "h331videoformat fcif ";
	}
}

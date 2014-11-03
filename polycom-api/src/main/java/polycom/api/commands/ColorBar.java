package polycom.api.commands;

import polycom.api.Constants;

/**
 * Turns the video diagnostics color bars on or off.
 * 
 * @author vpryimak
 *
 */
public class ColorBar {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Turns on the color bar test pattern.
	 * 
	 * @return
	 */
	public static String on() {
		return "colorbar on" + delimiter + "colorbar on ";
	}

	/**
	 * Turns off the color bar test pattern.
	 * 
	 * @return
	 */
	public static String off() {
		return "colorbar off" + delimiter + "colorbar off ";
	}
}

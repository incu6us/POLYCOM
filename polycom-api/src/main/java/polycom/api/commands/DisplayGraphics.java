package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the display of graphic icons while in a call.
 * 
 * @author vpryimak
 *
 */
public class DisplayGraphics {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "displaygraphics get" + delimiter + "displaygraphics get ";
	}

	/**
	 * Enables the display of graphic icons.
	 * 
	 * @return
	 */
	public static String yes() {
		return "displaygraphics yes" + delimiter + "displaygraphics yes ";
	}

	/**
	 * Disables the display of graphic icons.
	 * 
	 * @return
	 */
	public static String no() {
		return "displaygraphics no" + delimiter + "displaygraphics no ";
	}
}

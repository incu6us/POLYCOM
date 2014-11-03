package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Enable Keyboard Noise Reduction setting.
 * 
 * @author vpryimak
 *
 */
public class EnableKeyboardNoiseReduction {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "enablekeyboardnoisereduction get" + delimiter + "enablekeyboardnoisereduction get ";
	}

	/**
	 * Enables keyboard noise reduction.
	 * 
	 * @return
	 */
	public static String yes() {
		return "enablekeyboardnoisereduction yes" + delimiter + "enablekeyboardnoisereduction yes ";
	}

	/**
	 * Disables keyboard noise reduction.
	 * 
	 * @return
	 */
	public static String no() {
		return "enablekeyboardnoisereduction no" + delimiter + "enablekeyboardnoisereduction no ";
	}
}

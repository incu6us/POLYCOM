package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the camera pan direction.
 * 
 * @author vpryimak
 *
 */
public class CameraDirection {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "cameradirection get" + delimiter + "cameradirection get ";
	}

	/**
	 * Sets the direction of the camera to normal; the camera moves in the same
	 * direction as the left/right arrows on the remote control.
	 * 
	 * @return
	 */
	public static String normal() {
		return "cameradirection normal" + delimiter + "cameradirection normal ";
	}

	/**
	 * Sets the direction of the camera to reversed; the camera moves in the
	 * opposite direction of the left/right arrows on the remote control.
	 * 
	 * @return
	 */
	public static String reversed() {
		return "cameradirection reversed" + delimiter + "cameradirection reversed ";
	}
}

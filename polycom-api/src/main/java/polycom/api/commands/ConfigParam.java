package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the video quality setting for the specified video input for
 * motion or sharpness.
 * 
 * @author vpryimak
 *
 */
public class ConfigParam {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Sets or gets the video quality setting for the specified video input for
	 * motion or for sharpness (for images without motion).
	 * 
	 * @param param
	 *            camera_video_quality <1|2|3|4>
	 * 
	 *            possible values: motion|sharpness
	 * 
	 * @return
	 */
	public static String get(String param) {
		return "configparam " + param + " get" + delimiter + "configparam " + param + " get ";
	}

	/**
	 * Sets or gets the video quality setting for the specified video input for
	 * motion or for sharpness (for images without motion).
	 * 
	 * @param param
	 *            camera_video_quality <1|2|3|4>
	 * 
	 *            possible values: motion|sharpness
	 * 
	 * @param param
	 * @param value
	 * @return
	 */
	public static String set(String param, String value) {
		return "configparam " + param + " set " + value + delimiter + "configparam " + param + " set " + value + " ";
	}
}

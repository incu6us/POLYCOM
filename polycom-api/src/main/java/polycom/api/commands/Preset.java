package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets the presets or goes (moves) to the presets for the near or far camera
 * source. Also registers or unregisters the API session to give notification
 * when the user sets or goes to presets.
 * 
 * @author vpryimak
 *
 */
public class Preset {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Registers the system to give notification when the user or far site sets
	 * or goes to a preset. Returns the current preset registration state when
	 * followed by the get parameter.
	 * 
	 * @return
	 */
	public static String register() {
		return "preset register" + delimiter + "preset register ";
	}

	/**
	 * Disables register mode.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "preset unregister" + delimiter + "preset unregister ";
	}

	/**
	 * @return
	 */
	public static String registerGet() {
		return "preset register get" + delimiter + "preset register get ";
	}

	/**
	 * Specifies the far camera. Requires a set or go parameter and a preset
	 * identifier.
	 * 
	 * Moves the camera to a camera preset. Requires a “preset” parameter.
	 * 
	 * 
	 * @param id
	 *            Camera preset identifier. Must be an integer in the range
	 *            {0..15} for a far-site camera or {0..99} for a near-site
	 *            camera.
	 * 
	 * @return
	 */
	public static String farGo(int id) {
		return "preset far go " + id + delimiter + "preset far go " + id + " ";
	}

	/**
	 * Specifies the far camera. Requires a set or go parameter and a preset
	 * identifier.
	 * 
	 * Sets a camera preset. Requires a “preset” parameter.
	 * 
	 * @param id
	 *            Camera preset identifier. Must be an integer in the range
	 *            {0..15} for a far-site camera or {0..99} for a near-site
	 *            camera.
	 * 
	 * @return
	 */
	public static String farSet(int id) {
		return "preset far set " + id + delimiter + "preset far set " + id + " ";
	}

	/**
	 * Specifies the near camera. Requires a set or go parameter and a preset
	 * identifier.
	 * 
	 * Moves the camera to a camera preset. Requires a “preset” parameter.
	 * 
	 * @param id
	 *            Camera preset identifier. Must be an integer in the range
	 *            {0..15} for a far-site camera or {0..99} for a near-site
	 *            camera.
	 * 
	 * @return
	 */
	public static String nearGo(int id) {
		return "preset near go " + id + delimiter + "preset near go " + id + " ";
	}

	/**
	 * Specifies the near camera. Requires a set or go parameter and a preset
	 * identifier.
	 * 
	 * Sets a camera preset. Requires a “preset” parameter.
	 * 
	 * @param id
	 *            Camera preset identifier. Must be an integer in the range
	 *            {0..15} for a far-site camera or {0..99} for a near-site
	 *            camera.
	 * 
	 * @return
	 */
	public static String nearSet(int id) {
		return "preset near set " + id + delimiter + "preset near set " + id + " ";
	}
}

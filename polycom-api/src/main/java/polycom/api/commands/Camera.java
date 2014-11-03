package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the near-site or far-site camera settings.
 * 
 * @author vpryimak
 *
 */
public class Camera {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Specifies that the command selects or controls the near camera.
	 * 
	 * @param source
	 * @return
	 */
	public static String near(int source) {
		return "camera near " + source + delimiter + "camera near " + source + " ";
	}

	/**
	 * Specifies that the command selects or controls the far camera.
	 * 
	 * @param source
	 * @return
	 */
	public static String far(int source) {
		return "camera far " + source + delimiter + "camera far " + source + " ";
	}

	/**
	 * Changes the near or far camera’s direction or zoom. Only continuous and
	 * discrete return feedback. Valid directions are: left, right, up, down,
	 * zoom+, zoom-, stop, continuous, and discrete.
	 * 
	 * @param direction
	 * @return
	 */
	public static String nearMove(String direction) {
		return "camera near move " + direction + delimiter + "camera near move " + direction + " ";
	}

	/**
	 * Changes the near or far camera’s direction or zoom. Only continuous and
	 * discrete return feedback. Valid directions are: left, right, up, down,
	 * zoom+, zoom-, stop, continuous, and discrete.
	 * 
	 * @param direction
	 * @return
	 */
	public static String farMove(String direction) {
		return "camera far move " + direction + delimiter + "camera far move " + direction + " ";
	}

	/**
	 * Returns the number of the near or far camera source currently selected.
	 * 
	 * @return
	 */
	public static String nearSource() {
		return "camera near source " + delimiter + "camera near source ";
	}

	/**
	 * Returns the number of the near or far camera source currently selected.
	 * 
	 * @return
	 */
	public static String farSource() {
		return "camera far source " + delimiter + "camera far source ";
	}

	/**
	 * Stops the near or far camera when in continuous mode. Returns no
	 * feedback.
	 * 
	 * @return
	 */
	public static String nearStop() {
		return "camera near stop " + delimiter + "camera near stop ";
	}

	/**
	 * Stops the near or far camera when in continuous mode. Returns no
	 * feedback.
	 * 
	 * @return
	 */
	public static String farStop() {
		return "camera far stop " + delimiter + "camera far stop ";
	}

	/**
	 * Gets the pan, tilt, and zoom coordinates of the currently selected PTZ
	 * camera in the format of pan tilt zoom.
	 * 
	 * @return
	 */
	public static String nearGetPosition() {
		return "camera near getposition" + delimiter + "camera near getposition ";
	}

	/**
	 * Sets the pan (x), tilt (y), and zoom (z) coordinates of the currently
	 * selected PTZ camera. Camera PTZ range: -880 <= pan <= 880 -300 <= tilt <=
	 * 300 0 <= zoom <= 1023 Note: Some D30 cameras might not be able to reach
	 * the designed range limit. For example, although the pan limit is 880, the
	 * camera might only be able to reach 860.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static String nearSetPosition(int x, int y, int z) {
		return "camera near setposition " + x + " " + y + " " + z + delimiter + "camera near setposition " + x + " " + y + " " + z + " ";
	}

	/**
	 * Gets the pan, tilt, and zoom coordinates of the currently selected PTZ
	 * camera in the format of pan tilt zoom.
	 * 
	 * @return
	 */
	public static String farGetPosition() {
		return "camera far getposition" + delimiter + "camera far getposition ";
	}

	/**
	 * Sets the pan (x), tilt (y), and zoom (z) coordinates of the currently
	 * selected PTZ camera. Camera PTZ range: -880 <= pan <= 880 -300 <= tilt <=
	 * 300 0 <= zoom <= 1023 Note: Some D30 cameras might not be able to reach
	 * the designed range limit. For example, although the pan limit is 880, the
	 * camera might only be able to reach 860.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static String farSetPosition(int x, int y, int z) {
		return "camera far setposition " + x + " " + y + " " + z + delimiter + "camera far setposition " + x + " " + y + " " + z + " ";
	}

	/**
	 * Specifies People+Content IP as the main video source if it is running and
	 * connected to the system.
	 * 
	 * @return
	 */
	public static String nearPpcip() {
		return "camera near ppcip" + delimiter + "camera near ppcip ";
	}

	/**
	 * Sets the source for the specified camera to People.
	 * 
	 * @param source
	 * @return
	 */
	public static String forPeople(int source) {
		return "camera for-people " + source + delimiter + "camera for-people " + source + " ";
	}

	/**
	 * Sets the source for the specified camera to Content.
	 * 
	 * @return
	 */
	public static String forContent(int source) {
		return "camera for-content " + source + delimiter + "camera for-content " + source + " ";
	}

	/**
	 * Gets a list of cameras configured as Content.
	 * 
	 * @return
	 */
	public static String listContent() {
		return "camera list-content" + delimiter + "camera list-content ";
	}

	/**
	 * Registers to receive feedback when the user changes the camera source.
	 * Returns the current camera registration state when followed by the get
	 * parameter.
	 * 
	 * @return
	 */
	public static String register() {
		return "camera register" + delimiter + "camera register ";
	}

	/**
	 * Unregisters to receive feedback when the user changes the camera source.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "camera unregister" + delimiter + "camera unregister ";
	}

	public static String registerGet() {
		return "camera register get" + delimiter + "camera register get ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Set or gets the setting for intercepting signals from the system remote
 * control.
 * 
 * @author vpryimak
 *
 */
public class RemoteControl {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Disables specified remote control button(s) so that the system does not
	 * respond.
	 * 
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String disableGet() {
		return "remotecontrol disable get" + delimiter + "remotecontrol disable get ";
	}

	/**
	 * Disables specified remote control button(s) so that the system does not
	 * respond.
	 * 
	 * All of the remote control buttons.
	 * 
	 * @return
	 */
	public static String disableAll() {
		return "remotecontrol disable all" + delimiter + "remotecontrol disable all ";
	}

	/**
	 * Disables specified remote control button(s) so that the system does not
	 * respond.
	 * 
	 * None of the remote control buttons.
	 * 
	 * @return
	 */
	public static String disableNone() {
		return "remotecontrol disable none" + delimiter + "remotecontrol disable none ";
	}

	public static String dontinterceptAll() {
		return "remotecontrol dontintercept all" + delimiter + "remotecontrol dontintercept all ";
	}

	public static String dontinterceptNone() {
		return "remotecontrol dontintercept none" + delimiter + "remotecontrol dontintercept none ";
	}

	/**
	 * @param validButton
	 *            Name of a specific button such as call, hangup, left, right,
	 *            up, down, select, home, directory, back, zoom-, zoom+,
	 *            volume-, volume+, mute, far, near, auto, camera, preset, pip,
	 *            keyboard, delete, ., 0-9, *, #, graphics, or help.
	 * 
	 * @return
	 */
	public static String dontinterceptSet(String validButton) {
		return "remotecontrol dontintercept " + validButton + delimiter + "remotecontrol dontintercept " + validButton + " ";
	}

	/**
	 * Enables specified remote control button(s).
	 * 
	 * @return
	 */
	public static String enableAll() {
		return "remotecontrol enable all" + delimiter + "remotecontrol enable all ";
	}

	/**
	 * Enables specified remote control button(s).
	 * 
	 * @return
	 */
	public static String enableNone() {
		return "remotecontrol enable none" + delimiter + "remotecontrol enable none ";
	}

	/**
	 * Enables specified remote control button(s).
	 * 
	 * @param validButton
	 *            Name of a specific button such as call, hangup, left, right,
	 *            up, down, select, home, directory, back, zoom-, zoom+,
	 *            volume-, volume+, mute, far, near, auto, camera, preset, pip,
	 *            keyboard, delete, ., 0-9, *, #, graphics, or help.
	 * 
	 * @return
	 */
	public static String enableSet(String validButton) {
		return "remotecontrol enable " + validButton + delimiter + "remotecontrol enable " + validButton + " ";
	}
}

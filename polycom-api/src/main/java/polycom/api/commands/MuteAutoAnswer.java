package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Mute Auto Answer Calls mode. When this setting is selected,
 * the microphone is muted to prevent the far site from hearing the near site
 * when the system answers automatically.
 * 
 * @author vpryimak
 *
 */
public class MuteAutoAnswer {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "muteautoanswer get" + delimiter + "muteautoanswer get ";
	}

	/**
	 * Enables Mute Auto Answer Calls mode. The microphone will be muted when
	 * the system receives a call while in Auto Answer mode.
	 * 
	 * @return
	 */
	public static String yes() {
		return "muteautoanswer yes" + delimiter + "muteautoanswer yes ";
	}

	/**
	 * Disables Mute Auto Answer Calls mode. The microphone will not be muted
	 * when the system receives a call while in Auto Answer mode.
	 * 
	 * @return
	 */
	public static String no() {
		return "muteautoanswer no" + delimiter + "muteautoanswer no ";
	}
}

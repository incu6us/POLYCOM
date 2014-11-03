package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the DiffServ option and specifies a priority level for audio,
 * far-end camera control (FECC) and other call control channels, and video,
 * respectively. The priority level value for each can be between 0 and 63.
 * 
 * @author vpryimak
 *
 */
public class DiffServVideo {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "diffservvideo get" + delimiter + "diffservvideo get ";
	}

	/**
	 * Sets the command. A priority level in the range {0..63} is required.
	 * 
	 * @param priorityLevel
	 *            Specifies the priority level.
	 * 
	 * @return
	 */
	public static String set(int priorityLevel) {
		return "diffservvideo set " + priorityLevel + delimiter + "diffservvideo set " + priorityLevel + " ";
	}
}

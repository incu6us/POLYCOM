package polycom.api.commands;

import polycom.api.Constants;

/**
 * Turns the test tone on or off. The tone is used to check the monitor audio
 * cable connections or to monitor the volume level.
 * 
 * @author vpryimak
 *
 */
public class GenerateTone {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Turns on the test tone.
	 * 
	 * @return
	 */
	public static String on() {
		return "generatetone on" + delimiter + "generatetone on ";
	}

	/**
	 * Turns off the test tone.
	 * 
	 * @return
	 */
	public static String off() {
		return "generatetone off" + delimiter + "generatetone off ";
	}
}

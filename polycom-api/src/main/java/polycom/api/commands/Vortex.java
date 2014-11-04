package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sends commands to a Polycom Vortex mixer.
 * 
 * @author vpryimak
 *
 */
public class Vortex {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Sets the mute state for the Vortex mixer connected to the specified
	 * serial port.
	 * 
	 * @param serialPort
	 *            0|1 - Specifies the serial port to which the Vortex mixer is
	 *            connected.
	 * 
	 * @param mutes
	 *            true - Mutes the Vortex mixer.
	 * 
	 *            false - Unmutes the Vortex mixer.
	 * 
	 * 
	 * @return
	 */
	public static String mute(int serialPort, boolean mutes) {
		String switch1 = "off";
		if (mutes) {
			switch1 = "on";
		}
		return "vortex " + serialPort + " mute " + switch1 + delimiter + "vortex " + serialPort + " mute " + switch1 + " ";
	}

	/**
	 * Forwards the vortex_macro to the Vortex mixer connected to the specified
	 * serial port.
	 * 
	 * @param serialPort
	 *            0|1 - Specifies the serial port to which the Vortex mixer is
	 *            connected.
	 * @param macro
	 *            Specifies the Vortex mixer macro command to send. For more
	 *            information about these commands, refer to the Vortex
	 *            documentation.
	 * 
	 * @return
	 */
	public static String forward(int serialPort, String macro) {
		return "vortex " + serialPort + " forward " + macro + delimiter + "vortex " + serialPort + " forward " + macro + " ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the audio volume transmitted to the far site, or notification of
 * transmit level changes.
 * 
 * @author vpryimak
 *
 */
public class AudioTransmitLevel {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "audiotransmitlevel get" + delimiter + "audiotransmitlevel get ";
	}

	/**
	 * Sets the volume 1 decibel higher than the current setting.
	 * 
	 * @return
	 */
	public static String up() {
		return "audiotransmitlevel up" + delimiter + "audiotransmitlevel up ";
	}

	/**
	 * Sets the volume 1 decibel lower than the current setting.
	 * 
	 * @return
	 */
	public static String down() {
		return "audiotransmitlevel down" + delimiter + "audiotransmitlevel down ";
	}

	/**
	 * Registers to receive notification when audio transmit level changes.
	 * 
	 * @return
	 */
	public static String register() {
		return "audiotransmitlevel register" + delimiter + "audiotransmitlevel register ";
	}

	/**
	 * Unregisters to receive notification when audio transmit level changes.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "audiotransmitlevel unregister" + delimiter + "audiotransmitlevel unregister ";
	}

	/**
	 * Sets the volume to the specified dB level. 
	 * 
	 * @param dbLevel - Valid values are: {-20..30}.
	 * @return
	 */
	public static String set(int dbLevel) {
		return "audiotransmitlevel set " + dbLevel + delimiter + "audiotransmitlevel set " + dbLevel + " ";
	}
}

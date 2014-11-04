package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets, gets, or tests the volume level of the ring tone and user alert tone on
 * the system.
 * 
 * @author vpryimak
 *
 */
public class SoundEffectsVolume {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting along with a test tone from the system at
	 * that volume level.
	 * 
	 * @return
	 */
	public static String get() {
		return "soundeffectsvolume get" + delimiter + "soundeffectsvolume get ";
	}

	/**
	 * Sets the volume of sound effects. Requires a volume parameter in the
	 * range {0..10}.
	 * 
	 * @param volume
	 * @return
	 */
	public static String set(int volume) {
		return "soundeffectsvolume set " + volume + delimiter + "soundeffectsvolume set " + volume + " ";
	}

	/**
	 * Tests the volume of sound effects.
	 * 
	 * @return
	 */
	public static String test() {
		return "soundeffectsvolume test" + delimiter + "soundeffectsvolume test ";
	}
}

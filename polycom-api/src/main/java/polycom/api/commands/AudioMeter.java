package polycom.api.commands;

import polycom.api.Constants;

/**
 * Queries and displays audio levels, once per second.
 * 
 * @author vpryimak
 *
 */
public class AudioMeter {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Measures the audio strength of the signal coming from all microphones
	 * assigned to the “left” microphone channel.
	 * 
	 * @return
	 */
	public static String micleft() {
		return "audiometer micleft" + delimiter + "audiometer micleft ";
	}

	/**
	 * Measures the audio strength of the signal coming from all microphones
	 * assigned to the “right” microphone channel.
	 * 
	 * @return
	 */
	public static String micright() {
		return "audiometer micright" + delimiter + "audiometer micright ";
	}

	/**
	 * Measures the audio strength of the signal connected to the right line
	 * input port.
	 * 
	 * @return
	 */
	public static String lineinright() {
		return "audiometer lineinright" + delimiter + "audiometer lineinright ";
	}

	/**
	 * Measures the audio strength of the signal connected to the left line
	 * input port.
	 * 
	 * @return
	 */
	public static String lineinleft() {
		return "audiometer lineinleft" + delimiter + "audiometer lineinleft ";
	}

	/**
	 * Measures the audio strength of the signal on the left main audio output
	 * port.
	 * 
	 * @return
	 */
	public static String lineoutleft() {
		return "audiometer lineoutleft" + delimiter + "audiometer lineoutleft ";
	}

	/**
	 * Measures the audio strength of the signal on the right main audio output
	 * port.
	 * 
	 * @return
	 */
	public static String lineoutright() {
		return "audiometer lineoutright" + delimiter + "audiometer lineoutright ";
	}

	/**
	 * Measures the audio strength of the signal on the left content audio input
	 * port.
	 * 
	 * @return
	 */
	public static String contentinleft() {
		return "audiometer contentinleft" + delimiter + "audiometer contentinleft ";
	}

	/**
	 * Measures the audio strength of the signal on the right content audio
	 * input port.
	 * 
	 * @return
	 */
	public static String contentinright() {
		return "audiometer contentinright" + delimiter + "audiometer contentinright ";
	}

	/**
	 * Measures the strength of the signal on the left VCR/DVD audio input port.
	 * 
	 * @return
	 */
	public static String vcrinleft() {
		return "audiometer vcrinleft" + delimiter + "audiometer vcrinleft ";
	}

	/**
	 * Measures the strength of the signal on the right VCR/DVD audio input
	 * port.
	 * 
	 * @return
	 */
	public static String vcrinright() {
		return "audiometer vcrinright" + delimiter + "audiometer vcrinright ";
	}

	/**
	 * Measures the strength of the signal on the left VCR/DVD audio output
	 * port.
	 * 
	 * @return
	 */
	public static String vcroutleft() {
		return "audiometer vcroutleft" + delimiter + "audiometer vcroutleft ";
	}

	/**
	 * Measures the strength of the signal on the right VCR/DVD audio output
	 * port.
	 * 
	 * @return
	 */
	public static String vcroutright() {
		return "audiometer vcroutright" + delimiter + "audiometer vcroutright ";
	}

	/**
	 * Measures the strength of the signal on the right channels of all far-site
	 * audio inputs.
	 * 
	 * @return
	 */
	public static String farendright() {
		return "audiometer farendright" + delimiter + "audiometer farendright ";
	}

	/**
	 * Measures the strength of the signal on the left channels of all far-site
	 * audio inputs.
	 * 
	 * @return
	 */
	public static String farendleft() {
		return "audiometer farendleft" + delimiter + "audiometer farendleft ";
	}

	/**
	 * Turns off audiometer output.
	 * 
	 * @return
	 */
	public static String off() {
		return "audiometer off" + delimiter + "audiometer off ";
	}
}

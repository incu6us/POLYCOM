package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the format for a video source.
 * 
 * camerainput <1|2|3> <get|s-video|composite|component>;
 * 
 * camerainput <4|5> <get|dvi|vga>
 * 
 * @author vpryimak
 *
 */
public class CameraInput {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @param source
	 *            Specifies the video source. camerainput 5 is available only on
	 *            the Polycom HDX 9004.
	 * 
	 * @return
	 */
	public static String get(int source) {
		return "camerainput " + source + " get" + delimiter + "camerainput " + source + " get ";
	}

	/**
	 * Specifies that the video source is connected using S-Video.
	 * 
	 * @param source
	 *            Specifies the video source. camerainput 5 is available only on
	 *            the Polycom HDX 9004.
	 * 
	 * @return
	 */
	public static String sVideo(int source) {
		return "camerainput " + source + " s-video" + delimiter + "camerainput " + source + " s-video ";
	}

	/**
	 * Specifies that the video source is connected using a composite connector.
	 * 
	 * @param source
	 *            Specifies the video source. camerainput 5 is available only on
	 *            the Polycom HDX 9004.
	 * @return
	 */
	public static String composite(int source) {
		return "camerainput " + source + " composite" + delimiter + "camerainput " + source + " composite ";
	}

	/**
	 * Specifies that the video source is connected using a component connector.
	 * 
	 * @param source
	 *            Specifies the video source. camerainput 5 is available only on
	 *            the Polycom HDX 9004.
	 * 
	 * @return
	 */
	public static String component(int source) {
		return "camerainput " + source + " component" + delimiter + "camerainput " + source + " component ";
	}

	/**
	 * Specifies that the video source is connected using DVI.
	 * 
	 * @param source
	 *            Specifies the video source. camerainput 5 is available only on
	 *            the Polycom HDX 9004.
	 * 
	 * @return
	 */
	public static String dvi(int source) {
		return "camerainput " + source + " dvi" + delimiter + "camerainput " + source + " dvi ";
	}

	/**
	 * Specifies that the video source is connected using VGA.
	 * 
	 * @param source
	 *            Specifies the video source. camerainput 5 is available only on
	 *            the Polycom HDX 9004.
	 * 
	 * @return
	 */
	public static String vga(int source) {
		return "camerainput " + source + " vga" + delimiter + "camerainput " + source + " vga ";
	}
}

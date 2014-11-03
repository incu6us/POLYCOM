package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the video format, aspect ratio and resolution for Monitor 1 or
 * Monitor 2.
 * 
 * @author vpryimak
 *
 */
public class ConfigDisplay {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "configdisplay get" + delimiter + "configdisplay get ";
	}

	/**
	 * Returns the current setting.
	 * 
	 * @param monitor
	 *            Specifies Monitor
	 * 
	 * @return
	 */
	public static String get(String monitor) {
		return "configdisplay " + monitor + " get" + delimiter + "configdisplay " + monitor + " get ";
	}

	/**
	 * Sets the specified display to S-Video format.
	 * 
	 * @param monitor
	 *            <monitor1|monitor2>
	 * @param aspectRatio
	 *            <4:3|16:9>
	 * 
	 * @return
	 */
	public static String sVideo(String monitor, String aspectRatio) {
		return "configdisplay " + monitor + " s-video " + aspectRatio + delimiter + "configdisplay " + monitor + " s-video " + aspectRatio + " ";
	}

	/**
	 * Sets the specified display to Composite format.
	 * 
	 * @param monitor
	 *            <monitor1|monitor2>
	 * @param aspectRatio
	 *            <4:3|16:9>
	 * @return
	 */
	public static String composite(String monitor, String aspectRatio) {
		return "configdisplay " + monitor + " composite " + aspectRatio + delimiter + "configdisplay " + monitor + " composite " + aspectRatio + " ";
	}

	/**
	 * Sets the specified display to DVI format.
	 * 
	 * @param monitor
	 *            <monitor1|monitor2>
	 * @param aspectRatio
	 *            <4:3|16:9>
	 * @return
	 */
	public static String dvi(String monitor, String aspectRatio) {
		return "configdisplay " + monitor + " dvi " + aspectRatio + delimiter + "configdisplay " + monitor + " dvi " + aspectRatio + " ";
	}

	/**
	 * Sets the specified display to VGA format.
	 * 
	 * @param monitor
	 *            <monitor1|monitor2>
	 * @param aspectRatio
	 *            <4:3|16:9>
	 * @return
	 */
	public static String vga(String monitor, String aspectRatio) {
		return "configdisplay " + monitor + " vga " + aspectRatio + delimiter + "configdisplay " + monitor + " vga " + aspectRatio + " ";
	}

	/**
	 * Sets the specified display to Component format.
	 * 
	 * @param monitor
	 *            <monitor1|monitor2>
	 * @param aspectRatio
	 *            <4:3|16:9>
	 * @return
	 */
	public static String component(String monitor, String aspectRatio) {
		return "configdisplay " + monitor + " component " + aspectRatio + delimiter + "configdisplay " + monitor + " component " + aspectRatio + " ";
	}

	/**
	 * Sets the specified display to S-Video format.
	 * 
	 * @param monitor
	 *            <monitor1|monitor2>
	 * @param aspectRatio
	 *            <4:3|16:9>
	 * @param resolution
	 *            [<720p|1080i|1080p>]
	 *            [<50hz720p|60hz720p|50hz1080i|60hz1080i|50hz1080p|60hz1080p>]
	 * 
	 * @return
	 */
	public static String sVideoWithResolution(String monitor, String aspectRatio, String resolution) {
		return "configdisplay " + monitor + " s-video " + aspectRatio + " " + resolution + delimiter + "configdisplay " + monitor + " s-video " + aspectRatio + " " + resolution
				+ " ";
	}

	/**
	 * Sets the specified display to Composite format.
	 * 
	 * @param monitor
	 *            <monitor1|monitor2>
	 * @param aspectRatio
	 *            <4:3|16:9>
	 * 
	 * @param resolution
	 *            [<720p|1080i|1080p>]
	 *            [<50hz720p|60hz720p|50hz1080i|60hz1080i|50hz1080p|60hz1080p>]
	 * @return
	 */
	public static String compositeWithResolution(String monitor, String aspectRatio, String resolution) {
		return "configdisplay " + monitor + " composite " + aspectRatio + " " + resolution + delimiter + "configdisplay " + monitor + " composite " + aspectRatio + " "
				+ resolution + " ";
	}

	/**
	 * Sets the specified display to DVI format.
	 * 
	 * @param monitor
	 *            <monitor1|monitor2>
	 * @param aspectRatio
	 *            <4:3|16:9>
	 * @param resolution
	 *            [<720p|1080i|1080p>]
	 *            [<50hz720p|60hz720p|50hz1080i|60hz1080i|50hz1080p|60hz1080p>]
	 * @return
	 */
	public static String dviWithResolution(String monitor, String aspectRatio, String resolution) {
		return "configdisplay " + monitor + " dvi " + aspectRatio + " " + resolution + delimiter + "configdisplay " + monitor + " dvi " + aspectRatio + " " + resolution + " ";
	}

	/**
	 * Sets the specified display to VGA format.
	 * 
	 * @param monitor
	 *            <monitor1|monitor2>
	 * @param aspectRatio
	 *            <4:3|16:9>
	 * @param resolution
	 *            [<720p|1080i|1080p>]
	 *            [<50hz720p|60hz720p|50hz1080i|60hz1080i|50hz1080p|60hz1080p>]
	 * @return
	 */
	public static String vgaWithResolution(String monitor, String aspectRatio, String resolution) {
		return "configdisplay " + monitor + " vga " + aspectRatio + " " + resolution + delimiter + "configdisplay " + monitor + " vga " + aspectRatio + " " + resolution + " ";
	}

	/**
	 * Sets the specified display to Component format.
	 * 
	 * @param monitor
	 *            <monitor1|monitor2>
	 * @param aspectRatio
	 *            <4:3|16:9>
	 * @param resolution
	 *            [<720p|1080i|1080p>]
	 *            [<50hz720p|60hz720p|50hz1080i|60hz1080i|50hz1080p|60hz1080p>]
	 * @return
	 */
	public static String componentWithResolution(String monitor, String aspectRatio, String resolution) {
		return "configdisplay " + monitor + " component " + aspectRatio + " " + resolution + delimiter + "configdisplay " + monitor + " component " + aspectRatio + " "
				+ resolution + " ";
	}

	/**
	 * Sets Monitor 2 to off.
	 * 
	 * @param monitor
	 * @return
	 */
	public static String monitorOff(String monitor) {
		return "configdisplay " + monitor + " off" + delimiter + "configdisplay " + monitor + " off ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the content presentation settings for Monitor 1 or Monitor 2.
 * 
 * @author vpryimak
 *
 */
public class ConfigPresentation {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current settings for the active monitors.
	 * 
	 * @return
	 */
	public static String get() {
		return "configpresentation get" + delimiter + "configpresentation get ";
	}

	/**
	 * Returns the current settings for the active monitors.
	 * 
	 * @return
	 */
	public static String get(String monitor) {
		return "configpresentation " + monitor + " get" + delimiter + "configpresentation " + monitor + " get ";
	}

	/**
	 * Selects near-site video as the video source to display on the specified
	 * monitor.
	 * 
	 * @param monitor
	 * @return
	 */
	public static String near(String monitor) {
		return "configpresentation " + monitor + " near" + delimiter + "configpresentation " + monitor + " near ";
	}

	/**
	 * Selects far-site video as the video source to display on the specified
	 * monitor.
	 * 
	 * @param monitor
	 * @return
	 */
	public static String far(String monitor) {
		return "configpresentation " + monitor + " far" + delimiter + "configpresentation " + monitor + " far ";
	}

	/**
	 * Selects content as the video source to display on the specified monitor.
	 * 
	 * @param monitor
	 * @return
	 */
	public static String content(String monitor) {
		return "configpresentation " + monitor + " content" + delimiter + "configpresentation " + monitor + " content ";
	}

	/**
	 * Selects both near-site and far-site video as video sources to display on
	 * the specified monitor.
	 * 
	 * @param monitor
	 * @return
	 */
	public static String nearOrFar(String monitor) {
		return "configpresentation " + monitor + " near-or-far" + delimiter + "configpresentation " + monitor + " near-or-far ";
	}

	/**
	 * Selects both near-site video and content as video sources to display on
	 * the specified monitor.
	 * 
	 * @param monitor
	 * @return
	 */
	public static String contentOrNear(String monitor) {
		return "configpresentation " + monitor + " content-or-near" + delimiter + "configpresentation " + monitor + " content-or-near ";
	}

	/**
	 * Selects both content and far-site video as video sources to display on
	 * the specified monitor.
	 * 
	 * @param monitor
	 * @return
	 */
	public static String contentOrFar(String monitor) {
		return "configpresentation " + monitor + " content-or-far" + delimiter + "configpresentation " + monitor + " content-or-far ";
	}

	/**
	 * Selects content, near-site video, and far-site video as video sources for
	 * the specified monitor.
	 * 
	 * @param monitor
	 * @return
	 */
	public static String all(String monitor) {
		return "configpresentation " + monitor + " all" + delimiter + "configpresentation " + monitor + " all ";
	}

	/**
	 * Clears all video sources for the specified monitor.
	 * 
	 * @param monitor
	 * @return
	 */
	public static String none(String monitor) {
		return "configpresentation " + monitor + " none" + delimiter + "configpresentation " + monitor + " none ";
	}
}

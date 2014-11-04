package polycom.api.commands;

import polycom.api.Constants;

/**
 * Controls a content video source. It can also register or unregister the API
 * session to receive notification of content events.
 * 
 * @author vpryimak
 *
 */
public class VcButton {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Gets the content video source that is currently playing.
	 * 
	 * @return
	 */
	public static String sourceGet() {
		return "vcbutton source get" + delimiter + "vcbutton source get ";
	}

	/**
	 * Gets the content video source currently specified for control.
	 * 
	 * @return
	 */
	public static String mapGet() {
		return "vcbutton map get" + delimiter + "vcbutton map get ";
	}

	/**
	 * Specifies the content video source to control. Note: This parameter is
	 * only necessary if no video source was specified when using the vcbutton
	 * play command.
	 * 
	 * @param videoSource
	 *            {2..5} - Specifies the content video source to control. Note:
	 *            This parameter is only necessary if no video source was
	 *            specified when using the vcbutton play command.
	 * 
	 * 
	 * @return
	 */
	public static String map(int videoSource) {
		return "vcbutton map " + videoSource + delimiter + "vcbutton map " + videoSource + " ";
	}

	/**
	 * Returns the current setting (play or stop).
	 * 
	 * @return
	 */
	public static String get() {
		return "vcbutton get" + delimiter + "vcbutton get ";
	}

	/**
	 * Stops sending content from the content video source that is currently
	 * playing.
	 * 
	 * @return
	 */
	public static String stop() {
		return "vcbutton stop" + delimiter + "vcbutton stop ";
	}

	/**
	 * Registers the API session to receive notifications about content events.
	 * 
	 * @return
	 */
	public static String register() {
		return "vcbutton register" + delimiter + "vcbutton register ";
	}

	/**
	 * Unregisters the API session to receive notifications about content
	 * events.
	 * 
	 * @return
	 */
	public static String unregister() {
		return "vcbutton unregister" + delimiter + "vcbutton unregister ";
	}

	/**
	 * Starts sending the content from the specified content video source. If no
	 * content video source is specified, starts sending content from the
	 * default content video source. Starts content from any content video
	 * source without the need to change source mapping and without needing to
	 * stop the currently playing content video source. Fails and does not stop
	 * the current content video source if the specified content video source is
	 * not valid. Stops the current content video source if the specified
	 * content video source is valid but is currently unavailable.
	 * 
	 * @param videoSource
	 *            {2..5} - Specifies a content video source.
	 * 
	 * @return
	 */
	public static String play(int videoSource) {
		return "vcbutton play " + videoSource + delimiter + "vcbutton play " + videoSource + " ";
	}
}

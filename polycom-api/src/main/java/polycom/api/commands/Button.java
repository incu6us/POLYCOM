package polycom.api.commands;

import polycom.api.Constants;

/**
 * Simulates Polycom remote control buttons.
 * 
 * @author vpryimak
 *
 */
public class Button {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Send char to the remote
	 * 
	 * @param button
	 * @return
	 */
	public static String sendButton(char button) {
		return "button " + button + delimiter + "button " + button + " ";
	}

	/**
	 * Sends the Auto button signal to the user interface.
	 * 
	 * @return
	 */
	public static String auto() {
		return "button auto" + delimiter + "button auto ";
	}

	/**
	 * Simulates the Back button on multiple-page screens.
	 * 
	 * @return
	 */
	public static String back() {
		return "button back" + delimiter + "button back ";
	}

	/**
	 * Sends the Call button signal to the user interface.
	 * 
	 * @return
	 */
	public static String call() {
		return "button call" + delimiter + "button call ";
	}

	/**
	 * Sends the Camera button signal to the user interface.
	 * 
	 * @return
	 */
	public static String camera() {
		return "button camera" + delimiter + "button camera ";
	}

	/**
	 * Sends the Delete button signal to the user interface.
	 * 
	 * @return
	 */
	public static String delete() {
		return "button delete" + delimiter + "button delete ";
	}

	/**
	 * Sends the Directory button signal to the user interface.
	 * 
	 * @return
	 */
	public static String directory() {
		return "button directory" + delimiter + "button directory ";
	}

	/**
	 * Sends the down arrow button signal to the user interface.
	 * 
	 * @return
	 */
	public static String down() {
		return "button down" + delimiter + "button down ";
	}

	/**
	 * Sends the Far button signal to the user interface.
	 * 
	 * @return
	 */
	public static String far() {
		return "button far" + delimiter + "button far ";
	}

	/**
	 * Sends the Content button signal to the user interface.
	 * 
	 * @return
	 */
	public static String graphics() {
		return "button graphics" + delimiter + "button graphics ";
	}

	/**
	 * Sends the Hang Up button signal to the user interface.
	 * 
	 * @return
	 */
	public static String hangup() {
		return "button hangup" + delimiter + "button hangup ";
	}

	/**
	 * Sends the Help button signal to the user interface.
	 * 
	 * @return
	 */
	public static String help() {
		return "button help" + delimiter + "button help ";
	}

	/**
	 * Sends the Home button signal to the user interface.
	 * 
	 * @return
	 */
	public static String home() {
		return "button home" + delimiter + "button home ";
	}

	/**
	 * Sends the Info button signal to the user interface.
	 * 
	 * @return
	 */
	public static String info() {
		return "button info" + delimiter + "button info ";
	}

	/**
	 * Brings up the on-screen keyboard if the cursor is on a text field.
	 * 
	 * @return
	 */
	public static String keyboard() {
		return "button keyboard" + delimiter + "button keyboard ";
	}

	/**
	 * Sends the left arrow button signal to the user interface.
	 * 
	 * @return
	 */
	public static String left() {
		return "button left" + delimiter + "button left ";
	}

	/**
	 * Simulates a low battery alert for the remote control.
	 * 
	 * @return
	 */
	public static String lowbattery() {
		return "button lowbattery" + delimiter + "button lowbattery ";
	}

	/**
	 * Sends the Menu button signal to legacy systems. Deprecated. Polycom
	 * recommends using back instead of this button.
	 * 
	 * @return
	 */
	public static String menu() {
		return "button menu" + delimiter + "button menu ";
	}

	/**
	 * Stops the video stream on the RSS-4000TM.
	 * 
	 * @return
	 */
	public static String mmstop() {
		return "button mmstop" + delimiter + "button mmstop ";
	}

	/**
	 * Plays the video stream on the RSS-4000.
	 * 
	 * @return
	 */
	public static String mmplay() {
		return "button mmplay" + delimiter + "button mmplay ";
	}

	/**
	 * Pauses the video stream on the RSS-4000.
	 * 
	 * @return
	 */
	public static String mmpause() {
		return "button mmpause" + delimiter + "button mmpause ";
	}

	/**
	 * Records the video stream on the RSS-4000.
	 * 
	 * @return
	 */
	public static String mmrecord() {
		return "button mmrecord" + delimiter + "button mmrecord ";
	}

	/**
	 * Fast forwards the video stream on the RSS-4000.
	 * 
	 * @return
	 */
	public static String mmforward() {
		return "button mmforward" + delimiter + "button mmforward ";
	}

	/**
	 * Rewinds the video stream on the RSS-4000.
	 * 
	 * @return
	 */
	public static String mmrewind() {
		return "button mmrewind" + delimiter + "button mmrewind ";
	}

	/**
	 * Sends the Mute button signal to the user interface, causing a toggle of
	 * mute state.
	 * 
	 * @return
	 */
	public static String mute() {
		return "button mute" + delimiter + "button mute ";
	}

	/**
	 * Sends the Near button signal to the user interface.
	 * 
	 * @return
	 */
	public static String near() {
		return "button near" + delimiter + "button near ";
	}

	/**
	 * Sends the Option button signal to the user interface.
	 * 
	 * @return
	 */
	public static String option() {
		return "button option" + delimiter + "button option ";
	}

	/**
	 * Types a period (dot) if the cursor is on a text field.
	 * 
	 * @return
	 */
	public static String period() {
		return "button period" + delimiter + "button period ";
	}

	/**
	 * Sends a signal indicating that the remote control has been picked up.
	 * 
	 * @return
	 */
	public static String pickedup() {
		return "button pickedup" + delimiter + "button pickedup ";
	}

	/**
	 * Sends the Display button signal to the user interface.
	 * 
	 * @return
	 */
	public static String pip() {
		return "button pip" + delimiter + "button pip ";
	}

	/**
	 * Sends the Preset button signal to the user interface.
	 * 
	 * @return
	 */
	public static String preset() {
		return "button preset" + delimiter + "button preset ";
	}

	/**
	 * Sends a signal indicating that the remote control has been set down.
	 * 
	 * @return
	 */
	public static String putdown() {
		return "button putdown" + delimiter + "button putdown ";
	}

	/**
	 * Sends the right arrow button signal to the user interface.
	 * 
	 * @return
	 */
	public static String right() {
		return "button right" + delimiter + "button right ";
	}

	/**
	 * Sends the Select (center button) button signal to the user interface.
	 * 
	 * @return
	 */
	public static String select() {
		return "button select" + delimiter + "button select ";
	}

	/**
	 * Sends the Slides button signal to legacy systems. Deprecated. Polycom
	 * recommends using graphics instead of this button.
	 * 
	 * @return
	 */
	public static String slides() {
		return "button slides" + delimiter + "button slides ";
	}

	/**
	 * Sends the up arrow button signal to the user interface.
	 * 
	 * @return
	 */
	public static String up() {
		return "button up" + delimiter + "button up ";
	}

	/**
	 * Sends the volume - button signal to the user interface.
	 * 
	 * @return
	 */
	public static String volumeMinus() {
		return "button volume-" + delimiter + "button volume- ";
	}

	/**
	 * Sends the volume + button signal to the user interface.
	 * 
	 * @return
	 */
	public static String volumePlus() {
		return "button volume+" + delimiter + "button volume+ ";
	}

	/**
	 * Sends the zoom - button signal to the user interface.
	 * 
	 * @return
	 */
	public static String zoomMinus() {
		return "button zoom-" + delimiter + "button zoon- ";
	}

	/**
	 * Sends the zoom +button signal to the user interface.
	 * 
	 * @return
	 */
	public static String zoomPlus() {
		return "button zoom+" + delimiter + "button zoon+ ";
	}
}

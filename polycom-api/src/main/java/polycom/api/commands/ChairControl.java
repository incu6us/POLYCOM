package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sends various chair control commands while the system is in a multipoint
 * call.
 * 
 * @author vpryimak
 *
 */
public class ChairControl {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Ends the call and returns the same feedback as hangup_term for each site
	 * in the call.
	 * 
	 * @return
	 */
	public static String endConf() {
		return "chaircontrol end_conf" + delimiter + "chaircontrol end_conf ";
	}

	/**
	 * Disconnects the specified site from the call.
	 * 
	 * @param termNo
	 * @return
	 */
	public static String hangupTerm(String termNo) {
		return "chaircontrol hangup_term " + termNo + delimiter + "chaircontrol hangup_term " + termNo + " ";
	}

	/**
	 * Lists the sites in the call.
	 * 
	 * @return
	 */
	public static String list() {
		return "chaircontrol list" + delimiter + "chaircontrol list ";
	}

	/**
	 * Releases the chair.
	 * 
	 * @return
	 */
	public static String relChair() {
		return "chaircontrol rel_chair" + delimiter + "chaircontrol rel_chair ";
	}

	/**
	 * Registers to receive feedback on all chair control operations.
	 * 
	 * @return
	 */
	public static String register() {
		return "chaircontrol register" + delimiter + "chaircontrol register ";
	}

	/**
	 * Unregisters (stops feedback on all chair control operations).
	 * 
	 * @return
	 */
	public static String unregister() {
		return "chaircontrol unregister" + delimiter + "chaircontrol unregister ";
	}

	/**
	 * Requests the chair.
	 * 
	 * @return
	 */
	public static String reqChair() {
		return "chaircontrol req_chair" + delimiter + "chaircontrol req_chair ";
	}

	/**
	 * Requests the floor.
	 * 
	 * @return
	 */
	public static String reqFloor() {
		return "chaircontrol req_floor" + delimiter + "chaircontrol req_floor ";
	}

	/**
	 * Requests the name for the specified terminal number.
	 * 
	 * @param termNo
	 * @return
	 */
	public static String reqTermName(String termNo) {
		return "chaircontrol req_term_name " + termNo + delimiter + "chaircontrol req_term_name " + termNo + " ";
	}

	/**
	 * Requests voice-activated switching.
	 * 
	 * @return
	 */
	public static String reqVas() {
		return "chaircontrol req_vas" + delimiter + "chaircontrol req_vas ";
	}

	/**
	 * Requests the specified terminal to become the broadcaster.
	 * 
	 * @param termNo
	 * @return
	 */
	public static String setBroadcaster(String termNo) {
		return "chaircontrol set_broadcaster " + termNo + delimiter + "chaircontrol set_broadcaster " + termNo + " ";
	}

	/**
	 * Sets the name for the specified terminal number.
	 * 
	 * @param termNo
	 * @param termName
	 * @return
	 */
	public static String setTermName(String termNo, String termName) {
		return "chaircontrol set_term_name " + termNo + " " + termName + delimiter + "chaircontrol set_term_name " + termNo + " " + termName + " ";
	}

	/**
	 * Stops viewing the specified terminal.
	 * 
	 * @return
	 */
	public static String stopView() {
		return "chaircontrol stop_view" + delimiter + "chaircontrol stop_view ";
	}

	/**
	 * Views the specified terminal.
	 * 
	 * @param termNo
	 * @return
	 */
	public static String view(String termNo) {
		return "chaircontrol view " + termNo + delimiter + "chaircontrol view " + termNo + " ";
	}

	/**
	 * Views the broadcaster.
	 * 
	 * @return
	 */
	public static String viewBroadcaster() {
		return "chaircontrol view_broadcaster" + delimiter + "chaircontrol view_broadcaster ";
	}
}

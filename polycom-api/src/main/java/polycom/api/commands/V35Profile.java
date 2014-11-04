package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets a V.35 profile associated with dialing through a DCE. It can
 * also display all the settings (speed, prefix or suffix) of the current
 * profile.
 * 
 * @author vpryimak
 *
 */
public class V35Profile {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current profile.
	 * 
	 * @return
	 */
	public static String get() {
		return "v35profile get" + delimiter + "v35profile get ";
	}

	/**
	 * V.35/RS-449/RS-530 profile (equipment/manufacturer) available. Consult
	 * your DCE user guide for additional information on setting dialing
	 * profiles.
	 * 
	 * @param profile
	 *            adtran|adtran_isu512| ascend|ascend_vsx| ascend_max|avaya_mcu|
	 *            custom_1|fvc.com| initia|lucent_mcu| madge_teleos
	 * 
	 * @return
	 */
	public static String set(String profile) {
		return "v35profile "+profile + delimiter + "v35profile "+profile+" ";
	}
}

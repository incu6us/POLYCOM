package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the PRI line buildout for a T1 interface.
 * 
 * @author vpryimak
 *
 */
public class PriLineBuildOut {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "prilinebuildout get" + delimiter + "prilinebuildout get ";
	}

	/**
	 * Sets the PRI line buildout. It requires an output “attenuation in dB” or
	 * an “attenuation in feet”.
	 * 
	 * @param attenuationValue
	 *            0|-7.5|-15|-22.5 - Output attenuation values in dB. For
	 *            internal CSUs.
	 * 
	 *            0-133|134-266| 267-399|400-533| 534-665 - Output attenuation
	 *            values in feet. For external CSUs.
	 * 
	 * 
	 * 
	 * @return
	 */
	public static String get(String attenuationValue) {
		return "prilinebuildout set " + attenuationValue + delimiter + "prilinebuildout set " + attenuationValue + " ";
	}
}

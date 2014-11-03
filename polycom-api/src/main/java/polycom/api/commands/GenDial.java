package polycom.api.commands;

import polycom.api.Constants;

/**
 * Generates DTMF dialing tones.
 * 
 * @author vpryimak
 *
 */
public class GenDial {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * @param dtfmButton
	 *            Generates the DTMF tone corresponding to telephone buttons
	 *            0-9.
	 * 
	 *            Generates the DTMF tone corresponding to a telephone # button.
	 * 
	 *            Generates the DTMF tone corresponding to a telephone * button.
	 * 
	 * @return
	 */
	public static String genDial(char dtfmButton) {
		return "gendial " + dtfmButton + delimiter + "gendial " + dtfmButton + " ";
	}
}

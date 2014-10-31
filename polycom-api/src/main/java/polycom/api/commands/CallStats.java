package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns call summary information.
 * 
 * @author vpryimak
 *
 */
public class CallStats {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns call summary information.
	 * 
	 * @return
	 */
	public static String getStat() {
		return "callstats" + delimiter + "callstats ";
	}
}

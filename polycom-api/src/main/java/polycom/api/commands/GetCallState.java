package polycom.api.commands;

import polycom.api.Constants;

/**
 * Gets the state of the calls in the current conference.
 * 
 * @author vpryimak
 *
 */
public class GetCallState {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String getState() {
		return "getcallstate" + delimiter + "getcallstate ";
	}
}

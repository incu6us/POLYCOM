package polycom.api.commands;

import polycom.api.Constants;

/**
 * Gets the URL of the Global Management System server that manages your system.
 * This command automatically appends “/pwx/vs_status.asp”.
 * 
 * @author vpryimak
 *
 */
public class GmsUrl {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current URL information for a selected server. A server must
	 * be specified.
	 * 
	 * @param gmsServerNumber
	 *            Global Management System server number. The primary Global
	 *            Management System server that performs account validation is
	 *            always server 1.
	 * 
	 * @return
	 */
	public static String get(int gmsServerNumber) {
		return "gmsurl get " + gmsServerNumber + delimiter + "gmsurl get " + gmsServerNumber + " ";
	}

	/**
	 * Returns information for all Global Management System servers.
	 * 
	 * @return
	 */
	public static String getAll() {
		return "gmsurl get all" + delimiter + "gmsurl get all ";
	}
}

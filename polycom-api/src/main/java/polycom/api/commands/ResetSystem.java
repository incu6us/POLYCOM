package polycom.api.commands;

import polycom.api.Constants;

/**
 * Resets the system and, optionally, deletes system settings or local address
 * book entries.
 * 
 * @author vpryimak
 *
 */
public class ResetSystem {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Resets all configuration settings to default values.
	 * 
	 * @return
	 */
	public static String deleteSystemSettings() {
		return "resetsystem deletesystemsettings" + delimiter + "resetsystem deletesystemsettings ";
	}

	/**
	 * Deletes all local directory entries from the address book.
	 * 
	 * @return
	 */
	public static String deleteLocalDirectory() {
		return "resetsystem deletelocaldirectory" + delimiter + "resetsystem deletelocaldirectory ";
	}

	/**
	 * Deletes the CDR file from the /opt/polycom/cdr directory after copying
	 * the contents of the file to the trace log.
	 * 
	 * @return
	 */
	public static String deleteCdr() {
		return "resetsystem deletecdr" + delimiter + "resetsystem deletecdr ";
	}

	/**
	 * Deletes the system logs.
	 * 
	 * @return
	 */
	public static String deleteLogs() {
		return "resetsystem deletelogs" + delimiter + "resetsystem deletelogs ";
	}

	/**
	 * Deletes all certificates from the system.
	 * 
	 * @return
	 */
	public static String deleteCertificates() {
		return "resetsystem deletecertificates" + delimiter + "resetsystem deletecertificates ";
	}

}

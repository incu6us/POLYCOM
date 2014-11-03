package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the AES encryption mode for the system.
 * 
 * @author vpryimak
 *
 */
public class Encryption {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "encryption get" + delimiter + "encryption get ";
	}

	/**
	 * Use encryption when the far site is capable of encryption. Note: This
	 * parameter is called “When Available” in the user interface.
	 * 
	 * @return
	 */
	public static String yes() {
		return "encryption yes" + delimiter + "encryption yes ";
	}

	/**
	 * Disables encryption. Note: This parameter is called “Off” in the user
	 * interface.
	 * 
	 * @return
	 */
	public static String no() {
		return "encryption no" + delimiter + "encryption no ";
	}

	/**
	 * Enforces encryption on all video endpoints. Any video calls to or from
	 * systems that do not have encryption enabled are not connected. Audio-only
	 * calls are connected.
	 * 
	 * @return
	 */
	public static String requiredvideocallsonly() {
		return "encryption requiredvideocallsonly" + delimiter + "encryption requiredvideocallsonly ";
	}

	/**
	 * Enforces encryption on all endpoints. Any video or audio calls to or from
	 * systems that do not have encryption enabled are rejected and are not
	 * connected.
	 * 
	 * @return
	 */
	public static String requiredallcalls() {
		return "encryption requiredallcalls" + delimiter + "encryption requiredallcalls ";
	}
}

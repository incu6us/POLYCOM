package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the number of the phone that is located in the same room as the
 * system.
 * 
 * @author vpryimak
 *
 */
public class RoomPhoneNumber {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "roomphonenumber get" + delimiter + "roomphonenumber get ";
	}

	/**
	 * Sets the room phone number when followed by the “number” parameter. To
	 * erase the current setting, omit the “number” parameter.
	 * 
	 * @param roomNumber
	 *            Phone number for a telephone (not the system) in the room. Use
	 *            quotation marks around the number if it contains spaces. For
	 *            example: “408 555 2323”
	 * 
	 * @return
	 */
	public static String set(String roomNumber) {
		return "roomphonenumber set " + roomNumber + delimiter + "roomphonenumber set " + roomNumber + " ";
	}
}

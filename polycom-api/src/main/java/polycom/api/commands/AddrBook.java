package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns local directory (address book) entries
 * 
 * @author vpryimak
 */
public class AddrBook {

	private static String prefix = "addrbook ";
	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns all the entries in the local directory
	 * 
	 * @return
	 */
	public static String all() {
		return prefix + "all" + delimiter + prefix + "all done";
	}

	/**
	 * Returns a batch of 10 local directory entries. Requires a batch number,
	 * which must be an integer in the range {0..59}
	 * 
	 * @param directoryEntries
	 *            - batch number
	 * @return
	 */
	public static String batch(int directoryEntries) {
		return prefix + "batch " + directoryEntries + delimiter + prefix + "batch " + directoryEntries + " done";
	}

	/**
	 * Specifies a batch search
	 * 
	 * @param pattern
	 *            Specifies a pattern to match for the batch search
	 * @param count
	 *            Specifies the number of entries to list that match the pattern
	 * @return
	 */
	public static String batchSearch(String pattern, int count) {
		return "addrbook batch search " + pattern + " " + count + delimiter + "addrbook batch search " + pattern + " " + count + " done";
	}

	/**
	 * Returns a batch of entries in the range defined by “start” to “stop”
	 * 
	 * @param start
	 * @param stop
	 * @return
	 */
	public static String batchDefine(int start, int stop) {
		return "addrbook batch define " + start + " " + stop + delimiter + "addrbook batch define " + start + " " + stop + " done";
	}

	/**
	 * Returns entries beginning with the letter specified from the range
	 * {a..z}. Requires one or two alphanumeric characters. Valid characters
	 * are: - _ / ; @ , . \
	 * 
	 * @param letter
	 *            0 through 9; a through z
	 *            
	 * @return
	 */
	public static String letter(char letter) {
		return "addrbook letter " + letter + delimiter + "addrbook letter " + letter + " ";
	}

	/**
	 * Returns local directory entries numbered “start_no” through “stop_no”.
	 * Requires two integers.
	 * 
	 * @param start
	 * @param stop
	 * @return
	 */
	public static String range(int start, int stop) {
		return "addrbook range " + start + " " + stop + delimiter + "addrbook range " + start + " " + stop + " ";
	}

	/**
	 * Gets a more current copy of the local directory.
	 * 
	 * @return
	 */
	public static String refresh() {
		return "addrbook refresh" + delimiter + "addrbook refresh ";
	}
}

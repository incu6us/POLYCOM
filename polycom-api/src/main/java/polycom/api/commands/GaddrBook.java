package polycom.api.commands;

import polycom.api.Constants;

/**
 * Returns global directory (address book) entries.
 * 
 * @author vpryimak
 *
 */
public class GaddrBook {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns all the entries in the global directory.
	 * 
	 * @return
	 */
	public static String all() {
		return "gaddrbook all" + delimiter + "gaddrbook all ";
	}

	/**
	 * Returns a batch of 20 global directory entries. Requires a batch number,
	 * which must be an integer in the range {0..59}.
	 * 
	 * @param number
	 * @return
	 */
	public static String batch(int number) {
		return "gaddrbook batch " + number + delimiter + "gaddrbook batch " + number + " ";
	}

	/**
	 * Returns a batch of entries in the range defined by “start_no” to
	 * “stop_no.”
	 * 
	 * @param startNo
	 * @param endNo
	 * @return
	 */
	public static String batchDefine(int startNo, int endNo) {
		return "gaddrbook batch define " + startNo + " " + endNo + delimiter + "gaddrbook batch define " + startNo + " " + endNo + " ";
	}

	/**
	 * Specifies a batch search.
	 * 
	 * @param pattern
	 *            Specifies a pattern to match for the batch search.
	 * 
	 * @param count
	 *            Specifies the number of entries to list that match the
	 *            pattern.
	 * 
	 * @return
	 */
	public static String batchSearch(String pattern, int count) {
		return "gaddrbook batch search " + pattern + " " + count + delimiter + "gaddrbook batch search " + pattern + " " + count + " ";
	}

	/**
	 * Returns entries beginning with the letter specified from the range
	 * {a..z}. Requires one or two alphanumeric characters. Valid characters
	 * are: - _ / ; @ , . \ 0 through 9 a through z
	 * 
	 * @param letter
	 * @return
	 */
	public static String letter(char letter) {
		return "gaddrbook letter " + letter + delimiter + "gaddrbook letter " + letter + " ";
	}

	/**
	 * Returns global directory entries numbered “start_no” through “stop_no”.
	 * Requires two integers.
	 * 
	 * @param startNo
	 * @param endNo
	 * @return
	 */
	public static String range(int startNo, int endNo) {
		return "gaddrbook range " + startNo + " " + endNo + delimiter + "gaddrbook range " + startNo + " " + endNo + " ";
	}

	/**
	 * Gets a more current copy of the global directory.
	 * 
	 * @return
	 */
	public static String refresh() {
		return "gaddrbook refresh" + delimiter + "gaddrbook refresh ";
	}
}

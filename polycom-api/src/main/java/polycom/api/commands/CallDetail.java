package polycom.api.commands;

import polycom.api.Constants;

/**
 * Displays all call detail records, a specific call detail record, or the call
 * detail range.
 * 
 * @author vpryimak
 *
 */
public class CallDetail {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Displays all call detail records.
	 * 
	 * @return
	 */
	public static String all() {
		return "calldetail all" + delimiter + "calldetail all ";
	}

	/**
	 * Displays the range of records in the call detail report.
	 * 
	 * @return
	 */
	public static String range() {
		return "calldetail range" + delimiter + "calldetail range ";
	}

	/**
	 * Displays the Nth call detail record.
	 * 
	 * @param item
	 * @return
	 */
	public static String item(String item) {
		return "calldetail " + item + delimiter + "calldetail " + item + " ";
	}
}

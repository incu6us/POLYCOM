package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the number of digits in the DID Gateway number (E.164 dialing).
 * 
 * @author vpryimak
 *
 */
public class NumDigitsDid {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "numdigitsdid get" + delimiter + "numdigitsdid get ";
	}

	/**
	 * Specifies the number of digits in DID numbers.
	 * 
	 * @param didNumbers
	 * @return
	 */
	public static String set(String didNumbers) {
		return "numdigitsdid " + didNumbers + delimiter + "numdigitsdid " + didNumbers + " ";
	}
}

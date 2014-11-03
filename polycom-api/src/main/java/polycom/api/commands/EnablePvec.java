package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the PVEC (Polycom Video Error Concealment) setting on the
 * system.
 * 
 * @author vpryimak
 *
 */
public class EnablePvec {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "enablepvec get" + delimiter + "enablepvec get ";
	}

	/**
	 * Enables the PVEC option.
	 * 
	 * @return
	 */
	public static String yes() {
		return "enablepvec yes" + delimiter + "enablepvec yes ";
	}

	/**
	 * Disables the PVEC option.
	 * 
	 * @return
	 */
	public static String no() {
		return "enablepvec no" + delimiter + "enablepvec no ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the MTU mode. The mtumode and mtusize commands allow you to
 * change the Maximum Transmission Unit (MTU) size, to adjust for the best
 * interoperability with the host network. Set mtumode to specify, then use
 * mtusize to specify a value. If mtumode is set to default, the system
 * automatically sets the MTU value to 1260.
 * 
 * @author vpryimak
 *
 */
public class MtuMode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "mtumode get" + delimiter + "mtumode get ";
	}

	/**
	 * Sets the Maximum Transmission Unit size to the default value of 1260.
	 * 
	 * @return
	 */
	public static String default1() {
		return "mtumode default" + delimiter + "mtumode default ";
	}

	/**
	 * Allows you to specify a Maximum Transmission Unit size other than the
	 * default setting.
	 * 
	 * @return
	 */
	public static String specify() {
		return "mtumode specify" + delimiter + "mtumode specify ";
	}
}

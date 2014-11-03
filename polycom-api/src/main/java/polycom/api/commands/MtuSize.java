package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the MTU size. The mtumode and mtusize commands allow you to
 * change the Maximum Transmission Unit (MTU) size, to adjust for the best
 * interoperability with the host network. Set mtumode to specify, then use
 * mtusize to specify a value. If mtumode is set to default, the system
 * automatically sets the MTU value to 1260.
 * 
 * @author vpryimak
 *
 */
public class MtuSize {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "mtusize get" + delimiter + "mtusize get ";
	}

	/**
	 * Sets the value of the Maximum Transmission Unit size.
	 * 
	 * @param mtu
	 *            660|780|900|1020| 1140|1260|1500
	 * 
	 * @return
	 */
	public static String set(int mtu) {
		return "mtusize " + mtu + delimiter + "mtusize " + mtu;
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the PRI switch.
 * 
 * @author vpryimak
 *
 */
public class PriSwitch {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current switch protocol.
	 * 
	 * @return
	 */
	public static String get() {
		return "priswitch get" + delimiter + "priswitch get ";
	}

	/**
	 * Sets the PRI switch. One of the switch protocol parameters is required.
	 * 
	 * @param switchProto
	 *            att5ess|att4ess| norteldms|ni2| net5/ctr4| nttins-1500|ts-038
	 *            - Switch protocol values. For E1, net5/ctr4 is the default.
	 *            net5/ctr4 is the standard ETSI protocol derived from ITU
	 *            Q.931. For T1, net5/ctr4 is also provided for certain Asian
	 *            countries, such as Japan, Hong Kong, and Taiwan.
	 * 
	 * 
	 * @return
	 */
	public static String set(String switchProto) {
		return "priswitch set " + switchProto + delimiter + "priswitch set " + switchProto + " ";
	}
}

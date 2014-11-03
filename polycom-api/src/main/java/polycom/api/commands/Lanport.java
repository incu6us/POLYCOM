package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the LAN port settings of the system.
 * 
 * @author vpryimak
 *
 */
public class Lanport {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "lanport get" + delimiter + "lanport get ";
	}

	/**
	 * Sets the LAN speed and duplex mode. auto: Automatically negotiates the
	 * LAN speed and duplex mode. autohdx: Automatically negotiates the LAN
	 * speed but specifies half-duplex mode. autofdx: Automatically negotiates
	 * the LAN speed but specifies full-duplex mode. 10hdx: 10 Mbps, half duplex
	 * 10fdx: 10 Mbps, full duplex 100hdx: 100 Mbps, half duplex 100fdx: 100
	 * Mbps, full duplex 1000hdx: 1000 Mbps, half duplex 1000fdx: 1000 Mbps,
	 * full duplex
	 * 
	 * @return
	 */
	public static String auto() {
		return "lanport auto" + delimiter + "lanport auto ";
	}

	/**
	 * Sets the LAN speed and duplex mode. auto: Automatically negotiates the
	 * LAN speed and duplex mode. autohdx: Automatically negotiates the LAN
	 * speed but specifies half-duplex mode. autofdx: Automatically negotiates
	 * the LAN speed but specifies full-duplex mode. 10hdx: 10 Mbps, half duplex
	 * 10fdx: 10 Mbps, full duplex 100hdx: 100 Mbps, half duplex 100fdx: 100
	 * Mbps, full duplex 1000hdx: 1000 Mbps, half duplex 1000fdx: 1000 Mbps,
	 * full duplex
	 * 
	 * @return
	 */
	public static String autohdx() {
		return "lanport autohdx" + delimiter + "lanport autohdx ";
	}

	/**
	 * Sets the LAN speed and duplex mode. auto: Automatically negotiates the
	 * LAN speed and duplex mode. autohdx: Automatically negotiates the LAN
	 * speed but specifies half-duplex mode. autofdx: Automatically negotiates
	 * the LAN speed but specifies full-duplex mode. 10hdx: 10 Mbps, half duplex
	 * 10fdx: 10 Mbps, full duplex 100hdx: 100 Mbps, half duplex 100fdx: 100
	 * Mbps, full duplex 1000hdx: 1000 Mbps, half duplex 1000fdx: 1000 Mbps,
	 * full duplex
	 * 
	 * @return
	 */
	public static String autofdx() {
		return "lanport autofdx" + delimiter + "lanport autofdx ";
	}

	/**
	 * Sets the LAN speed and duplex mode. auto: Automatically negotiates the
	 * LAN speed and duplex mode. autohdx: Automatically negotiates the LAN
	 * speed but specifies half-duplex mode. autofdx: Automatically negotiates
	 * the LAN speed but specifies full-duplex mode. 10hdx: 10 Mbps, half duplex
	 * 10fdx: 10 Mbps, full duplex 100hdx: 100 Mbps, half duplex 100fdx: 100
	 * Mbps, full duplex 1000hdx: 1000 Mbps, half duplex 1000fdx: 1000 Mbps,
	 * full duplex
	 * 
	 * @return
	 */
	public static String hdx10() {
		return "lanport 10hdx" + delimiter + "lanport 10hdx ";
	}

	/**
	 * Sets the LAN speed and duplex mode. auto: Automatically negotiates the
	 * LAN speed and duplex mode. autohdx: Automatically negotiates the LAN
	 * speed but specifies half-duplex mode. autofdx: Automatically negotiates
	 * the LAN speed but specifies full-duplex mode. 10hdx: 10 Mbps, half duplex
	 * 10fdx: 10 Mbps, full duplex 100hdx: 100 Mbps, half duplex 100fdx: 100
	 * Mbps, full duplex 1000hdx: 1000 Mbps, half duplex 1000fdx: 1000 Mbps,
	 * full duplex
	 * 
	 * @return
	 */
	public static String fdx10() {
		return "lanport 10fdx" + delimiter + "lanport 10fdx ";
	}

	/**
	 * Sets the LAN speed and duplex mode. auto: Automatically negotiates the
	 * LAN speed and duplex mode. autohdx: Automatically negotiates the LAN
	 * speed but specifies half-duplex mode. autofdx: Automatically negotiates
	 * the LAN speed but specifies full-duplex mode. 10hdx: 10 Mbps, half duplex
	 * 10fdx: 10 Mbps, full duplex 100hdx: 100 Mbps, half duplex 100fdx: 100
	 * Mbps, full duplex 1000hdx: 1000 Mbps, half duplex 1000fdx: 1000 Mbps,
	 * full duplex
	 * 
	 * @return
	 */
	public static String hdx100() {
		return "lanport 100hdx" + delimiter + "lanport 100hdx ";
	}

	/**
	 * Sets the LAN speed and duplex mode. auto: Automatically negotiates the
	 * LAN speed and duplex mode. autohdx: Automatically negotiates the LAN
	 * speed but specifies half-duplex mode. autofdx: Automatically negotiates
	 * the LAN speed but specifies full-duplex mode. 10hdx: 10 Mbps, half duplex
	 * 10fdx: 10 Mbps, full duplex 100hdx: 100 Mbps, half duplex 100fdx: 100
	 * Mbps, full duplex 1000hdx: 1000 Mbps, half duplex 1000fdx: 1000 Mbps,
	 * full duplex
	 * 
	 * @return
	 */
	public static String fdx100() {
		return "lanport 100fdx" + delimiter + "lanport 100fdx ";
	}

	/**
	 * Sets the LAN speed and duplex mode. auto: Automatically negotiates the
	 * LAN speed and duplex mode. autohdx: Automatically negotiates the LAN
	 * speed but specifies half-duplex mode. autofdx: Automatically negotiates
	 * the LAN speed but specifies full-duplex mode. 10hdx: 10 Mbps, half duplex
	 * 10fdx: 10 Mbps, full duplex 100hdx: 100 Mbps, half duplex 100fdx: 100
	 * Mbps, full duplex 1000hdx: 1000 Mbps, half duplex 1000fdx: 1000 Mbps,
	 * full duplex
	 * 
	 * @return
	 */
	public static String hdx1000() {
		return "lanport 1000hdx" + delimiter + "lanport 1000hdx ";
	}

	/**
	 * Sets the LAN speed and duplex mode. auto: Automatically negotiates the
	 * LAN speed and duplex mode. autohdx: Automatically negotiates the LAN
	 * speed but specifies half-duplex mode. autofdx: Automatically negotiates
	 * the LAN speed but specifies full-duplex mode. 10hdx: 10 Mbps, half duplex
	 * 10fdx: 10 Mbps, full duplex 100hdx: 100 Mbps, half duplex 100fdx: 100
	 * Mbps, full duplex 1000hdx: 1000 Mbps, half duplex 1000fdx: 1000 Mbps,
	 * full duplex
	 * 
	 * @return
	 */
	public static String fdx1000() {
		return "lanport 1000fdx" + delimiter + "lanport 1000fdx ";
	}
}

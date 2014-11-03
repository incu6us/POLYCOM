package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ISDN switch protocol. This command is only applicable if you
 * have an ISDN network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class IsdnSwitch {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current switch protocol.
	 * 
	 * @return
	 */
	public static String get() {
		return "isdnswitch get" + delimiter + "isdnswitch get ";
	}

	/**
	 * Specifies the ISDN switch protocol to use.
	 * 
	 * @return
	 */
	public static String ptToPtAtAndT5Ess() {
		return "isdnswitch pt-to-pt_at&t_5_ess" + delimiter + "isdnswitch pt-to-pt_at&t_5_ess ";
	}

	/**
	 * Specifies the ISDN switch protocol to use.
	 * 
	 * @return
	 */
	public static String multipointAtAndT5Ess() {
		return "isdnswitch multipoint_at&t_5_ess" + delimiter + "isdnswitch multipoint_at&t_5_ess ";
	}

	/**
	 * Specifies the ISDN switch protocol to use.
	 * 
	 * @return
	 */
	public static String ni1() {
		return "isdnswitch ni-1" + delimiter + "isdnswitch ni-1 ";
	}

	/**
	 * Specifies the ISDN switch protocol to use.
	 * 
	 * @return
	 */
	public static String nortelDms100() {
		return "isdnswitch nortel_dms-100" + delimiter + "isdnswitch nortel_dms-100 ";
	}

	/**
	 * Specifies the ISDN switch protocol to use.
	 * 
	 * @return
	 */
	public static String standardEtsiEuroIsdn() {
		return "isdnswitch standard_etsi_euro-isdn" + delimiter + "isdnswitch standard_etsi_euro-isdn ";
	}

	/**
	 * Specifies the ISDN switch protocol to use.
	 * 
	 * @return
	 */
	public static String ts031() {
		return "isdnswitch ts-031" + delimiter + "isdnswitch ts-031 ";
	}

	/**
	 * Specifies the ISDN switch protocol to use.
	 * 
	 * @return
	 */
	public static String nttIns64() {
		return "isdnswitch ntt_ins-64" + delimiter + "isdnswitch ntt_ins-64 ";
	}
}

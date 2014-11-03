package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the ISDN dialing prefix used to access an outside line if the
 * system is behind a PBX. This command is only applicable if you have an ISDN
 * network interface connected to your system.
 * 
 * @author vpryimak
 *
 */
public class IsdnDialingPrefix {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the dialing prefix.
	 * 
	 * @return
	 */
	public static String get() {
		return "isdndialingprefix get" + delimiter + "isdndialingprefix get ";
	}

	/**
	 * Sets the ISDN prefix when followed by the “isdn prefix” parameter. To
	 * erase the current setting, omit “isdn prefix”.
	 * 
	 * @param isdnPrefix
	 *            The digit(s) that must be dialed to reach an outside line.
	 * 
	 * @return
	 */
	public static String set(String isdnPrefix) {
		return "isdndialingprefix set " + isdnPrefix + delimiter + "isdndialingprefix set " + isdnPrefix + " ";
	}
}

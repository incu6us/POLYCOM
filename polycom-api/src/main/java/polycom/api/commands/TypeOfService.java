package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the type of service for Quality of Service.
 * 
 * @author vpryimak
 *
 */
public class TypeOfService {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "typeofservice get" + delimiter + "typeofservice get ";
	}

	/**
	 * Selects IP precedence service.
	 * 
	 * @return
	 */
	public static String ipprecedence() {
		return "typeofservice ipprecedence" + delimiter + "typeofservice ipprecedence ";
	}

	/**
	 * Selects DiffServ service.
	 * 
	 * @return
	 */
	public static String diffserv() {
		return "typeofservice diffserv" + delimiter + "typeofservice diffserv ";
	}
}

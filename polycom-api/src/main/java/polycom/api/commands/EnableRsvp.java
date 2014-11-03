package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the RSVP (Resource Reservation Setup Protocol) setting on the
system, which requests that routers reserve bandwidth along an IP connection
path.

 * @author vpryimak
 *
 */
public class EnableRsvp {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String get() {
		return "enablersvp get" + delimiter + "enablersvp get ";
	}
	
	public static String yes() {
		return "enablersvp yes" + delimiter + "enablersvp yes ";
	}
	
	public static String no() {
		return "enablersvp no" + delimiter + "enablersvp no ";
	}
}

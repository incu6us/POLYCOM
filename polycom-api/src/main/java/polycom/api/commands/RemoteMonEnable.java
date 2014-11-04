package polycom.api.commands;

import polycom.api.Constants;

/**
 * Gets the state of remote room and call monitoring.

 * @author vpryimak
 *
 */
public class RemoteMonEnable {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String get() {
		return "remotemonenable get" + delimiter + "remotemonenable get ";
	}
	
	public static String on() {
		return "remotemonenable on" + delimiter + "remotemonenable on ";
	}
	
	public static String off() {
		return "remotemonenable off" + delimiter + "remotemonenable off ";
	}
}

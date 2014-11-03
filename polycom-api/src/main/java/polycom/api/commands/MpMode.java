package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the multipoint conference viewing mode for the system in a
multipoint call. The multipoint mode can be set to auto, discussion,
presentation, or fullscreen. By default, it is set to auto.

 * @author vpryimak
 *
 */
public class MpMode {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	public static String get() {
		return "mpmode get" + delimiter + "mpmode get ";
	}
	
	public static String auto() {
		return "mpmode auto" + delimiter + "mpmode auto ";
	}
	
	public static String discussion() {
		return "mpmode discussion" + delimiter + "mpmode discussion ";
	}
	
	public static String presentation() {
		return "mpmode presentation" + delimiter + "mpmode presentation ";
	}
	
	public static String fullscreen() {
		return "mpmode fullscreen" + delimiter + "mpmode fullscreen ";
	}
}

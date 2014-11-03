package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets whether video is displayed using dual monitor emulation, or
 * split-screen mode, when using one monitor.
 * 
 * @author vpryimak
 *
 */
public class DualMonitor {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "dualmonitor get" + delimiter + "dualmonitor get ";
	}

	/**
	 * Enables dual monitor emulation.
	 * 
	 * @return
	 */
	public static String yes() {
		return "dualmonitor yes" + delimiter + "dualmonitor yes ";
	}

	/**
	 * Disables dual monitor emulation.
	 * 
	 * @return
	 */
	public static String no() {
		return "dualmonitor no" + delimiter + "dualmonitor no ";
	}
}

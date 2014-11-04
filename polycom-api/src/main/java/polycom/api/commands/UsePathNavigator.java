package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the Polycom PathNavigatorTM mode, Polycom ReadiManager® SE200
 * mode, or Polycom Converged Management ApplicationTM (CMA®) mode if the
 * PathNavigator, ReadiManager, or Polycom CMA system is used with the Polycom
 * HDX system.
 * 
 * @author vpryimak
 *
 */
public class UsePathNavigator {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "usepathnavigator get" + delimiter + "usepathnavigator get ";
	}

	/**
	 * Always use the Conference on Demand feature available with the
	 * PathNavigator, ReadiManager, or Polycom CMA system to place a multipoint
	 * call. Never use the Polycom HDX system’s internal multipoint capability.
	 * 
	 * @return
	 */
	public static String always() {
		return "usepathnavigator always" + delimiter + "usepathnavigator always ";
	}

	/**
	 * Never use the Conference on Demand feature available with the
	 * PathNavigator, ReadiManager, or Polycom CMA system to place a multipoint
	 * call. Use the Polycom HDX system’s internal multipoint capability
	 * instead.
	 * 
	 * @return
	 */
	public static String never() {
		return "usepathnavigator never" + delimiter + "usepathnavigator never ";
	}

	/**
	 * This is the default. When this option is selected, the multipoint call is
	 * handled by the Polycom HDX system’s internal multipoint capability if
	 * possible; otherwise, the multipoint call is handled through the
	 * Conference on Demand feature available with the PathNavigator,
	 * ReadiManager, or Polycom CMA system.
	 * 
	 * @return
	 */
	public static String required() {
		return "usepathnavigator required" + delimiter + "usepathnavigator required ";
	}
}

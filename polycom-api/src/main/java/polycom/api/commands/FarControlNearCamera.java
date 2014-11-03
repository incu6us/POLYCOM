package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets far control of the near camera, which allows far sites to
 * control the camera on your system.
 * 
 * @author vpryimak
 *
 */
public class FarControlNearCamera {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "farcontrolnearcamera get" + delimiter + "farcontrolnearcamera get ";
	}

	/**
	 * Allows the far site to control the near camera if the far site has this
	 * capability.
	 * 
	 * @return
	 */
	public static String yes() {
		return "farcontrolnearcamera yes" + delimiter + "farcontrolnearcamera yes ";
	}

	/**
	 * Disables far control of the near camera.
	 * 
	 * @return
	 */
	public static String no() {
		return "farcontrolnearcamera no" + delimiter + "farcontrolnearcamera no ";
	}
}

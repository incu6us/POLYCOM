package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the content video adjustment setting.
 * 
 * @author vpryimak
 *
 */
public class ContentVideoAdjustment {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "contentvideoadjustment get" + delimiter + "contentvideoadjustment get ";
	}

	/**
	 * Preserves the aspect ratio of the source video. The image is scaled (if
	 * necessary) to the largest supported resolution that fits on the display
	 * without cropping.
	 * 
	 * @return
	 */
	public static String normal() {
		return "contentvideoadjustment normal" + delimiter + "contentvideoadjustment normal ";
	}

	/**
	 * Does not preserve aspect ratio. The image is scaled horizontally and
	 * vertically to exactly match the resolution of the display.
	 * 
	 * @return
	 */
	public static String stretch() {
		return "contentvideoadjustment stretch" + delimiter + "contentvideoadjustment stretch ";
	}

	/**
	 * Preserves the aspect ratio of the source video. The image is scaled to
	 * exactly match one of the display dimensions while matching or exceeding
	 * the other display dimension. The image is centered and cropped.
	 * 
	 * @return
	 */
	public static String zoom() {
		return "contentvideoadjustment zoom" + delimiter + "contentvideoadjustment zoom ";
	}
}

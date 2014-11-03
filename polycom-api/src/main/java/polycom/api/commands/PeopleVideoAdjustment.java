package polycom.api.commands;

import polycom.api.Constants;

public class PeopleVideoAdjustment {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "peoplevideoadjustment get" + delimiter + "peoplevideoadjustment get ";
	}

	/**
	 * Preserves the aspect ratio of the source video. The image is scaled (if
	 * necessary) to the largest supported resolution that fits on the display
	 * without cropping.
	 * 
	 * @return
	 */
	public static String normal() {
		return "peoplevideoadjustment normal" + delimiter + "peoplevideoadjustment normal ";
	}

	/**
	 * Does not preserve aspect ratio. The image is scaled horizontally and
	 * vertically to exactly match the resolution of the display.
	 * 
	 * @return
	 */
	public static String stretch() {
		return "peoplevideoadjustment stretch" + delimiter + "peoplevideoadjustment stretch ";
	}

	/**
	 * Preserves the aspect ratio of the source video. The image is scaled to
	 * exactly match one of the display dimensions while matching or exceeding
	 * the other display dimension. The image is centered and cropped.
	 * 
	 * @return
	 */
	public static String zoom() {
		return "peoplevideoadjustment zoom" + delimiter + "peoplevideoadjustment zoom ";
	}
}

package polycom.api.commands;

import polycom.api.Constants;

/**
 * Sets or gets the VCR/DVD record source.
 * 
 * @author vpryimak
 *
 */
public class VcrRecordSource {

	private static String delimiter = Constants.commandDelimiterForStartCmdToEndCmd;

	/**
	 * Returns the current setting.
	 * 
	 * @return
	 */
	public static String get() {
		return "vcrrecordsource get" + delimiter + "vcrrecordsource get ";
	}

	/**
	 * Sets the VCR to record the near-site video source.
	 * 
	 * @return
	 */
	public static String near() {
		return "vcrrecordsource near" + delimiter + "vcrrecordsource near ";
	}

	/**
	 * Sets the VCR to record the far-site video source.
	 * 
	 * @return
	 */
	public static String far() {
		return "vcrrecordsource far" + delimiter + "vcrrecordsource far ";
	}

	/**
	 * Sets the VCR to automatically record the current speaker in a
	 * point-to-point call.
	 * 
	 * @return
	 */
	public static String auto() {
		return "vcrrecordsource auto" + delimiter + "vcrrecordsource auto ";
	}

	/**
	 * Sets the VCR to record content, when presented.
	 * 
	 * @return
	 */
	public static String content() {
		return "vcrrecordsource content" + delimiter + "vcrrecordsource content ";
	}

	/**
	 * Sets the VCR to record near-site video or content, when presented.
	 * 
	 * @return
	 */
	public static String contentOrNear() {
		return "vcrrecordsource content-or-near" + delimiter + "vcrrecordsource content-or-near ";
	}

	/**
	 * Sets the VCR to record far-site video or content, when presented.
	 * 
	 * @return
	 */
	public static String contentrFar() {
		return "vcrrecordsource content-or-far" + delimiter + "vcrrecordsource content-or-far ";
	}

	/**
	 * Sets the VCR to record the current speaker or content, when presented.
	 * 
	 * @return
	 */
	public static String contentOrAuto() {
		return "vcrrecordsource content-or-auto" + delimiter + "vcrrecordsource content-or-auto ";
	}

	/**
	 * Sets the VCR to record nothing.
	 * 
	 * @return
	 */
	public static String none() {
		return "vcrrecordsource none" + delimiter + "vcrrecordsource none ";
	}
}

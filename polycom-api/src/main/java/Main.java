import polycom.api.commands.AddrBook;
import polycom.api.commands.AddressDisplayedInGab;
import polycom.api.commands.AdvNetStats;
import polycom.api.commands.AlertUserTone;
import polycom.api.commands.AlertVideoTone;
import polycom.api.commands.AllRegister;
import polycom.api.commands.AllUnregister;
import polycom.api.commands.Dial;
import polycom.api.commands.DisplayIpExt;
import polycom.api.commands.DisplayParams;
import polycom.api.commands.LineState;
import polycom.api.net.PolycomHDXClient;

public class Main {

	public static void main(String[] args) {

		PolycomHDXClient telnet = new PolycomHDXClient("89.221.48.69");

		/*
		 * addrbook
		 */
		// System.out.println(telnet.sendCommand(AddrBook.all()));
		// System.out.println(telnet.sendCommand(AddrBook.batch(0)));
		// System.out.println(telnet.sendCommand(AddrBook.batchSearch("Minsk",
		// 1)));
		// System.out.println(telnet.sendCommand(AddrBook.batchDefine(0, 1)));
		// System.out.println(telnet.sendCommand(AddrBook.letter('1')));
		// System.out.println(telnet.sendCommand(AddrBook.range(99, 99)));
		// System.out.println(telnet.sendCommand(AddrBook.refresh()));

		/*
		 * addressdisplayedingab
		 */
		// System.out.println(telnet.sendCommand(AddressDisplayedInGab.get()));

		/*
		 * advnetstats
		 */
		// System.out.println(telnet.sendCommand(AdvNetStats.setConnection(0)));

		/*
		 * alertusertone
		 */
		// System.out.println(telnet.sendCommand(AlertUserTone.setTone(1)));
		// System.out.println(telnet.sendCommand(AlertUserTone.getTone()));

		/*
		 * alertvideotone
		 */
		// System.out.println(telnet.sendCommand(AlertVideoTone.setTone(1)));
		// System.out.println(telnet.sendCommand(AlertVideoTone.getTone()));

		/*
		 * all register
		 */
		// System.out.println(telnet.sendCommand(AllRegister.getAllRegister()));

		/*
		 * all unregister
		 */
		// System.out.println(telnet.sendCommand(AllUnregister.getAllUnregister()));

		/*
		 * Dial
		 */
		// System.out.println(telnet.sendCommand(Dial.addressbook("Loopback ISDN Test")));

		/*
		 * Line state
		 */
		// System.out.println(telnet.sendCommand(LineState.get()));

		/*
		 * displayipisdninfo
		 */
		System.out.println(telnet.sendCommand(DisplayIpExt.get()));
		
		telnet.disconnect();
	}

}

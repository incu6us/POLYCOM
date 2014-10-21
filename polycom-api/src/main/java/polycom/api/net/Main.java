package polycom.api.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		Socket soc = new Socket("89.221.48.69", 23);
		// create buffered writer
		BufferedReader bwin = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
		int count = 0;
		while (true) {
			String readFir = bwin.readLine();
			if (readFir == null)
				break;
			System.out.println(readFir);
			bw.write("hostname get\r\n");
			bw.newLine();
			// instead might have to explicitly write "\r\n"
			// depending platform you're connecting from.
			bw.flush();

			// System.out.println("Enter command");
			// bw.write("log set-info 1");
			// bw.newLine();
			// bw.flush();
			// bw.close(); //close buffered Writer
			
			count++;
			if(count > 5) break;
		}
		bw.close();
		bwin.close();
		soc.close();
	}

}

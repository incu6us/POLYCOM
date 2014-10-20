package polycom.api.net;

import javax.net.ssl.SSLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = new Client();
		try {
			client.run();
		} catch (SSLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

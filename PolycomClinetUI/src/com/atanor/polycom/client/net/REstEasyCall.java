package com.atanor.polycom.client.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;


public class REstEasyCall {
	private String restServerIpAddressWithPort;
	private String restMethodUrl;
	private StringBuffer output = new StringBuffer();

	public REstEasyCall(String restServerIpAddressWithPort, String restMethodUrl) {
		this.restServerIpAddressWithPort = restServerIpAddressWithPort;
		this.restMethodUrl = restMethodUrl;
	}

	public REstEasyCall(String restServerIpAddressWithPort, String restMethodPrefix, String restMethodUrl) {
		this.restServerIpAddressWithPort = restServerIpAddressWithPort;
		this.restMethodUrl = restMethodPrefix+"/"+restMethodUrl;
	}
	public StringBuffer getResult() {

		try {

			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet("http://" + restServerIpAddressWithPort + "/" + restMethodUrl);
			HttpResponse response = client.execute(request);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String line = "";
			while ((line = rd.readLine()) != null) {
				System.out.println(line);
				output.append(line + "\n");
			}
		} catch (ClientProtocolException e) {
			output.append(e.getMessage());
		} catch (IOException e1) {
			output.append(e1.getMessage());
		}
		return output;
	}

}

package com.polycom.commands;

import polycom.api.net.PolycomHDXClient;

public class Connector {

	private static PolycomHDXClient polycomApiClient;
	
	public static synchronized String execute(String command){
		polycomApiClient = new PolycomHDXClient("89.221.48.69");
		String listContacts = polycomApiClient.sendCommand(command);
		polycomApiClient.disconnect();
		
		return listContacts;
	}
}

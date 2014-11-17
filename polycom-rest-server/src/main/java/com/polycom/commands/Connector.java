package com.polycom.commands;

import polycom.api.net.PolycomHDXClient;

public class Connector {

	public static String execute(String command){
		PolycomHDXClient polycomApiClient = new PolycomHDXClient("89.221.48.69");
		String listContacts = polycomApiClient.sendCommand(command);
		polycomApiClient.disconnect();
		
		return listContacts;
	}
}

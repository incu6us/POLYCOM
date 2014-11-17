package com.polycom.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.polycom.commands.Connector;

import polycom.api.commands.Dial;

@Component
@Path(value="dial")
public class DialApp {

	@GET
	@Path("/byDirectoryName/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String makeCallByAddressBook(@PathParam("name") String addressBookName){
		System.out.println("byDir");
		return Connector.execute(Dial.addressbook(addressBookName)).replaceAll("(^dial addressbook)(.*)(\n)", "");
	}
	
	@GET
	@Path("/byPhone/{msisdn}")
	@Produces(MediaType.TEXT_PLAIN)
	public String makeCallByManualy(@PathParam("msisdn") String msisdn){
		System.out.println("byPhone");
		return Connector.execute(Dial.phone(msisdn)).replaceAll("(^dial phone)(.*)(\n)", "");
	}
}

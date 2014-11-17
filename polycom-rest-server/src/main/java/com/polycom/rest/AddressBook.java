package com.polycom.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.polycom.commands.Connector;

import polycom.api.commands.AddrBook;

@Component
@Path(value = "getAddress")
public class AddressBook {
	
	
	@GET
	@Path("all")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAll(){

		return Connector.execute(AddrBook.all()).replaceAll("addrbook all\n", "");
	}
	
	
	@GET
	@Path("{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getByName(@PathParam("name") String name){
		
		return Connector.execute(AddrBook.batchSearch(name, 999)).replaceAll("(^addrbook batch)(.*)(\n)", "");
	}
}

package com.webservicetest.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/persona")
public class Service {

	
	@GET
	@Path("/get")
	@Produces("application/json")
	public Persona getPersonJSON(){
		Persona persona = new Persona();
		persona.setName("Jeison Pereira");
		persona.setEmail("jsnpereira@gmail.com");
		return persona;
	}
	
	
	@POST
	@Path("/post")
	public Response postPersonaJSON(Persona persona){
		String result = "Persona saved: "+persona.toString();
		return Response.status(201).entity(result).build();
	}
}

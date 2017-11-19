package com.test.api.resource;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

public class HelloResource {
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "This is the first rest service " + msg;

		return Response.status(200).entity(output).build();

	}
	
	
}

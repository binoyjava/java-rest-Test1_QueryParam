package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/testrest")
public class TestRest {

	@GET
	@Path("test")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test(@QueryParam("name") String name,
			@QueryParam("age") int age)
			throws Exception {
		String user = "Name: " + name + " age:" + age;
		System.out.println("params :" + user);
		return Response.status(200)
				.entity("getUserHistory is called,  " + user)
				.build();
	}
}

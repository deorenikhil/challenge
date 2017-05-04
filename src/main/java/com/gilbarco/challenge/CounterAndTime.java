package com.gilbarco.challenge;

import java.sql.Timestamp;
import java.time.Instant;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;



@Path("/time-service")
public class CounterAndTime {
	public static int calls =1;
	
	@GET
	@Path("time")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTimestampAndHits(){
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Instant instant = timestamp.toInstant();
		return new Response(instant.toString(), calls++);
				
	}

}

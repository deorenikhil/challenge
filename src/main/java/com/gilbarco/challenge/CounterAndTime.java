package com.gilbarco.challenge;

import java.sql.Timestamp;
import java.time.Instant;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("/sample")
public class CounterAndTime {
	public static int counter =1;
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getmeg(){
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Instant instant = timestamp.toInstant();

		Response res = new Response(null, 0);
		res.setCounter(counter++);
		res.setTimestamp(instant.toString());
		
		//Gson gson = new Gson();
		
		//gson.toJson(res);
		
		
		//return counter++ +" >>" + instant.toString();
		//return gson.toJson(countAndTime);
		return res;
				
	}

}

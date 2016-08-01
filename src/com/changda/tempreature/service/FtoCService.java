package com.changda.tempreature.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/ftocservice")
public class FtoCService {
	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException{
		JSONObject jsonObject = new JSONObject();
		Double fahrenheit = 98.24d;
		Double celsius = 0d;
		celsius = (fahrenheit-32)*5/9;
		jsonObject.put("F value", fahrenheit);
		jsonObject.put("C value", celsius);
		String result = jsonObject.toString();
		return Response.status(200).entity(result).build();
	}
	
	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException{
		JSONObject jsonObject = new JSONObject();
		float celsius = 0f;
		celsius = (f-32)*5/9;
		jsonObject.put("F value", f);
		jsonObject.put("C value", celsius);
		String result = jsonObject.toString();
		return Response.status(200).entity(result).build();
	}
	
}

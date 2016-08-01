package com.changda.tempreature.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/ctofservice")
public class CtoFService {
	@GET
	@Produces("application/XML")
	public String convertCtoF(){
		Double fahrenheit = 0d;
		Double celsius = 36.8;
		fahrenheit = (celsius * 9)/5 + 32;
		String result =  String.valueOf(fahrenheit);
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
	
	@GET
	@Path("{c}")
	@Produces("application/XML")
	public String convertCtoFfromInput(@PathParam("c") Double c){
		Double celsius = c;
		Double fahrenheit = 0d;
		fahrenheit = (celsius * 9)/5 + 32;
		String result = String.valueOf(fahrenheit);
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
}

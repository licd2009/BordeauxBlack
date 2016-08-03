package com.changda.tempreature.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.changda.tempreature.model.CandFModel;


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
	public CandFModel convertCtoFfromInput(@PathParam("c") Double c){
		CandFModel cfModel = new CandFModel(c, (c * 9)/5 + 32);
//		cfModel.setCelsius(c);
//		cfModel.setFahrenheit((c * 9)/5 + 32);
//		String result = String.valueOf(fahrenheit);
//		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
		return cfModel;
	}
}

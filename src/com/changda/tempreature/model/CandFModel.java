package com.changda.tempreature.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CandFModel implements Serializable{
	private static final long serialVersionUID = 1L;
	@XmlAttribute
	int id;
	@XmlElement
	private Double celsius;
	@XmlElement
	private Double fahrenheit;
	public CandFModel() {
		super();
		id = 1;
	}
	public CandFModel(Double c, Double f) {
		super();
		id=1;
		this.celsius = c;
		this.fahrenheit = f;
	}
//	public Double getCelsius() {
//		return celsius;
//	}
//	
//	public void setCelsius(Double c) {
//		this.celsius = c;
//	}
//	public Double getFahrenheit() {
//		return fahrenheit;
//	}
//	
//	public void setFahrenheit(Double f) {
//		this.fahrenheit = f;
//	}
//	public int getId() {
//		return id;
//	}
//	
//	public void setId(int id) {
//		this.id = id;
//	}
//	
	

}

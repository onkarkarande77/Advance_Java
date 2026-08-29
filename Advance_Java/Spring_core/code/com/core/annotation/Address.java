package com.core.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ad")
public class Address {
	@Value("Pune")
	private String city;
	@Value("MH")
	private String state;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	

}

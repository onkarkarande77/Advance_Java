package com.core.annotation;

 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ok")//this is the reff
public class Student {
	  @Value("10")
    	private Integer id;
	  @Value("Spring")
    	private String name;
	
	  public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

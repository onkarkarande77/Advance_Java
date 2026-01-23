package com.bean;

public class StudentBean {
	private Integer stdId;
	private String stdName;
	private String city;
	
	
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentBean(Integer stdId, String stdName, String city) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.city = city;
	}


	public Integer getStdId() {
		return stdId;
	}


	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}

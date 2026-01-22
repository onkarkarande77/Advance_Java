package com.bean;

public class Greeting {
	private Integer id;
	private String message;
	public Greeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Greeting(Integer id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Greeting [id=" + id + ", message=" + message + "]";
	}
	
	

}

package com.Assignment;

public class StdBean {
	int id;
	String name;
	
	public StdBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StdBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void stdDisp(){
		System.out.println("id "+id+"\tname "+name);
	}
	
	

}

package com.bean;

public class AccountBean {
	private Integer id;
	private String name;
	
	public AccountBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountBean(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AccountBean [id=" + id + ", name=" + name + "]";
	}
	
	

}


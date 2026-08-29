package com.core.internal;

 

public class Person {
	private  Integer per_id;
	private String per_name;
	private Address addr;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer per_id, String per_name, Address addr) {
		super();
		this.per_id = per_id;
		this.per_name = per_name;
		this.addr = addr;
	}
	public Integer getPer_id() {
		return per_id;
	}
	public void setPer_id(Integer per_id) {
		this.per_id = per_id;
	}
	public String getPer_name() {
		return per_name;
	}
	public void setPer_name(String per_name) {
		this.per_name = per_name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [per_id=" + per_id + ", per_name=" + per_name + ", addr=" + addr + "]";
	}
	 
	
	
 
}

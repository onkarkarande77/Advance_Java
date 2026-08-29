package com.core;

public class StudentData {
	private Integer stdId;
	private String stdName;
	private Float stdHt;
	
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentData(Integer stdId, String stdName, Float stdHt) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdHt = stdHt;
	}
	
	void dispData() {
		System.out.println("student data is "+stdId+"\t"+stdName+"\t"+stdHt);
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
	public Float getStdHt() {
		return stdHt;
	}
	public void setStdHt(Float stdHt) {
		this.stdHt = stdHt;
	}
	
	@Override
	public String toString() {
		return "StudentData [stdId=" + stdId + ", stdName=" + stdName + ", stdHt=" + stdHt + "]";
	}
	
	
	
	

}

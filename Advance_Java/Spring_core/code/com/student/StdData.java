package com.annotation.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stddata")
public class StdData {
	@Value("1")
	private Integer stdId;
	@Value("java")
	private String stdName;
	@Value("77")
	private String mks_phy;
	@Value("89")
	private String mks_chem;
	
	public StdData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Integer getStdId() {
		return stdId;
	}




	public String getStdName() {
		return stdName;
	}




	public String getMks_phy() {
		return mks_phy;
	}




	public String getMks_chem() {
		return mks_chem;
	}




	@Override
	public String toString() {
		return "StdData [stdId=" + stdId + ", stdName=" + stdName + ", mks_phy=" + mks_phy + ", mks_chem=" + mks_chem
				+ "]";
	}
	
}

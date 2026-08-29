package com.annotation.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stdprocess")
public class StdProcess {
	@Autowired
	StdData sd;

	public StdProcess() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StdProcess [sd=" + sd + "]";
	}
	//this for the total
	int getTot(StdData sd) {
		return (Integer.parseInt(sd.getMks_chem())+Integer.parseInt(sd.getMks_phy()));
	}
	
	//for the finding the avg
	int getAvg(StdData sd) {
		return this.getTot(sd)/2;
	}
	
	//it check the candidate pass or fail
	String  getStatus(StdData sd) {
		int total=this.getAvg(sd);
		if(total>35) {
			return "pass";
		}
		else {
			return "Fail";
		}
	  }
	
	 //it is for the check the grade
	char getGrade(StdData sd) {
		int mark=this.getAvg(sd);
		
		if (mark>=90) {
			return 'A';
		}
		else if(mark>=80) {
			return 'B';
		}
		else {
			return 'C';
		}
	}
	
	void showResult() {
		System.out.println("Total mark is:"+this.getTot(sd)+"  "+"Average is:"+this.getAvg(sd));
		System.out.println();
		System.out.println("Result Status:"+this.getStatus(sd)+"  "+"Grade Point is:"+this.getGrade(sd));
	}
	

}

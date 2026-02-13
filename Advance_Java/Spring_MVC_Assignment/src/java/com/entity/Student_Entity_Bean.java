package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud")
public class Student_Entity_Bean {
   @Id
   @Column
   private Integer stdId;
   @Column(name="stdname")
   private String stdName;
   @Column(name="city")
   private String city;
   
   public Student_Entity_Bean() {
	super();
	// TODO Auto-generated constructor stub
   }

   public Student_Entity_Bean(Integer stdId, String stdName, String city) {
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

@Override
public String toString() {
	return "Student_Entity_Bean [stdId=" + stdId + ", stdName=" + stdName + ", city=" + city + "]";
}
   
     
   
   
   
}

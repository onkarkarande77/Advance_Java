package com.entity.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stdbean")
public class StdEntity_Bean {
	@Id
	@Column
	private Integer stdId;
	@Column
	private String stdName;
    @Column
    private String city;
	
    public StdEntity_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StdEntity_Bean(Integer stdId, String stdName, String city) {
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

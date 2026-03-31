package com.cust;

public class CustomerBean {
	//prop
	private String custId;
	private String custName;
	
	public CustomerBean() {
		super();
	}
	
	public CustomerBean(String custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "CustomerBean [custId=" + custId + ", custName=" + custName + "]";
	}
  
	 
}

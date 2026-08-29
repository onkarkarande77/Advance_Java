package com.bean;

public class PaymentRequest {
	private String custId;

	public PaymentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentRequest(String custId) {
		super();
		this.custId = custId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "PaymentRequest [custId=" + custId + "]";
	}
	
	

}

package com.bean;

public class PaymentResponse {
	
	private String auth_status;

	public PaymentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentResponse(String auth_status) {
		super();
		this.auth_status = auth_status;
	}

	public String getAuth_status() {
		return auth_status;
	}

	public void setAuth_status(String auth_status) {
		this.auth_status = auth_status;
	}

	
}

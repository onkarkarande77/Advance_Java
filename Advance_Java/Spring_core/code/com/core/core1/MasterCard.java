package com.core;

public class MasterCard implements Card {

	@Override
	public boolean verify(String cardNo) {
		// TODO Auto-generated method stub
		System.out.println("verification successful");
		return true;
	}

}

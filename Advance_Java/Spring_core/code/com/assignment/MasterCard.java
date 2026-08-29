package com.Assignment;

import com.Assignment.Card;

public class MasterCard implements Card {

	@Override
	public boolean verify(String cardNo) {
		// TODO Auto-generated method stub
		System.out.println("Verification successful Master Card");
		return true;
	}

}

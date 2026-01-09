package com.Assignment;

import java.util.Scanner;

public class CardAppClass {
  private Card  ca;

    public Card getCa() {
	return ca;
}

public void setCa(Card ca) {
	this.ca = ca;
}

public void payment(String cardNo,int amt) {
	   
	if(ca.verify(cardNo)) {
		  System.out.println("payment successful "+amt);
	  }
	   
	   }
   }
  
  
 


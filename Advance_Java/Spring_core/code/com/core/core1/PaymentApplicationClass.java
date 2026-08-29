package com.core;

public class PaymentApplicationClass {
   private Card card;

         public Card getCard() {
	        return card;
            }

      public void setCard(Card card) {
	      this.card = card;
         }
   
public void pay(String cardNo,int amt) {
	  if(card.verify(cardNo)) {
		  System.out.println("payment successful "+amt);
	  }
}   
   
}

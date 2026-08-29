package com.Assignment;

 
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayChoice {
	
	private ApplicationContext ctx;

	public PayChoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PayChoice(ApplicationContext ctx) {
		super();
		this.ctx = ctx;
	}
	
	 public void payChoice(int ch,String cardNo,int amt) {
		 CardAppClass app=null;
		
		 
		 switch(ch) {
		 case 1:app=ctx.getBean("pc",CardAppClass.class);
		        System.out.println("payement by the mastercard");
		        break;
		 case 2:app=ctx.getBean("na",CardAppClass.class);
		        System.out.println("payment by the visacard");
		        break;
		 default:System.out.println("enter valide choice");
		         return;
		 }
		 app.payment(cardNo, amt);
	 }
    
    
	
}

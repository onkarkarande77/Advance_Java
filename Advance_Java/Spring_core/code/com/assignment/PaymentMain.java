package com.Assignment;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new  ClassPathXmlApplicationContext("applicationContext.xml");
		// PayChoice cp=new PayChoice();
		
		    System.out.println("please select card type ");
		    Scanner sc=new Scanner(System.in);
		    System.out.println("1.MasterCard"+"\n"+"2.VisaCard");
		    int ch=sc.nextInt();
		    System.out.println("Enter your card no ");
		    String cardNo=sc.next();
		    System.out.println("enter amount " );
		    int amt=sc.nextInt();
		    
		    PayChoice pc=new PayChoice(ctx);
		    pc.payChoice(ch, cardNo, amt);
		 
        
	}

}

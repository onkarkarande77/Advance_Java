package com.core.internal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p=ctx.getBean("per",Person.class);
		System.out.println(p);
		
		//this part of normal core java
		Address ad=new Address("solapur","MH");
		Person ps=new Person(1,"java",ad);
	    System.out.println(ps);

	}

}

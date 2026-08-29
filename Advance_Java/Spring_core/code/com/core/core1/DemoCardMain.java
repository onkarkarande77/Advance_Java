package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoCardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		PaymentApplicationClass pa=ctx.getBean("p",PaymentApplicationClass.class);
		pa.pay("1000adji ",100);

	}

}

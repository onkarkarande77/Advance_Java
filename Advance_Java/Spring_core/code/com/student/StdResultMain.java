package com.annotation.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StdResultMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		StdProcess sp=ctx.getBean("stdprocess",StdProcess.class);
		System.out.println(sp);
		sp.showResult();

	}

}

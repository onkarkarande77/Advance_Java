package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	  ListData ld=ctx.getBean("std",ListData.class);
	   ld.showStdData();
	
	}
}

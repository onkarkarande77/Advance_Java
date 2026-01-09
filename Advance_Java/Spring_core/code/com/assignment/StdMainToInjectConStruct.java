package com.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StdMainToInjectConStruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StdBean sb=ctx.getBean("st",StdBean.class);
		sb.stdDisp();
	
	}

}

package com.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class loginDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		LoginBean l=ctx.getBean("lb",LoginBean.class);
		System.out.println(l);
	}

}

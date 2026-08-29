package com.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StdAnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st=ctx.getBean("ok",Student.class);
        System.out.println(st);
	}

}

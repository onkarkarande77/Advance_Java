package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//start the container
		    //it represent the conf file
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
                                        //it search the file in there add+
//get the bean from the container
        //HelloWorld hello=(HelloWorld)ctx.getBean("h");
	     HelloWorld hello=ctx.getBean("h",HelloWorld.class);
	     //invoke the method
	     System.out.println(hello.sayHello("java"));
	     
	     //for another POJO
		SumNo sn=ctx.getBean("s",SumNo.class);
		 int[] result=sn.sumOfTwo(10,30);
		 
		 System.out.println(result[0]);
		 System.out.println(result[1]);
	}

}

package com.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("pe")
public class Person{
  @Value("10")
  private Integer per_id;
  private String per_name;
  
  @Autowired
  private Address ad;

  public Person() {
	super();
	// TODO Auto-generated constructor stub
   }

  @Override
  public String toString() {
	return "Person [per_id=" + per_id + ", per_name=" + per_name + ", ad=" + ad + "]";
  }
  
  public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	Person p1=ctx.getBean("pe",Person.class);
	System.out.println(p1);
} 
  

	 
}

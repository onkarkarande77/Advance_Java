package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

 
public class PersonDaoMain {
  public static void main(String[] args) {
	 ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
     JdbcPersonDAO jd=ctx.getBean("pdao",JdbcPersonDAO.class);
     Person p=new Person();
     p.setId(4);
     p.setName("spring");
    jd.create(p);
    System.out.println(jd.retrieve(4));
  }
}

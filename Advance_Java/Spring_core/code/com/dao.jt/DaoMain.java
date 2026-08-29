package com.dao.jt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
      JdbcPersonDao jd=ctx.getBean("pdaos",JdbcPersonDao.class);
      //PersonDAO jd=ctx.getBean("pdaos",PersonDAO.class); 
      Person p=new Person();
      p.setId(7);
      p.setName("java");
      jd.create(p);
      System.out.println(jd.retrieve(10));
      System.out.println(jd.fetchAll());
	
	}

}

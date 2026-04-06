package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//load the configuration file
		/*Configuration conf=new Configuration();
		conf.configure("sleep.cgf.xml"); //loads hibernate.cfg.xml file
		//get the session factory
		SessionFactory sf=conf.buildSessionFactory();*///buildsessionfactory-it will return pool of connection
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		//get the session or connection
		Session s=sf.openSession();
		InventoryBean ib=new InventoryBean();
		//ib.setVend_id(26);     //injecting values into the bean
		//ib.setVend_name("java");
		//begin the transaction
		//Transaction tx=s.beginTransaction();//dml operation
		//mark the entry
	   //s.persist(ib); //in persistent state(hibernaet container)-object will go from transient state to persistent state (not go in the db)
		//tx.commit(); //object pushed to DB-DETACHED STATE
		//System.out.println("all done");
		//to fetch data
		//s.get(InventoryBean.class, 29);
		//System.out.println(s.get(InventoryBean.class, 27));
		//System.out.println(s.get(InventoryBean.class, 28));
		//System.out.println(s.get(InventoryBean.class, 29));
		//System.out.println(s.load(InventoryBean.class, 89));
	   	//System.out.println(s.get(InventoryBean.class, 27));
		//s.close();
	    //System.out.println(s.get(InventoryBean.class, 27));
        //s.close();
        //sf.close();
		
       InventoryBean ref=s.get(InventoryBean.class,27);
       Transaction tx=s.beginTransaction();
       //s.persist(26);
       //s.delete(ref);
       s.update(s.get(InventoryBean.class,29));
       tx.commit();
		//Session s1=sf.openSession();
		//System.out.println(s1.get(InventoryBean.class, 27));
		//sf.close();



	}

}

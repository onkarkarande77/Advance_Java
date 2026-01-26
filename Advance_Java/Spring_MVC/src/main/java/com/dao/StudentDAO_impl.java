package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.StudentBean;
import com.entity.bean.StdEntity_Bean;
import com.fasterxml.jackson.core.format.InputAccessor.Std;

@Repository("std_dao")
public class StudentDAO_impl implements StudentDAO_I {
   @Autowired
	SessionFactory sf;
   
   
   @Override
	public boolean create(StudentBean sb) {
		// TODO Auto-generated method stub
	   Session s=sf.getCurrentSession();
	   
	   StdEntity_Bean bean=new StdEntity_Bean();
	   bean.setStdId(sb.getStdId());
	   bean.setStdName(sb.getStdName());
	   bean.setCity(sb.getCity());
	   
	   s.persist(bean);
	   
		return true;
	}


@Override
public List<StudentBean> getAllRecs() {
	// TODO Auto-generated method stub
	List<StudentBean> sbean=new ArrayList<StudentBean>();
	try {
	Session s=sf.getCurrentSession();
	Query<StdEntity_Bean> q=s.createQuery("from StdEntity_Bean",StdEntity_Bean.class);
	
	//get all record
	List<StdEntity_Bean> list=q.getResultList();
	for(int i=0;i<list.size();i++) {
		StdEntity_Bean sb=list.get(i);
		StudentBean std=new StudentBean();
		std.setStdId(sb.getStdId());
		std.setStdName(sb.getStdName());
		std.setCity(sb.getCity());
		
		sbean.add(std);
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	return sbean;
}

}

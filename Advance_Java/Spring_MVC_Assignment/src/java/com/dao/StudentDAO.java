package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.StudentBean;
import com.entity.Student_Entity_Bean;

@Repository("std_dao")
public class StudentDAO implements Student_entity_I {
	@Autowired
	SessionFactory sf;
 
	@Override
	public boolean create(StudentBean std) {
		// TODO Auto-generated method stub
		try {
			Session s=sf.getCurrentSession();
			Student_Entity_Bean bean=new Student_Entity_Bean();
			bean.setStdId(std.getStdId());
			bean.setStdName(std.getStdName());
			bean.setCity(std.getCity());
			
			 s.persist(bean);
			
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

}

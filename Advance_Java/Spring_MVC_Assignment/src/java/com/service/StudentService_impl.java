package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.StudentBean;
import com.dao.Student_entity_I;

@Service("serv")
public class StudentService_impl implements StudentService_I {
	@Autowired
	Student_entity_I std_dao;
	

	@Override
	@Transactional
	public boolean create(StudentBean std) {
		// TODO Auto-generated method stub
		return std_dao.create(std);
	}

}

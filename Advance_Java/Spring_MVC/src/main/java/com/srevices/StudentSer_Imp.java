package com.srevices;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.StudentBean;
import com.dao.StudentDAO_I;

@Service("serv")
public class StudentSer_Imp implements StudentServices {
	@Autowired
	private StudentDAO_I std_dao;

	@Override
	@Transactional
	public boolean create(StudentBean sb) {
		// TODO Auto-generated method stub
		return std_dao.create(sb);
	}

	@Override
	@Transactional
	public List<StudentBean> getAllRecs() {
		// TODO Auto-generated method stub
		return std_dao.getAllRecs();
	}

}

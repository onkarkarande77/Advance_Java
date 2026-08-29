package com.dao;

import java.util.List;

import com.bean.StudentBean;

public interface StudentDAO_I {
	
	boolean create(StudentBean sb);
	List<StudentBean> getAllRecs();
}

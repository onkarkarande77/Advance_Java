package com.srevices;

import java.util.List;

import com.bean.StudentBean;

public interface StudentServices {
	
	boolean create(StudentBean sb);
	List<StudentBean> getAllRecs();

}

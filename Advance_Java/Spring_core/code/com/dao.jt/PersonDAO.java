package com.dao.jt;

import java.util.List;

public interface PersonDAO {

	int create(Person p);
	 
	 Person retrieve(int id);
	 
	List<Person> fetchAll();
}

package com.dao;

public interface PersonDAO {

	 boolean create(Person p);
	 
	 Person retrieve(int id);
}

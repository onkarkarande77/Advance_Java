package com.dao.jt;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Query;

@Repository("pdaos")
public class JdbcPersonDao implements PersonDAO {
	@Autowired          //automatic creation of the object and inject it
	//private DataSource ds;
	private JdbcTemplate jt;//it is spring driver class 

	@Override
	public int create(Person p) {
		// TODO Auto-generated method stub
		int r=0;
		try {
		 r=jt.update("insert into Person values(?,?)",p.getId(),p.getName());
		if(r>0) {
			System.out.println("Done");
		}
		}
		catch(Exception e) {
			
			System.out.println("dupplicate entery");
			e.printStackTrace();
		
		}
		return r;
	}

	@Override
	public Person retrieve(int id) {
		// TODO Auto-generated method stub
		//this for query for the object
		Person p=null;
		try {
			 p=jt.queryForObject("select * from person where id=?",BeanPropertyRowMapper.newInstance(Person.class),id);
		}
		 catch(Exception e) {
			 System.out.println("u entered invalid id");
			 e.printStackTrace();
		 } 
		
		return p; 
	} 

	@Override
	public List<Person> fetchAll() {
		// TODO Auto-generated method stub
		List<Person> pl=null;
		try {
	   pl=jt.query("Select * from Person",BeanPropertyRowMapper.newInstance(Person.class));
		}
		catch(Exception e) {
			System.out.println("Enter valid table name");
			e.printStackTrace();
		}
		
		return pl;
	}
}

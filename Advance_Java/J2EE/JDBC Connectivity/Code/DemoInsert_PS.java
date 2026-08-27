package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DemoInsert_PS { 

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Connection conn;
		PreparedStatement prp;
		String qry="insert into cust_detail values(?,?)";
		MysqlDataSource ds;
		
		try
		{  
			//DB connection part
			ds=new MysqlDataSource();
			ds.setUser("root");
			ds.setPassword("root");
			ds.setServerName("localhost");
			ds.setDatabaseName("db_j2ee");
			ds.setPort(3306);
			
			conn=ds.getConnection();
			prp=conn.prepareStatement(qry);
			
		    prp.setInt(1,Integer.parseInt(args[0]));
		    prp.setString(2, args[1]);
		    
		    int row=prp.executeUpdate();
		   // System.out.println(column);    // how many rows affected is stored in row variable
		    if(row>0)
		    	System.out.println("success");
		    else
		    	System.out.println("fail");

		    
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

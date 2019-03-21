package com.evry.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbutil 
{
//	Connection con = null;
//	final String db_url = "jdbc:mysql://localhost/testdb";
//	final String user = "root";
//	final String password = "veronika25";
//	try
//	{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//	    con = DriverManager.getConnection(db_url, user, password);
//	}
//	catch(SQLException exception) 
//	{
//		exception.printStackTrace();
//	}
//	catch(ClassNotFoundException ex) 
//	{
//		ex.printStackTrace();
//	}
//	return con;
//    }
	
	public static Connection con = null;
	public static Statement st = null;
	public static Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","veronika25");
		
			
			
			
		}catch(Exception e) {
			
		}
		return con;
	}

}
	


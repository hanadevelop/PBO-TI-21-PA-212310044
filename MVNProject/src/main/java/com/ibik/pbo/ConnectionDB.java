package com.ibik.pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private Connection conn;
	
	public Connection connect() throws SQLException {
		String host = "127.0.0.1:3306";
		String dbName = "university";
		String dbuser = "root";
		String dbpassword = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+"/"+dbName,
					dbuser, dbpassword);
		
		return conn;		
	}	
	
	public Connection close() throws SQLException {
		conn.close();
		return conn;
	}
}




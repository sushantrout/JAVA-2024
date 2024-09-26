package com.tech.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static final String URL = "jdbc:postgresql://localhost:5433/employee-db";
	static final String USERNAME = "postgres";
	static final String PASSWORD = "admin";
	static Connection connection = null;
	
	public static Connection getConnection() throws SQLException {
		if(connection == null) {
			connection = DriverManager.getConnection(URL, USERNAME , PASSWORD);	
		}
		return connection;
	}
}

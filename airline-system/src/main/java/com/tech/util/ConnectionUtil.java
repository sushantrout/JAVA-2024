package com.tech.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {
    private static final String URL = "jdbc:postgresql://localhost:5433/airline-sysrtem";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "admin";
    
	private static Connection connection = null;

	public static Statement getStatement() throws SQLException {
		if(connection == null) {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		
		Statement statement = connection.createStatement();
		return statement;
	}
	
	public static PreparedStatement prepareStatement(String sql) throws SQLException {
		if(connection == null) {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		
		return connection.prepareStatement(sql);
	}
}

package com.tech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//Singleton design pattern
public class DatabaseDetail {
	static final String URL = "jdbc:postgresql://localhost:5433/mydatabase919";
	static final String USERNAME = "postgres";
	static final String PASSWORD = "admin";
	static final Scanner SCANNER = new Scanner(System.in);
	static Connection connection = null;

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

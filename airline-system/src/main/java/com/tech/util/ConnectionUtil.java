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

	public static Connection getConnection() throws SQLException {
		if(connection == null) {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		return connection;
	}
}

package com.tech;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemoInsert extends DatabaseDetail {

	public static void main(String[] args) throws SQLException {
		Statement statement = getStatement();
		
		System.out.println("Enter your username:");
		String username = SCANNER.nextLine();
		
		System.out.println("Enter your password:");
		String password = SCANNER.nextLine();
		
		String sqlQuery = "select *from app_user where username = '"+username+"' and password='"+password+"';";
		
		System.out.println(sqlQuery);
		
		ResultSet executeQuery = statement.executeQuery(sqlQuery);
		
		while(executeQuery.next()) {
			System.out.println("SUCCESS " + executeQuery.getString("username"));
		}
		
	}
}

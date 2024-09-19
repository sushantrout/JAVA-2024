package com.tech;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo extends DatabaseDetail {	

	public static void main(String[] args) throws SQLException {
		
		Statement statement = getStatement();
		
		String selectQuery = "SELECT *FROM satya;"; //SQL statement
		
		ResultSet resultSet = statement.executeQuery(selectQuery); //Execute the quesry in database and fetch the data from database
		
		System.out.println("ID\tNAME");
		System.out.println("-----------------");
		while(resultSet.next()) {
			String id = resultSet.getString(1);
			String name = resultSet.getString(2);
			
			System.out.println(id +"|\t|"+name);
			System.out.println("-----------------");
			
		}
	}
}

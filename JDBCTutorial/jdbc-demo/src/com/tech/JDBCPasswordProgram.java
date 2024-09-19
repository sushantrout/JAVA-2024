package com.tech;

import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPasswordProgram extends DatabaseDetail{

	public static void main(String[] args) throws SQLException {
		Statement statement = getStatement();
		
		/*
		 * String insertQuery = "INSERT INTO satya(id , name) values ('6', 'Six');" +
		 * " INSERT INTO satya(id , name) values ('7', 'Seven');"; //SQL statement
		 */		
		/*
		 * String selectQuery =
		 * "insert into satya (id, name) values ('12', 'TW'), ('13', 'TH')";
		 */
		
		System.out.println("Enter ID:");
		String ID = SCANNER.nextLine();
		
		System.out.println("Enter NAME:");
		String NAME = SCANNER.nextLine();
		
		String insertQuery = "insert into satya (id, name) values ('"+ID+"', '" + NAME+"')";
		
		System.out.println(insertQuery);
		
		int count = statement.executeUpdate(insertQuery);
		
		System.out.println("INSERT " + count);

		
	}
}

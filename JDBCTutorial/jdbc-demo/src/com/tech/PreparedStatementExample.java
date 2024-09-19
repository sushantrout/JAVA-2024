package com.tech;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample extends DatabaseDetail {

	public static void main(String[] args) throws SQLException {
		PreparedStatement prepareStatement = prepareStatement("INSERT INTO app_user(username, password) values(?,?)");
		
		System.out.println("Enter username: ");
		String username = SCANNER.nextLine();
		
		System.out.println("Enter password: ");
		String password = SCANNER.nextLine();
		
		prepareStatement.setString(1, username);
		prepareStatement.setString(2, password);
		
		int executeUpdate = prepareStatement.executeUpdate();
		
		System.out.println("INSERT " + executeUpdate);
		
		
	}
}

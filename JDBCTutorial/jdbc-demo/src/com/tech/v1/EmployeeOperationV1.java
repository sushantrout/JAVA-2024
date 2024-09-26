package com.tech.v1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeOperationV1 {

	private final static Scanner SCANNER = new Scanner(System.in);

	public void insert() throws SQLException {
		System.out.println("Enter your id");
		Long id = SCANNER.nextLong();

		System.out.println("Enter your name");
		SCANNER.nextLine();
		String name = SCANNER.nextLine();

		System.out.println("Enter your zipCode");
		String zipCode = SCANNER.nextLine();

		// Employee employee = new Employee(id, name, zipCode);

		Connection connection = DBConnection.getConnection();
		PreparedStatement prepareStatement = connection
				.prepareStatement("INSERT INTO employee(id, name, zip_code) values (?,?,?)");
		prepareStatement.setLong(1, id);
		prepareStatement.setString(2, name);
		prepareStatement.setString(3, zipCode);

		int executeUpdate = prepareStatement.executeUpdate();

		System.out.println("INSERT " + executeUpdate);

	}

	public void update() throws SQLException {
		System.out.println("Input your ID for update: ");
		int id = SCANNER.nextInt();
		
		System.out.println("Enter your name");
		SCANNER.nextLine();
		String name = SCANNER.nextLine();

		System.out.println("Enter your zip code");
		String zipCode = SCANNER.nextLine();
		
		Connection connection = DBConnection.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement("UPDATE employee set name = ? , zip_code = ? where id = ?");
		prepareStatement.setString(1, name);
		prepareStatement.setString(2, zipCode);
		prepareStatement.setLong(3, id);
		
		int executeUpdate = prepareStatement.executeUpdate();
		System.out.println("Updated " + executeUpdate);

	}

	public void delete() throws SQLException {
		System.out.println("Input your ID for deletion: ");
		Long id = SCANNER.nextLong();
		
		Connection connection = DBConnection.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement("DELETE FROM employee WHERE id = ? ");
		prepareStatement.setLong(1,  id);
		
		int executeUpdate = prepareStatement.executeUpdate();
		System.out.println("DELETED : " + executeUpdate);

	}

	public void view() throws SQLException {
		Connection connection = DBConnection.getConnection();
		Statement employeeViewQuery = connection.createStatement();
		ResultSet executeQuery = employeeViewQuery.executeQuery("SELECT *FROM EMPLOYEE ORDER BY id");
		
		
		while(executeQuery.next()) {
			//JDBC OOPS
			Employee employee = new Employee(executeQuery.getLong("id"), executeQuery.getString("name"),
					executeQuery.getString("zip_code"));
			
			System.out.println(employee);
		}
	}
}

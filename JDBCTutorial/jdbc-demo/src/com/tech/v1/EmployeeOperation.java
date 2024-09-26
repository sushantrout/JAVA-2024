package com.tech.v1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeOperation {
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

		PreparedStatement prepareStatement = manageData("INSERT INTO employee(id, name, zip_code) values (?,?,?)", id,
				name, zipCode);

		System.out.println("INSERT " + prepareStatement.executeUpdate());

	}

	public void update() throws SQLException {
		System.out.println("Input your ID for update: ");
		Long id = SCANNER.nextLong();

		System.out.println("Enter your name");
		SCANNER.nextLine();
		String name = SCANNER.nextLine();

		System.out.println("Enter your zip code");
		String zipCode = SCANNER.nextLine();

		PreparedStatement manageData = manageData("UPDATE employee set name = ? , zip_code = ? where id = ?", id, name,
				zipCode);
		System.out.println("Updated " + manageData.executeUpdate());
	}

	// JDBC Template
	private PreparedStatement manageData(String query, Long id, String name, String zipCode) throws SQLException {
		Connection connection = DBConnection.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		prepareStatement.setString(1, name);
		prepareStatement.setString(2, zipCode);
		prepareStatement.setLong(3, id);
		return prepareStatement;
	}

	public void delete() {
		System.out.println("Delete");

	}

	public void view() throws SQLException {
		Connection connection = DBConnection.getConnection();
		Statement employeeViewQuery = connection.createStatement();
		ResultSet executeQuery = employeeViewQuery.executeQuery("SELECT *FROM EMPLOYEE ORDER BY id");

		System.out.println("ID \t| NAME \t| ZIP CODE");
		System.out.println("==================================================");
		while (executeQuery.next()) {
			// JDBC with OOPS
			Employee employee = new Employee(executeQuery.getLong("id"), executeQuery.getString("name"),
					executeQuery.getString("zip_code"));
			System.out.println(employee);
		}
	}

}

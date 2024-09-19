package com.tech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcExample {

    // Database credentials
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5433/testdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) {
        try {
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
                System.out.println("Connected to the database!");
                //createTable(connection);
            for(int id = 1; id <= 10; id++) {
                    insertData(connection, id, "John Doe", "john.doe@example.com");
                }
                //fetchData(connection);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (" +
                "id INT, " +
                "name VARCHAR(255), " +
                "email VARCHAR(255))";
        try (PreparedStatement preparedStatement = connection.prepareStatement(createTableSQL)) {
            preparedStatement.execute();
            System.out.println("Table 'employees' created or already exists.");
        }
    }

    private static void insertData(Connection connection, int id, String name, String email) throws SQLException {
        String insertSQL = "INSERT INTO employees (id, name, email) VALUES (?,?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, email);
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully.");
            }
        }
    }

    private static void fetchData(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM employees";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            System.out.println("Employee data:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.printf("ID: %d, Name: %s, Email: %s%n", id, name, email);
            }
        }
    }
}

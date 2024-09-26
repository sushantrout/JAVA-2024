package com.tech;

import java.sql.*;

public class ResultSetTests {
    // Database credentials
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5433/testdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            System.out.println("Before first() " + resultSet.isBeforeFirst());
            System.out.println("id | name | email");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("id: " + id + ", name: " + name + ", email: " + email);
                resultSet.first();
            }

            System.out.println("Before last() " + resultSet.isAfterLast());

            boolean last = resultSet.last();
        }
    }
}

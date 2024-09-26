package com.tech;

import javax.sql.RowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetDemo {
    public static void main(String[] args) throws SQLException {
        RowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

        rowSet.setUrl("jdbc:postgresql://localhost:5433/testdb");
        rowSet.setUsername("postgres");
        rowSet.setPassword("admin");

        rowSet.setCommand("SELECT * FROM employees");

        rowSet.execute();

        System.out.println("id | name | email");
        while (rowSet.next()) {
            int id = rowSet.getInt("id");
            String name = rowSet.getString("name");
            String email = rowSet.getString("email");
            System.out.println("id: " + id + ", name: " + name + ", email: " + email);
        }

        System.gc();

    }
}

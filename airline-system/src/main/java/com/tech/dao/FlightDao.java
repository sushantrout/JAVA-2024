package com.tech.dao;

import com.tech.model.Flight;
import com.tech.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FlightDao {
    public void addFlight(Flight flight) {
        try {
            Connection connection = ConnectionUtil.getConnection();
            try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO flight (flight_number, destination) VALUES (?, ?)")) {
                preparedStatement.setString(1, flight.getFlightNumber());
                preparedStatement.setString(2, flight.getDestination());
                preparedStatement.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Flight> viewFlights() {
        List<Flight> flights = new ArrayList<>();
        try {
            Connection connection = ConnectionUtil.getConnection();
            try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT flight_number, destination FROM flight")) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Flight flight = new Flight();
                        flight.setFlightNumber(resultSet.getString("flight_number"));
                        flight.setDestination(resultSet.getString("destination"));
                        flights.add(flight);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flights;
    }
}

package com.tech.servlet;

import com.tech.dao.FlightDao;
import com.tech.model.Flight;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/manage-flight")
public class MnageFlightServlet extends HttpServlet {
    private FlightDao flightDao;

    @Override
    public void init() throws ServletException {
        flightDao = new FlightDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get action from the request
        String action = req.getParameter("action");

        try {
            switch (action) {
                case "add":
                    addFlight(req, resp);
                    break;
                case "edit":
                    editFlight(req, resp);
                    break;
                case "delete":
                    deleteFlight(req, resp);
                    break;
                case "view":
                    viewFlights(req, resp);
                    break;
                default:
                    resp.sendRedirect("error.jsp"); // Redirect to an error page if action is invalid
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    private void addFlight(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String flightNumber = req.getParameter("flightNumber");
        String destination = req.getParameter("destination");
        Flight flight = new Flight();
        flight.setFlightNumber(flightNumber);
        flight.setDestination(destination);
        flightDao.addFlight(flight);
        viewFlights(req, resp);
    }

    private void editFlight(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String flightNumber = req.getParameter("flightNumber");

        viewFlights(req, resp);
    }

    private void deleteFlight(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String flightNumber = req.getParameter("flightNumber");


        viewFlights(req, resp);
    }

    private void viewFlights(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setAttribute("flights", flightDao.viewFlights());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("flight.jsp");//.forward(req, resp);
        requestDispatcher.include(req, resp);
    }
}

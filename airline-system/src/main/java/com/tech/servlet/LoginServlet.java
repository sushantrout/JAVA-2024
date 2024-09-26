package com.tech.servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tech.util.ConnectionUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		try {
			PreparedStatement userSelectStatement = ConnectionUtil
					.prepareStatement("SELECT *FROM application_user WHERE username=? and password = ?");
			userSelectStatement.setString(1, username);
			userSelectStatement.setString(2, password);

			ResultSet executeQuery = userSelectStatement.executeQuery();

			if (executeQuery.next()) {
				resp.sendRedirect("/airline-system/login-success.jsp");
			} else {
				resp.sendRedirect("/airline-system/login-fail.jsp");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

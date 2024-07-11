package com.controllers;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver"); // Replace with your JDBC driver class
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "TAOCT23068");
            String sql = "SELECT * FROM students WHERE name LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + query + "%");
            resultSet = stmt.executeQuery();

            request.setAttribute("resultSet", resultSet);
            request.getRequestDispatcher("/index.jsp").forward(request, response);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

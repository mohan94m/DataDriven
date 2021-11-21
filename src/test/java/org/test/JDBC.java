package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establishing connection, username, password
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mohan", "root",
				"mohan@94kumar");
		// Create statement
		Statement statement = connection.createStatement();
		// Execute query
		ResultSet resultSet = statement.executeQuery("select studentName from user where Id = 1;");// Shows heading
		resultSet.next(); // Shows value below heading
		String string = resultSet.getString("StudentName");
		System.out.println(string);
		ResultSet resultSet2 = statement
				.executeQuery("select Id, studentName, Age from user where studentName like '%j%';");
		resultSet2.next();
		System.out.println(resultSet2.getString("StudentName"));
		// close statement
		statement.close();
		// close connection
		connection.close();

	}

}

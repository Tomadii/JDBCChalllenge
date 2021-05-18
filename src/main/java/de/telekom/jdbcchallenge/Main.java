package de.telekom.jdbcchallenge;

import java.sql.*;

public class Main {

	final static String DRIVER = "org.mariadb.jdbc.Driver";
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		Class.forName(DRIVER);
		
//		final String URL = "jdbc:mysql://localhost:3306/seadb","seauser","seapass";

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seadb","seauser","seapass");
//		Connection connection = DriverManager.getConnection(URL);
		
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery( "select * from personen");
		
		while(resultSet.next()) {
			System.out.println(resultSet.getLong(1));
			System.out.println(resultSet.getShort(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getString(4));
		}

		statement.executeQuery("insert into personen (ID, ANREDE, VORNAME, NACHNAME) VALUES (3,1,'Heinz','Müller')");
		
		
		
		resultSet.close();
		statement.close();
		connection.close();
		
	}

}

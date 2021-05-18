package de.telekom.jdbcchallenge;

public class Main {
	
	final static String DRIVER = "org.mariadb.jdbc.Driver";

	public static void main(String[] args) {
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	
	}

}

package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/addressbook";
	private static final String USER = "root";
	private static final String PASSWORD = "0513";
	
	public static Connection getConnection() {
		try {			
			return DriverManager.getConnection(URL, USER, PASSWORD);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return null;
		}
	}

}

package healthClinicApp;

import java.sql.*;

public class DBConnection {
	
	private static String url = "jdbc:mysql://127.0.0.1:3306/capgemini";
	private static String username = "root";
	private static String password = "0513";
	
	public static Connection getConnection() throws Exception{
		return DriverManager.getConnection(url, username, password);
	}
}

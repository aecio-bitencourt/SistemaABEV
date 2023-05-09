package abev.util;

import java.sql.*;

public class ConnectionFactory {
	
	public static Connection getConnection() throws Exception{
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/";
			String login = "root";
			String senha = "";
			return DriverManager.getConnection(url, login, senha);
		} catch new 
	}

}

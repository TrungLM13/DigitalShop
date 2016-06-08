package DAO;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionDB {
	
	private static Connection connection = null;
	
	public static void createConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3333/digitalwebdb", "root", "1234");
			
			System.out.println(connection);
		}catch(ClassNotFoundException e){ 
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

		

	public static Connection getConnection() {
		if(connection == null)
			createConnection();
		return connection;
	}


}

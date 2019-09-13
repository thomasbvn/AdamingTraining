package fr.formation.inti.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException{
String hostName="localhost";
String dbName="bd";
String userName="root";
String password="123456";
return getMySQLConnection(hostName,dbName,userName,password);
}

	private static Connection getMySQLConnection(String hostName, String dbName, String userName, String password) 
		// TODO Auto-generated method stub
		throws SQLException, ClassNotFoundException{
			Class.forName("com.mysql.jdbc.Driver");//version5 if needed
		String connectionURL="jdbc:mysql://"+hostName+":3306/"+dbName+"?useSSL=false";
		Connection connection= DriverManager.getConnection(connectionURL,userName,password);
		return connection;
	}
}

package fr.formation.inti.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class AppConnection {
	public static void main(String[] args) throws SQLException,
	ClassNotFoundException{
		System.out.println("Get connection ... ");
		Connection connection=ConnectionUtils.getMySQLConnection();
		System.out.println(connection);
	}
}

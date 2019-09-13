package fr.formation.inti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import fr.formation.inti.utils.ConnectionUtils;

public class StatementExample {
//		public static final String INSERT_EMP="Insert into Employee (FIRST_NAME, LAST_NAME, START_DATE) "
//	+ " VALUES ('tttt', 'tttt', '2019-01-01');" ;
//	
//		public static final String INSERT_EMP2="Insert into Employee (FIRST_NAME, LAST_NAME, START_DATE) "
//	+ " VALUES ('tttt', 'tttt', '2019-01-01');" ;
		
		public static final String DELETE="UPDATE `bd`.`employee` SET `FIRST_NAME` = NULL, `LAST_NAME` = NULL, `START_DATE` = NULL WHERE (`EMP_ID` = '19');" ;
	
	public static void main(String[] args) throws SQLException,
	ClassNotFoundException{
		Connection connection=ConnectionUtils.getMySQLConnection();
		Statement statement=connection.createStatement();
		//int rowCount=statement.executeUpdate(INSERT_EMP);
	}
}
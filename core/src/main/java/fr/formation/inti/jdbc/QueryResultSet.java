package fr.formation.inti.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.formation.inti.utils.ConnectionUtils;

public class QueryResultSet {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*
		 * Connection connection = ConnectionUtils.getMySQLConnection(); Statement
		 * statement=connection.createStatement(); String
		 * sql="Select Emp_Id, First_Name, Last_Name from Employee"; ResultSet
		 * rs=statement.executeQuery(sql); while (rs.next()) { int EmpId =rs.getInt(1);
		 * //rs.getInt("Emp_Id"); String firstName=rs.getString(2); String
		 * lastName=rs.getString("Last_Name"); System.out.println("---");
		 * System.out.println("EmpId:"+EmpId); System.out.println("EmpNo:"+firstName);
		 * System.out.println("EmpName:"+lastName);
		 */

		Connection connection = ConnectionUtils.getMySQLConnection();
		Statement statement = connection.createStatement();
//		String sql = "select first_name, last_name, account.cust_id, account_id, avail_balance from individual,account \r\n"
//				+ "where individual.first_name='Louis' and individual.last_name='Blake'\r\n"
//				+ "and individual.cust_id=account.cust_id";
//		Statement statement=new Statement();
		ResultSet rs = statement.executeQuery(Constantes.sql1);
		int n = 0;
		while (rs.last()) {
			// rs.getInt("Emp_Id");
			String firstName = rs.getString(1);
			String lastName = rs.getString(2);
			int CustId = rs.getInt(3);
			int AccId = rs.getInt(3);
			float availBalance = rs.getFloat(5) + 1000;
			rs.updateFloat(5,availBalance);
//	String INSERT_EMP2="Insert into Employee (FIRST_NAME, LAST_NAME, START_DATE) "
//+ " VALUES ('tttt', 'tttt', '2019-01-01');" ;

//			String sql2 = "UPDATE select first_name, last_name, account.cust_id, account_id, avail_balance from individual,account \\r\\n\" + \r\n"
//					+ "			\"where individual.first_name='Louis' and individual.last_name='Blake'\\r\\n\" + \r\n"
//					+ "			\"and individual.cust_id=account.cust_id SET 'AVAIL_BALANCE` = 'availBalance'; ";
//			ResultSet rs2 = statement.executeQuery(sql2);
			if (n < 1) {
				System.out.println("---");
				System.out.println("CustId:" + CustId);
				System.out.println("EmpFirstName:" + firstName);
				System.out.println("EmpName:" + lastName);
				System.out.println("AccountId:" + AccId);
				System.out.println("Available balance:" + availBalance);
			}
			n++;
		}
	}
}

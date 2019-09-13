package fr.formation.inti.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.formation.inti.utils.ConnectionUtils;

public class PrepareStatementExample {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		int i = 1;
		Connection connection = ConnectionUtils.getMySQLConnection();
		String sql = "Select Emp_Id, First_Name, Last_Name from Employee emp "
				+ " where emp.First_Name like ? and emp.Dept_Id = ? ";
		PreparedStatement pstm = connection.prepareStatement(sql);
		pstm.setString(1, "%s");
		pstm.setInt(2, 1);
		ResultSet rs = pstm.executeQuery();
	}
}

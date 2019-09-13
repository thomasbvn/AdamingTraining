package fr.formation.inti.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.formation.inti.utils.ConnectionUtils;

public class TransactionExample {
	public static void main(String[] args) throws SQLException {
		Connection connection=null; 
		Double somme=25.2;
		try {
			connection = ConnectionUtils.getMySQLConnection();
			connection.setAutoCommit(false);
			
			credit(connection,somme);
			
			debit(connection, somme);
			
			connection.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			connection.rollback();
		}
	}
	private static void credit(Connection connection, Double crdit) 
			throws SQLException, ClassNotFoundException{
		//String sql=ConstantsVirement.UPDATE_CREDIT;
		PreparedStatement pstm = connection.prepareStatement(ConstantsVirement.UPDATE_CREDIT);
		pstm.setDouble(1,crdit);
		pstm.executeUpdate();
	}
	private static void debit(Connection connection, Double dBit) 
			throws SQLException, ClassNotFoundException{
		PreparedStatement pstm = connection.prepareStatement(ConstantsVirement.UPDATE_DEBIT);
		pstm.setDouble(1,dBit);
		pstm.executeUpdate();
		throw new SQLException();
	}
}

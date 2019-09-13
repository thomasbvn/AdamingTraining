package fr.formation.inti.jdbc;

public class Constantes {
	public static final String sql2 = "update "+"select first_name, last_name, account.cust_id, account_id, avail_balance from individual,account \r\n"
			+ "where individual.first_name='Louis' and individual.last_name='Blake'\r\n"
			+ "and individual.cust_id=account.cust_id"+" SET 'Avail_Account";
	public static final String sql1 = "select first_name, last_name, account.cust_id, account_id, avail_balance from individual,account \r\n"
			+ "where individual.first_name='Louis' and individual.last_name='Blake'\r\n"
			+ "and individual.cust_id=account.cust_id";
	//UPDATE `bd`.`individual` SET `BIRTH_DATE` = '196-06-16' WHERE (`CUST_ID` = '9');
}

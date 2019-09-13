package fr.formation.inti.jdbc;

public class ConstantsVirement {
	public static final String UPDATE_CREDIT="UPDATE bd.Account SET AVAIL_BALANCE =  AVAIL_BALANCE + ? WHERE (ACCOUNT_ID = 19)" ;
	public static final String UPDATE_DEBIT="UPDATE bd.Account SET AVAIL_BALANCE =  AVAIL_BALANCE - ? WHERE (ACCOUNT_ID = 18) ;";
			
	//public static final String SELECT_AVAIL_BALANCE="SELECT AVAIL_BALANCE from bd.Account";
}

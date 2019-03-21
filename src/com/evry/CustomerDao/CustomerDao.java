package com.evry.CustomerDao;

import java.sql.SQLException;

import com.evry.model.Account;

public interface CustomerDao {
	public int deposit(Account acc) throws SQLException;
	public int withdraw(int accno) throws SQLException;
	//public int sendmoney() throws SQLException;
	
}

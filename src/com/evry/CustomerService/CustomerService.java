package com.evry.CustomerService;

import java.sql.SQLException;

import com.evry.model.Account;

public interface CustomerService 
{
	
	public int deposit(Account acc) throws SQLException;
	public int withdraw(int accno) throws SQLException;

}

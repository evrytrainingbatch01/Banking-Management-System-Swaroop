package com.evry.CustomerService;

import java.sql.SQLException;

import com.evry.CustomerDao.CustomerDao;
import com.evry.CustomerDao.CustomerDaoImpl;
import com.evry.model.Account;
import com.evry.model.Customer;


public class CustomerServiceImpl implements CustomerService
{
	CustomerDao dao = new CustomerDaoImpl();
	Account acc;
	private double balance;
	long amount;
	
	public int deposit(Account acc) throws SQLException {
		int result = dao.deposit(acc);
		balance = balance + amount;
		return (int) balance;
	
}
	public int withdraw(int accno) throws SQLException{
		int result = dao.withdraw(accno);
		balance = balance - amount;
		return (int) balance;
	}
}

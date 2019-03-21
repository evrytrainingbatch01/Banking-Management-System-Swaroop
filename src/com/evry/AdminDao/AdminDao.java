package com.evry.AdminDao;

import java.sql.SQLException;

import com.evry.model.Customer;

public interface AdminDao 
{
	public int insertCustomer(Customer customer) throws SQLException;
	public int deleteCustomer(String lastname)throws SQLException;
}

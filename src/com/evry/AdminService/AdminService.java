package com.evry.AdminService;

import java.sql.SQLException;

import com.evry.model.Customer;

public interface AdminService 
{
	public String addCustomer(Customer customer) throws SQLException;
	public String deleteCustomer(String lastname) throws SQLException;

}

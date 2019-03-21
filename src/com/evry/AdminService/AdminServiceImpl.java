package com.evry.AdminService;

import java.sql.SQLException;

import javax.print.attribute.standard.RequestingUserName;

import com.evry.AdminDao.AdminDao;
import com.evry.AdminDao.AdminDaoImpl;
import com.evry.model.Customer;

public class AdminServiceImpl implements AdminService
{
	AdminDao dao = new AdminDaoImpl();
	public String addCustomer(Customer customer) throws SQLException
	{
		String alert = "null";
		
		int result = dao.insertCustomer(customer);
		if(result == 0) {
		    alert="customer  is created";}
			else {
				 alert="customers  is not created";
			
				
			}
		return alert;
		}

	
   public String deleteCustomer(String lastname) throws SQLException
   {
	   String alert = "null";
	   int result = dao.deleteCustomer(lastname);
	   if(result == 0) {
		   alert="customer is deleted";}
	   else {
		   alert="customer is not deleted";
	   }
	   return alert;
   }
}



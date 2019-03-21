package com.evry.AdminDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.evry.db.util.Dbutil;
import com.evry.model.Customer;

public class AdminDaoImpl implements AdminDao{
	
	Connection con = Dbutil.getConnectionDetails();
	Statement st = null;
	int result = 0;
	public int insertCustomer(Customer customer) throws SQLException{
		if(con != null)
		{
			st = con.createStatement();
			if(st != null)
			{
				result=st.executeUpdate("insert into customer values("+customer.getFirstname()+","+
                        customer.getLastname()+","+
                        customer.getAge()+","+
                        customer.getCity()+","+
                        customer.getCountry()+","+
                        customer.getMobileno()+")");
			}
		}return result;
	}
	@Override
	public int deleteCustomer(String lastname)throws SQLException
	{
		if(con != null) {
			st = con.createStatement();
			if(st != null) {
				result=st.executeUpdate("delete from customer where lastname =" + lastname);
			}
		}return result;
		
	}

}

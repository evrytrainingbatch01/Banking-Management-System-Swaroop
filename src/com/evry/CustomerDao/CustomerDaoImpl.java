package com.evry.CustomerDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.evry.db.util.Dbutil;
import com.evry.model.Account;

public class CustomerDaoImpl implements CustomerDao {
	Connection con = null;
	Statement st = null;
	int result = 0;
	//CustomerDao dao = new CustomerDaoImpl();
	Account acc;
	private double balance;
	long amount;

	@Override
	public int deposit(Account acc) throws SQLException {
		System.out.println("Enter amount to deposit:");
		if (con != null) {
			st = con.createStatement();
			if (st != null) {
				balance = st.executeUpdate("sql");
				balance = balance + amount;
			}

		}
		return (int) balance;

	}

	@Override
	public int withdraw(int accno) throws SQLException {
		if (con != null) {
			st = con.createStatement();
			if (st != null) {
				amount = st.executeUpdate("withdraw ", +accno);
			}

		}
		return accno;
	}
}

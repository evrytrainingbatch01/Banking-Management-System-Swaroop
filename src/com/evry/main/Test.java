package com.evry.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.evry.AdminService.AdminService;
import com.evry.AdminService.AdminServiceImpl;
import com.evry.CustomerService.CustomerService;
import com.evry.CustomerService.CustomerServiceImpl;
import com.evry.model.Admin;
import com.evry.model.Customer;

public class Test 
{
	public static void main(String[] args) throws SQLException
	{
		AdminService service = new AdminServiceImpl();
		Customer c= new Customer();
		CustomerService services = new CustomerServiceImpl();
		Admin obj = new Admin();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Evrybank");
		System.out.println("********************");
		System.out.println("Enter id:");
	    int id = sc.nextInt();
	    System.out.println("Enter firstname:");
	    String firstname = sc.next();
	    System.out.println("Enter lastname:");
	    String lastname = sc.next();
	    System.out.println("Enter age:");
	    int age = sc.nextInt();
	    System.out.println("Enter city:");
		String city = sc.next();
	    System.out.println("Enter country:");
		String country = sc.next();
		System.out.println("Enter Mobileno:");
		int mobileNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter emailId:");
		String emailId = sc.nextLine();
	
		c.setFirstname(firstname);
		c.setLastname(lastname);
		c.setAge(age);
		c.setCity(city);
		c.setCountry(country);
		c.setMobileno(mobileNo);
		c.setEmailid(emailId);
		
	
		System.out.println(c);
	}
}




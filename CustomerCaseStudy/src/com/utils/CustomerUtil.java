package com.utils;


import java.util.ArrayList;
import java.util.List;

import com.customer.Customer;
import com.customer.ExceptionCustomer;

import static com.customer.ServicePlan.*;


public class CustomerUtil {

	public static List<Customer> initial()
	{
		List<Customer> list=new ArrayList<>();
		
		list.add(new Customer("Ram","xy","xy@gmail.com","123",12000,PLATINUM));
		
		list.add(new Customer("Sham","ab","ab@gmail.org","1234",2000,GOLD));

		list.add(new Customer("Rahul","aaa","aaa@gmail.net","2222",6000,DIAMOND));
		
		return list;

		
	}
	
	
	public static void validate(String emailId,String password,List<Customer> list)
			throws ExceptionCustomer
			{
				Customer c=new Customer(emailId);
				int index=list.indexOf(c);
				if(index==-1)
					throw new ExceptionCustomer("invalid email address");
				if((list.get(index)).getPassword().equals(password))
					System.out.println("Sign In");
				else
					throw new ExceptionCustomer("invalid password");
					
				
					
			}
			
			public static void changePassword(String emailId,String password,String newPassword,List<Customer> list) throws Exception
			{
				validate(emailId,password,list);
				
				Customer c=new Customer(emailId);
				list.get(list.indexOf(c)).setPassword(newPassword);
				System.out.println("Password is Succesfully change");
					
			}
	
}

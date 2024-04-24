package com.customer;

import java.util.List;
import java.util.regex.Pattern;

public class validationCustomer {

	public static Customer validateInput(List<Customer> list,String fname, String lname, String email, String password,
			double registrationAmount, String plan) throws ExceptionCustomer {
		ServicePlan service = validatePlan(plan);
		
		validatEmail(email,list);
		
		validatPassword(email,list);
		
		validateAmount(registrationAmount,service);
		
		
		return new Customer(fname, lname, email, password, registrationAmount, service);
	}

	public static ServicePlan validatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	public static void validatEmail(String str, List<Customer> list) throws ExceptionCustomer {
		if (Pattern.matches("[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)", str)) {
		} else
			throw new ExceptionCustomer("Your email is not following Domain");

		if (list.contains(new Customer(str)))
			throw new ExceptionCustomer("Email is Already Present");

	}
	
	public static void validatPassword(String password,List<Customer> list) throws ExceptionCustomer
	{
	
		if(Pattern.matches("((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})", password))
		{
		}
		else
			throw new ExceptionCustomer("Your password is Weak");
		
		
	}
	
	public static void validateAmount(double registrationAmount,ServicePlan service) throws ExceptionCustomer 
	{
		if(registrationAmount>service.getBalance())
		{
			
		}
		else
		{
			throw new ExceptionCustomer("Registration Amount is less");
		}
	}



}

package com.customer;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
	private int customerId;
	private static int cnt=101;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	ServicePlan plan;
	
	{
		customerId=cnt++;
	}
	
	public Customer(String fname, String lname, String email, String password, double registrationAmount,
			ServicePlan plan) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.plan = plan;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Customer)
			return this.email.equals(((Customer)obj).email);
		return false;
		
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan="
				+ plan + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int compareTo(Customer c) {
		
		if(this.registrationAmount<c.registrationAmount)
			return -1;
		else if(this.registrationAmount>c.registrationAmount)
			return 1;
		else
			return 0;
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	
	
	
	
	
	
	
}

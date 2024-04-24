package com.customer;

public enum ServicePlan {

	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM (10000);
	
	private double balance;
	
	ServicePlan(double balance) 
	{
		this.setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString()
	{
		return name()+" "+balance;
	}
	
	
	
	
	
	



}

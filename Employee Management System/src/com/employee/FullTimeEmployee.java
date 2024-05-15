package com.employee;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {



	private double salary;

	public FullTimeEmployee(int eid, String name, LocalDate dateofjoining, String phoneNumber, String aadhaarNumber,
			double salary) {
		super(eid, name, dateofjoining, phoneNumber, aadhaarNumber);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [salary=" + salary + ", toString()=" + super.toString() + "]";
	}

	
	
	

	
	
	
	
	

	
	
	
	
}

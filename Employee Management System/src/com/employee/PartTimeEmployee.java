package com.employee;

import java.time.LocalDate;

public class PartTimeEmployee extends Employee {

	private double hourPayment;

	public PartTimeEmployee(int eid, String name, LocalDate dateofjoining, String phoneNumber, String aadhaarNumber,
			double hourPayment) {
		super(eid, name, dateofjoining, phoneNumber, aadhaarNumber);
		this.hourPayment = hourPayment;
	}

	public double getHourPayment() {
		return hourPayment;
	}

	public void setHourPayment(double hourPayment) {
		this.hourPayment = hourPayment;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hourPayment=" + hourPayment + ", toString()=" + super.toString() + "]";
	}

	
	
	
}

package com.employee;

import java.time.LocalDate;

public class Employee {

	private int eid;
	private String Name;
	private LocalDate Dateofjoining;
	private String PhoneNumber;
	private String AadhaarNumber;
	
	public Employee(int eid, String name, LocalDate dateofjoining, String phoneNumber, String aadhaarNumber) {
		super();
		this.eid = eid;
		Name = name;
		Dateofjoining = dateofjoining;
		PhoneNumber = phoneNumber;
		AadhaarNumber = aadhaarNumber;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public LocalDate getDateofjoining() {
		return Dateofjoining;
	}

	public void setDateofjoining(LocalDate dateofjoining) {
		Dateofjoining = dateofjoining;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAadhaarNumber() {
		return AadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		AadhaarNumber = aadhaarNumber;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", Name=" + Name + ", Dateofjoining=" + Dateofjoining + ", PhoneNumber="
				+ PhoneNumber + ", AadhaarNumber=" + AadhaarNumber + "]";
	}
	
	
	
	
	
	
}

package com.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.employee.Employee;
import com.employee.FullTimeEmployee;
import com.employee.PartTimeEmployee;

public class validation {

	public static FullTimeEmployee validateFull(int eid, String name, LocalDate dateofjoining, String phoneNumber, String aadhaarNumber,
			double salary,Map<Integer, Employee> map) throws EmployeeException
	{
		validateEid(eid,map);
		validateAdhaar(aadhaarNumber,map);
		
		return new FullTimeEmployee(eid, name, dateofjoining, phoneNumber, aadhaarNumber, salary);
	}
	
	
	public static PartTimeEmployee validatePart(int eid, String name, LocalDate dateofjoining, String phoneNumber, String aadhaarNumber,
			double salary,Map<Integer, Employee> map) throws EmployeeException
	{
		validateEid(eid,map);
		validateAdhaar(aadhaarNumber,map);
		
		return new PartTimeEmployee(eid, name, dateofjoining, phoneNumber, aadhaarNumber, salary);
	}
	
	
	private static void validateAdhaar(String aadhaarNumber, Map<Integer, Employee> map) throws EmployeeException
	{
		
//		map.values().stream().filter(p->p.getAadhaarNumber().equals(aadhaarNumber))
//		.forEach(p-> throw new EmployeeException("Invalid Adhaar");
		
//		map.values().forEach(p->{if(p.getAadhaarNumber().equals(aadhaarNumber))
//								throw new EmployeeException("Invalid Adhaar");});
		
//		map.forEach((p1,p2)->{p2.getAadhaarNumber().equals(aadhaarNumber);
//						throw new EmployeeException("Invalid Adhaar");});
		
		List<Employee> l1=new ArrayList<>(map.values());
		for(Employee e:l1)
		{
			if(e.getAadhaarNumber().equals(aadhaarNumber))
				throw new EmployeeException("Invalid Adhaar");
		}
		
		
	}

	public static void validateEid(int eid,Map<Integer, Employee> map) throws EmployeeException
	{
		if(map.containsKey(eid))
			throw new EmployeeException("Invalid Eid");
		
	}
	
	
}

package com.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.employee.Employee;
import com.employee.FullTimeEmployee;
import com.employee.PartTimeEmployee;

public class EmployeeUtils {

	public static Map<Integer, Employee> populateMap()
	{
		Map<Integer, Employee> map=new HashMap<Integer, Employee>();
		
		map.put(101, new FullTimeEmployee(101,"Rohan",LocalDate.parse("2024-09-05"),"7666","1212",120000));
		map.put(102, new FullTimeEmployee(102,"Sagar",LocalDate.parse("2024-09-01"), "1211","222",90000));
		map.put(103, new PartTimeEmployee(103,"Vinayak",LocalDate.parse("2024-09-05"),"666","212",200));
		map.put(104, new PartTimeEmployee(104,"Abhi",LocalDate.parse("2024-09-02"),"555","999",300));
		map.put(105, new FullTimeEmployee(105,"Amit",LocalDate.parse("2024-09-07"),"444","333",70000));
		
		return map;
	}
}

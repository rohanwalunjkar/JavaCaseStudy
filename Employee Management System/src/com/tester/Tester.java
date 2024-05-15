package com.tester;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.employee.Employee;
import com.employee.FullTimeEmployee;
import com.employee.PartTimeEmployee;
import com.utils.EmployeeUtils;
import com.utils.validation;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc=new Scanner(System.in))
		{	
			Map<Integer, Employee> map=EmployeeUtils.populateMap();
			System.out.println("Application Menu");
			boolean flag=false;
			
			while(!flag)
			{
				try
				{
					System.out.println("1.Add full time employee");
					System.out.println("2.Add part time employee");
					System.out.println("3.Delete an employee by Emp Id");
					System.out.println("4.Search employee details by Aadhaar number");
					System.out.println("5.Display all employee details");
					System.out.println("6.Display all employee details sorted by date of joining");
					System.out.println("0.Exit");
					System.out.println("Enter your Choice");
					
					switch (sc.nextInt())
					{
					case 1: 
						System.out.println("Enter the details eid, name,dateofjoining, phoneNumber,aadhaarNumber,salary ");
						int id=sc.nextInt();
						FullTimeEmployee f=validation.validateFull(id,sc.next(),LocalDate.parse(sc.next()),sc.next(),sc.next(),sc.nextInt(),map);
						map.put(id,f);
						break;
					case 2:
						System.out.println("Enter the details eid, name,dateofjoining, phoneNumber,aadhaarNumber,salary ");
						id=sc.nextInt();
						PartTimeEmployee y=validation.validatePart(id,sc.next(),LocalDate.parse(sc.next()),sc.next(),sc.next(),sc.nextInt(),map);
						map.put(id, y);
						break;
					case 3:
						System.out.println("Enter the Employee Id");
						map.remove(sc.nextInt());
						break;
					case 4:
						System.out.println("Enter the Adhaar no");
						String s=sc.next();
						map.values().stream().filter(p -> p.getAadhaarNumber().equals(s))
							.forEach(p->System.out.println(p));
						
//						map.values().forEach(p->{if(p.getAadhaarNumber().equals(sc.next()))
//												System.out.println(p);});
						break;	
					case 5:
						map.values().forEach(p->System.out.println(p));
						break;	
					case 6:
						map.values().stream().sorted((p1,p2)->p1.getDateofjoining().compareTo(p2.getDateofjoining()))
						.forEach(p->System.out.println(p));
						break;
						
					case 0:
						flag=true;
						System.out.println("Exiting-------");
						
					}
				}
				catch (Exception e) {
					// TODO: handle exception
					sc.nextLine();
					System.out.println(e);
				}
			}
		}
	}

}










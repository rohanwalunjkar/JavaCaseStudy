package com.customer;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static com.utils.CustomerUtil.*;
import static com.customer.validationCustomer.*;



public class CustomerManagementSystem {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{
			List<Customer> list=initial();
			
			boolean flag=false;
			
			while(!flag)
			{
				try 
				{
					System.out.println("1.Sign Up");
					System.out.println("2.Sign In");
					System.out.println("3.Change password");
					System.out.println("4.Un subscribe customer");
					System.out.println("5.Display all customers");
					System.out.println("6.Sort By Registration");
					System.out.println("7.Sort By First Name");
					System.out.println("Enter choice");
					
					switch (sc.nextInt())
					{
					case 1: 
						
						System.out.println("Enter Details fname,lname,email,password,registrationAmount,ServicePlan plan");
						Customer w=validateInput(list,sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next());
						list.add(w);
						break;
						
					case 2:
						System.out.println("Enter the email id and password");
						validate(sc.next(),sc.next(),list);
						break;
						
					case 3:
						System.out.println("Enter the email id and old password,new password");
						changePassword(sc.next(),sc.next(),sc.next(),list);
						break;
						
					case 4:
						System.out.println("Enter the email id and old password");
						String a=sc.next();
						validate(a,sc.next(),list);
						Customer c=new Customer(a);
						list.remove(c);
						break;
						
					case 5:
						for(Customer e:list)
						{
							System.out.println(e);
						}
						
					case 6:
						Collections.sort(list);
						break;
					
					case 7:
						Collections.sort(list,new DescComparator());
						break;

					}

				

				}
				catch(Exception e)
				{
					System.out.println(e);
					e.printStackTrace();
				}
			}
		}
	}

}

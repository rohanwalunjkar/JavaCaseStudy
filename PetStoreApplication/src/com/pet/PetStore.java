package com.pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static com.pet.userUtils.*;
import static com.pet.petUtils.*;

public class PetStore {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{	
			
			Map<Integer, Pet> map=populateMap();
			Map<String, User> u1=present();
			Map<Integer, Order> order=new HashMap<Integer, Order>();
			
			System.out.println("---------Pet Store Application Menu-----------");
			System.out.println("Login");
			System.out.println("Enter the loginId and password");
			String l1=sc.next();
			String p=sc.next();
			
			u1.forEach((p1,p2)->{if(p1.equals(l1) && p2.getPassword().equals(p))
									System.out.println("Login Succesfully");});
			
			
			
			boolean flag=false;
			
			while(!flag)
			{
				try
				{
					System.out.println("1.Add new Pet (Admin only functionality)");
					System.out.println("2.Update Pet details (Admin only functionality)");
					System.out.println("3.Display all available pets");
					System.out.println("4.Order a Pet");
					System.out.println("5.Check order status by Order Id");
					System.out.println("6.Update order status (Admin only functionality)");
					System.out.println("7.Exit");
					
					System.out.println("Enter the choice");
					
					switch (sc.nextInt())
					{
					case 1: 
						if(l1.equals("admin"))
						{
							map.put(106,new Pet(106, "Fish1",Category.FISH, 2000, 50));
						}
						break;
				
					case 2:
						if(l1.equals("admin"))
						{
							
						}
						break;
					
					case 3:
						map.forEach((p1,p2)->System.out.println(p2));
						break;
						
					case 4:
						order.put(10,new Order(10, 102, 2, Status.PLACED));
						break;
						
					case 5:
						System.out.println("Enter order id");
						order.forEach((p1,p2)->{if(p1==sc.nextInt())
								System.out.println(p2.getS1());});
						break;
						
					case 6:
						if(l1.equals("admin"))
						{
							System.out.println("Enter order Status");
							order.forEach((p1,p2)->{if(p1==sc.nextInt())
									p2.setS1(Status.valueOf(sc.next()));});
						}
						break;
											
					}
					
					
				}
				catch(Exception e)
				{
					sc.nextLine();
					e.printStackTrace();
				}
			}
		}

	}

}



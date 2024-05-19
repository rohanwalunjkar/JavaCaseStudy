package com.rohan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static com.rohan.CricketerUtils.*;

public class CricketerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc=new Scanner(System.in))
		{
			boolean flag=false;
			
			Map<String, Cricketer> map=populateMap();
			while(!flag)
			{
				try
				{
					System.out.println("1.Accept minimum 5 Cricketers in the collection.");
					System.out.println("2.Modify Cricketer's rating");
					System.out.println("3.Search Cricketer by name");
					System.out.println("4.Display all Cricketers added in collection");
					System.out.println("5.Display All Cricketers in sorted form by rating.");
					System.out.println("6.Exit");
					
					System.out.println("Enter the Choice");
					
					switch(sc.nextInt())
					{
						case 2:
							System.out.println("Enter email and rating");
							String email=sc.next();
							int rat=sc.nextInt();
							map.values().forEach(p-> {if(p.getEmail_id().equals(email))
											p.setRating(rat);});
							break;
						
						case 3:
							System.out.println("Enter the name of cricketer");
							String emai=sc.next();
							map.values().forEach(p-> {if(p.getName().equals(emai))
								System.out.println("p");});
							break;
							
						case 4:
							for(Cricketer c:map.values())
							{
								System.out.println(c);
							}
							break;
							
						case 5:
							List<Cricketer>l1=new ArrayList<Cricketer>(map.values());
							Comparator<Cricketer> comp=(t1,t2) -> ((Integer)t1.getRating()).compareTo(t2.getRating());
							Collections.sort(l1, comp);
							for(Cricketer a : l1)
								System.out.println(a);
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












package com.item;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.utils.fileUtils;
import com.utils.itemUtils;
import com.utils.validation;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner sc=new Scanner(System.in))
		{
			Map<String, Item> map=itemUtils.populateMap();
			
			boolean flag=false;
			
			while(!flag)
			{
				try
				{
					System.out.println("1.Add Item");
					System.out.println("2.Remove Item");
					System.out.println("3.Sort these details as per Item code");
					System.out.println("4.Sort these details as per Item price");
					System.out.println("7.Display");
					System.out.println("0.Exit");
					
					
					System.out.println("Enter the choice");
					
					switch (sc.nextInt()) {
					case 1: 
						System.out.println("Enter the details itemCode,description,price,shipmentDate");
						Item i=validation.valdateInput(sc.next(),sc.next(),sc.nextDouble(),LocalDate.parse(sc.next().toUpperCase()),map);
						map.put(i.getItemCode(), i);	
						break;
					case 2:
						System.out.println("Enter the Item code");
						String k=validation.validateItemCode(sc.next(),map);
						map.remove(k);
						break;
					case 3:
						List<Item> l=new ArrayList<Item>(map.values());
						Comparator<Item>co=(p1,p2)->((Double)p1.getPrice()).compareTo(p2.getPrice());
						Collections.sort(l,co);
						System.out.println("Enter the file name");
						String st=sc.next();
						fileUtils.Write2(st,l);
						break;
						
					case 4:
						l=new ArrayList<Item>(map.values());
						co=(p1,p2)->p1.getItemCode().compareTo(p2.getItemCode());
						Collections.sort(l,co);
						System.out.println("Enter the file name");
						st=sc.next();
						fileUtils.Write(st,l);
						break;
						
						
//					case 5:
//						List<Item> ll=new ArrayList<Item>(map.values());
//						Comparator<Item>com=(p1,p2)->((Double)p1.getPrice()).compareTo(p2.getPrice());
//						Collections.sort(ll,com);
//						System.out.println("Enter the file name");
//						String st=sc.next();
//						fileUtils.Write(st, ll);
//						break;
					
						
						
					case 5:
						map.forEach((p1,p2)->System.out.println(p2));
						break;
					case 0:
						System.out.println("Program Ends");
						flag=true;
						break;
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
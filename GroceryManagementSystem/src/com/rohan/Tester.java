package com.rohan;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;
import static com.rohan.UtilsGrocery.*;

public class Tester {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{	
			boolean flag=false;
			
			Map<String,Grocery> map=populateMap();
			
			while(!flag)
			{
				try
				{	
					System.out.println("1.Add New grocery item");
					System.out.println("2.Update Quantity Grocery item");
					System.out.println("3.Display grocery item including their name,quantity,price");
					System.out.println("4.Remove all Empty stock item");
					System.out.println("5.Display all product for which stock is update");
					System.out.println("6.Exit");
					
					System.out.println("Enter your Choice ");
					
					switch (sc.nextInt()) {
					case 1: 
						System.out.println("Enter the Details of grocery name,pricePerUnit,quantityInStock,l1");
						String a=sc.next();
						map.put(a,new Grocery(a, sc.nextInt(), sc.nextInt(), LocalDateTime.parse(sc.next())));
						break;
						
					case 2:
						System.out.println("Enter the name of Grocery item and Stock");
						Grocery g=findByName(map,sc.next());
						g.updateItem(sc.nextInt());
						
						break;
					
					case 3:
						for(Grocery h:map.values())
						{
							System.out.println(h);
						}
						
					case 4:
						//System.out.println("Remove All Empty Stock");
						//Grocery g=findByName(map,sc.next());
//						List<Grocery> l1=new ArrayList<Grocery>(map.values());
//						Iterator<Grocery>it=l1.iterator();
//						
//						l1.removeIf(r->r.getQuantityInStock()==0);
						
						
						
//						while(it.hasNext())
//						{	it.next();
//							if(it.emptyStock())
//								map.remove(it.getName());
//						}
//						
//						
//						for(Grocery j:map.values())
//						{
//							if(j.emptyStock(0))
//							{	System.out.println("fgsd");
//								map.remove(j.getName());
//							}
//						}
						
						map.forEach((v,k)->{if(k.getQuantityInStock()==0)
												map.remove(v);});
						//map.values().stream().filter(p->p.getQuantityInStock()==0).forEach(p->map.remove(p.getStockid()));
//						
						
						break;
					
					case 6: 
						System.out.println("Program is Exit");
						flag=false;
						break;
					
					
					}
					
				}
				catch(Exception e)
				{
					sc.next();
					e.printStackTrace();
				}
			}
		}

	}

}


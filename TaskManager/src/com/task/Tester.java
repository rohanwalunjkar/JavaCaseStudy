package com.task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static com.task.taskUtils.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc=new Scanner(System.in))
		{
			Map<Integer, Task> ma=populateMap();
			boolean flag=false;
			
			while(!flag)
			{
				try
				{
					System.out.println("1.Add New Task");
					System.out.println("2.Delete a task");
					System.out.println("3.Update task status");
					System.out.println("4.Display all pending tasks");
					System.out.println("5.Display all tasks sorted by taskDate");
					System.out.println("6.Display");
					System.out.println("0.Exit");
					
					System.out.println("Enter your choice");
					
					switch (sc.nextInt()){
					case 1:
						
						System.out.println("Enter the Details of Task taskName,description,TaskDate");
						ma.put(Task.getCount(), new Task(sc.next(),sc.next(), LocalDate.parse(sc.next())));
						break;
					
					case 2:
						System.out.println("Enter the taskId");
						Task remove = ma.remove(sc.nextInt());
						break;
						
					case 3:
						System.out.println("Enter the task Status");
						String st=sc.next();
						int id=sc.nextInt();
						ma.forEach((k,t)->{if(t.getTaskId()==id)
							t.setStatus(Status.valueOf(st.toUpperCase()));});
						
						break;
						
					case 4:
						System.out.println("Display all pending tasks");
						ma.forEach((k,t)-> {if(t.getStatus()==Status.valueOf("PENDING"))
											System.out.println(t);});
						break;
					
					case 5:
						
						System.out.println("Display all tasks sorted by taskDate");
						List<Task> l1=new ArrayList<Task>(ma.values());
						Comparator<Task> t1=(p1,p2)->p1.getTaskDate().compareTo(p2.getTaskDate());
						Collections.sort(l1,t1);
						for(Task a : l1)
							System.out.println(a);
						break;
		
					case 6:
						for(Task t:ma.values())
						{
							System.out.println(t);
						}
						break;
				
					case 0:
						flag=true;
						System.out.println("Your Program is End");
						
					}
					
					
				}
				catch(Exception e)
				{	
					e.printStackTrace();
					sc.nextLine();
				}
			}
			
		}
	}

}

package com.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import com.item.Item;

public class fileUtils{

	public static void Write(String st,List<Item> list) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(st)))
		{
			out.writeObject(list);
		}
	}
	
	public static void Write2(String st,List<Item> map) throws FileNotFoundException, IOException
	{
		try(PrintWriter p1=new PrintWriter(new FileWriter(st)))
		{
			map.forEach(p->p1.write(p.toString()+"\n"));
		}
	}
	
}

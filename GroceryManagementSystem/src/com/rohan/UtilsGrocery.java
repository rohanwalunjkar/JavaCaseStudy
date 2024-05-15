package com.rohan;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class UtilsGrocery {

	public static Map<String, Grocery> populateMap()
	{
		Map<String, Grocery> m=new HashMap<String, Grocery>();
		
		m.put("G1",new Grocery("Pen",10, 100,LocalDateTime.parse("2023-12-03T10:15:30")));
		m.put("G2",new Grocery("Pencil",5, 70,LocalDateTime.parse("2024-09-03T10:15:30")));
		m.put("G3",new Grocery("Rubber",5, 40,LocalDateTime.parse("2023-06-03T10:15:30")));
		m.put("G4",new Grocery("NoteBook",50,0,LocalDateTime.parse("2023-04-03T10:15:30")));
		m.put("G5",new Grocery("book",100, 70,LocalDateTime.parse("2024-03-03T10:15:30")));
		
		return m;
	}
	
	public static Grocery findByName(Map<String, Grocery> map,String sc)
	{
		Grocery gr=map.get(sc);
		return gr;
	}
	
	
}

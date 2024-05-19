package com.rohan;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CricketerUtils {



		
		public static Map<String, Cricketer> populateMap()
		{
			Map<String, Cricketer> map=new HashMap<String, Cricketer>();
			
			map.put("ab@gmail.com",new Cricketer("Rohit", 35, "ab@gmail.com", "7986697865", 4));
			map.put("abc@gmail.com",new Cricketer("Shreyas", 31, "abc@gmail.com", "7986697655", 3));
			map.put("xyz@gmail.com",new Cricketer("Dhoni", 30, "xyz@gmail.com", "7986697865", 4));
			map.put("pqr@gmail.com",new Cricketer("Virat", 45, "pqr@gmail.com", "7986697865", 5));
			map.put("rr@gmail.com",new Cricketer("Rahul", 25, "rr@gmail.com", "7986697865", 3));
			
			return map;
			
		}
	
}

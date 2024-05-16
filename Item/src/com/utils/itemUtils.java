package com.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.item.Item;

public class itemUtils {

	public static Map<String, Item> populateMap() {
		
		Map<String, Item> map= new HashMap<String, Item>();
		
		map.put("P101", new Item("P101", "Pen", 10.0,LocalDate.parse("2023-07-12") ));
		map.put("P102", new Item("P102", "Book", 70.0,LocalDate.parse("2024-11-09") ));
		map.put("P103", new Item("P103", "Table", 2000.0,LocalDate.parse("2024-04-17") ));
		map.put("P104", new Item("P104", "TV", 10000.0,LocalDate.parse("2024-01-23") ));
		map.put("P105", new Item("P105", "Bed", 25000.0,LocalDate.parse("2024-06-13") ));
		
		return map;
	}
}

package com.task;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import static java.time.LocalDate.*;
public class taskUtils {

	
	public static Map<Integer, Task> populateMap()
	{
		Map<Integer, Task> map=new HashMap<Integer, Task>();
		
		map.put(Task.getCount(),new Task("Market","GoingMarket",parse("2024-04-21")));
		map.put(Task.getCount(),new Task("study","GoToCollege",LocalDate.parse("2024-04-19")));
		map.put(Task.getCount(),new Task("shopping","GoTOShopping",LocalDate.parse("2024-04-22")));
		map.put(Task.getCount(),new Task("WatchMovie","Movie",LocalDate.parse("2024-04-26")));
		
		return map;
		
	}
}


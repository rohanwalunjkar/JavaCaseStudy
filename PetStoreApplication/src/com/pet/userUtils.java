package com.pet;

import java.util.HashMap;
import java.util.Map;

public class userUtils {

	public static Map<String, User> present()
	{
		Map<String, User> map=new HashMap<String, User>();
		
		map.put("admin",new User("admin", "admin"));
		map.put("c1",new User("c1", "c1"));
		
		return map;
	}
}

package com.pet;

import java.util.HashMap;
import java.util.Map;

public class petUtils {

	public static Map<Integer, Pet> populateMap()
	{
		Map<Integer, Pet> map=new HashMap<Integer, Pet>();
		
		map.put(101,new Pet(101,"BullDog",Category.DOG,12000,20));
		map.put(102,new Pet(102,"Cat1",Category.CAT,9000,10));
		map.put(103,new Pet(103,"StarFish",Category.FISH,8000,12));
		map.put(104,new Pet(104,"Labardor",Category.DOG,15000,8));
		map.put(105,new Pet(105,"Cat2",Category.CAT,10000,30));
		
		return map;
	}
}

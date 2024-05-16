package com.utils;

import java.time.LocalDate;
import java.util.Map;

import com.exception.ItemException;
import com.item.Item;

public class validation {

	public static Item valdateInput(String itemCode, String description, double price, LocalDate shipmentDate,Map<String, Item> map) throws ItemException
	{
		
		String st=validateItemCode(itemCode,map);
		
		
		return new Item(st, description, price, shipmentDate);
				
	}
	
	public static  String validateItemCode (String itemCode,Map<String, Item> map) throws ItemException {
		
		if(map.containsKey(itemCode))
			throw new ItemException("Item Code is not Valid");
		return itemCode;
	}
}

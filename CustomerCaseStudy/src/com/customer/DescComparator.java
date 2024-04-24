package com.customer;

import java.util.Comparator;

public class DescComparator implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			
			return o1.getFname().compareTo(o2.getFname());
			
		
	}

}

package com.cestarcollege.util;

import java.util.Comparator;

import com.cestarcollege.data.Address;

public class AddressComparatorUtil {
	public static Comparator<Address> compareByStreetName
	   = new Comparator<Address>() {

		@Override
		public int compare(Address o1, Address o2) {
			return o1.getStreetName()
					.compareTo(o2.getStreetName());
		}
	
	};
	public static 	Comparator<Address> compareByPostalCode
	= new Comparator<Address>() {
		@Override
		public int compare(Address o1, Address o2) {
			return o1.getPostalCode()
					.compareTo(o2.getPostalCode());
		}		
	};
	
}

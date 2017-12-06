package com.cestarcollege.misc;

public class NameNotFoundException extends Exception {
	
	String name;
	public NameNotFoundException(String name) {
		this.name = name;
	}

}

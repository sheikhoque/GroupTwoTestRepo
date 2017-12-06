package com.cestarcollege.util;

import java.util.Comparator;

import com.cestarcollege.data.Student;

public class StudentComparatorUtil {

	public static Comparator<Student> compareByFirstName
	             = new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getFirstName().compareTo(o2.getFirstName());
					}
				
	};
	
	
	public static Comparator<Student> comparebyLastName 
	             = new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						return o1.getLastName().compareTo(o2.getLastName());
					}
				
	};
	
}

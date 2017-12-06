package com.cestarcollege.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cestarcollege.data.Address;
import com.cestarcollege.data.Student;
import com.cestarcollege.util.AddressComparatorUtil;
import com.cestarcollege.util.StudentComparatorUtil;

public class Main {

	public static void main(String[] args) {

		//taskOne();
		
		//taskTwo();
		
		taskThree();
		
	}

	private static void taskThree() {
		
		Address a = new Address(271,"Yorkland","M5G");
		Address b = new Address(291,"Yorkland","A5G");
		Address c = new Address(88,"Queens Quay","Q5P");
		Address e = new Address(85,"Danforth","L4R");
		Address f = new Address(96,"Victoria","P9E");
		Address g = new Address(155,"Wellington","E5P");
		Student x = new Student(123, "Alia", "Stark", b);
		Student y = new Student(324, "Rob", "Stark", c);
		Student z = new Student(425, "Sansa", "Lennoster", e);
		Student w = new Student(133, "Def", "blla", f);
		Student u = new Student(923, "Foo", "Bar", a);
		Student v = new Student(723, "Goduco", "Jhon", g);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(x);
		studentList.add(y);
		studentList.add(z);
		studentList.add(w);
		studentList.add(u);
		studentList.add(v);
		System.out.println("Before Any Sorting...");
		loopStudent(studentList);
		
		Collections.sort(studentList);
		
		System.out.println("After sorting by student id");
		loopStudent(studentList);
		
		Collections.sort(studentList, StudentComparatorUtil.compareByFirstName);
		
		System.out.println("After sorting by first name - ");
		
		loopStudent(studentList);
	}

	private static void loopStudent(List<Student> studentList) {
		for(Student student : studentList){
			System.out.println("Student - "+student);
		}
	}

	private static void taskTwo() {
		Address a = new Address(271,"Yorkland","M5G");
		Address b = new Address(291,"Yorkland","A5G");
		Address c = new Address(88,"Queens Quay","Q5P");
		Address e = new Address(85,"Danforth","L4R");
		Address f = new Address(96,"Victoria","P9E");
		Address g = new Address(155,"Wellington","E5P");
		
		List<Address> addressList = new ArrayList<Address>();
		addressList.add(a);
		addressList.add(b);
		addressList.add(c);
		addressList.add(g);
		addressList.add(e);
		addressList.add(f);
		
		System.out.println("Size of our address list is - "+addressList.size());
		
		System.out.println("Before sorting...");
		loop(addressList);
		
		Collections.sort(addressList);
			
		System.out.println("After sorting..");
		loop(addressList);
		
		
		Collections.sort(addressList, AddressComparatorUtil.compareByStreetName);
		System.out.println("After sorting by comparator street name....");
		loop(addressList);
		
	
		Collections.sort(addressList, AddressComparatorUtil.compareByPostalCode);
		System.out.println("After sorting by comparator postal code....");
		
		loop(addressList);
		
	}

	private static void loop(List<Address> addressList) {
		for(Address address : addressList)
			System.out.println("Address - "+address);
		
	}

	private static void taskOne() {
		Address a = new Address(271,"Yorkland","M5G");
		Address b = new Address(271,"Yorkland","M5G");
		Address c = new Address(88,"Queens Quay","M5P");
		
		if(a==b){
			System.out.println("Testing == & result is Both equal");
		}else{
			System.out.println("Testing == & result is not equal");
		}
		
		if(a.equals(b)){
			System.out.println("Testing equals method & result is Both equal");
		}else{
			System.out.println("Testing equals method & result is not equal");
		}
	}

	

}

package com.cestarcollege.misc;

import java.util.HashMap;
import java.util.Map;

import com.cestarcollege.data.Address;
import com.cestarcollege.data.Student;

public class StudentService {
	
	public static Map<String, Student> studentMap 
	   = new HashMap<String, Student>();
	static{
		studentMap.put("John",
				new Student(123, "John", "Snow", 
						new Address(271, "York", "M15")));
		
	}
	
	public Student findStudentByName(String name) 
			throws NameNotFoundException{
		
		if(studentMap.get(name)==null)
			throw new NameNotFoundException("Name not Found");
		return studentMap.get(name);
	}
}

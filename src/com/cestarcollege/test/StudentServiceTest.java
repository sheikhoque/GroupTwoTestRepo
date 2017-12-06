package com.cestarcollege.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.cestarcollege.misc.NameNotFoundException;
import com.cestarcollege.misc.StudentService;

public class StudentServiceTest {

	@Rule
	public ExpectedException expectedException 
			= ExpectedException.none();


	@Test
	public void testFindStudentByName() 
			throws NameNotFoundException {
		expectedException.expect(NameNotFoundException.class);
		
		StudentService service = new StudentService();
		service.findStudentByName("Mark");
	}

}

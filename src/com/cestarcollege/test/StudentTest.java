package com.cestarcollege.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cestarcollege.data.Address;
import com.cestarcollege.data.Course;
import com.cestarcollege.data.Student;

public class StudentTest {

	Student s1 = null;
	Course c1 = null;
	Course c2 = null;
	Course c3 = null;

	@Before
	public void setUp() throws Exception {
		s1 = new Student(123, "John", "Snow", new Address(271, "Yorkland", "M2J"));
		c1 = new Course(1, "Java");
		c2 = new Course(2, "Scala");
		c3 = new Course(1, "Java");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddCourses() {
		// test case 1 - add a new course
		boolean actual = s1.addCourses(c1);
		assertEquals(true, actual);
		// test case 2 -- add already existing item
		actual = s1.addCourses(c3);
		assertEquals(false, actual);
	}

	@Test
	public void testRemoveCourses() {
		//test case 1 - remove before adding anything
		boolean actual = s1.removeCourses(c1);
		assertEquals(false, actual);
		//test case 2 - try to remove an already added item
		s1.addCourses(c1);
		actual = s1.removeCourses(c1);
		assertEquals(true, actual);
		//test case 3 - try to remove already removed item
		actual = s1.removeCourses(c3);
		assertEquals(false, actual);
		//test case 4 - try to remove an item that is not added
		actual = s1.removeCourses(c2);
		assertEquals(false, actual);
	}
	
	@Test
	public void testgetNumberOfCourses(){
		//test case 1 - size before adding anything
		int actual = s1.getNumberOfCourses();
		assertEquals(0, actual);
		//test case 2 - size after adding two unique courses
		s1.addCourses(c1);
		s1.addCourses(c2);
		actual = s1.getNumberOfCourses();
		assertEquals(2, actual);
		//test case 3 - size after adding another duplicate item;
		s1.addCourses(c3);
		actual = s1.getNumberOfCourses();
		assertEquals(2, actual);
	}

}

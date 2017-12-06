package com.cestarcollege.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cestarcollege.misc.MiscIntro;

public class MiscIntroTest {

	MiscIntro mockMisc=null;
	@Before
	public void setUp() throws Exception {
		System.out.println("I am setup");
		mockMisc = new MiscIntro();
	}

	@After
	public void tearDown() throws Exception {
		mockMisc=null;
	}

	@Test
	public void testAdd() {
		System.out.println("This is testAdd method..");
		int actual = mockMisc.add(7, 8);
		assertEquals(15, actual);
	}

	@Test
	public void testSubtract() {
		System.out.println("This is testSubtract method");
		int actual = mockMisc.subtract(8, 15);
		assertEquals(-7, actual);
	}
	
	@Test
	public void testFactorial(){
		int actual = mockMisc.factorial(4);
		assertEquals(24, actual);
	}

}

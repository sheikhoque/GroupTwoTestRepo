package com.cestarcollege.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IntroTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is before class method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is after class method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is setup method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is tear down method");
	}

	@Test
	public void test() {
		int i = 5;
		int k = 10;
		int sum = i*k;
		assertEquals(15, sum);
	}

}

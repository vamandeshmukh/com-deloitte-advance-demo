package com.deloitte.advance.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.deloitte.advance.sample.Calc;

public class CalcTests {

	private static Calc cal;

	@BeforeAll
	public static void setUp() {
		System.out.println("setUp");
		cal = new Calc();
	}

	@AfterAll
	public static void tearDown() {
		System.out.println("tearDown");
		cal = null;
	}

	@Test
	public void testAddNums() {
		System.out.println("testAddNums");
		assertEquals(cal.addNums(10, 20), 30);
	}

	@Test
	public void testAddNums2() {
		System.out.println("testAddNums2");
		assertNotEquals(cal.addNums(10, 20), 31);
	}

	@Test
	public void testSubNums() {
		System.out.println("testSubNums");
		assertEquals(cal.subNums(20, 10), 10);
	}

	@Test
	public void testSubNums2() {
		System.out.println("testSubNums2");
		assertNotEquals(cal.subNums(10, 20), 15);
	}

}

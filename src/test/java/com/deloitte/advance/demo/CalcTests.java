package com.deloitte.advance.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

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

	@BeforeEach
	public void m1() {
		System.out.println("once before eatch tet...");
	}

	@AfterEach
	public void m2() {
		System.out.println("once after eatch tet...");
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

	@Disabled
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

	@Test
	public void testDivNums() {
		System.out.println("testDivNums");
		assertThrows(ArithmeticException.class, () -> {
			cal.divNums(10, 0);
		});
	}

	@Test
	@Timeout(value = 2600, unit = TimeUnit.MILLISECONDS)
	public void testPiValue() throws InterruptedException {
		System.out.println("testPiValue");
		assertEquals(cal.piValue(), 3.142);
	}

}

package com.deloitte.advance.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.deloitte.advance.sample.Calc;

public class CalcTests {

	@Test
	public void testAddNums() {
		Calc cal = new Calc();
		assertEquals(cal.addNums(10, 20), 30);
	}

	@Test
	public void testAddNums2() {
		Calc cal = new Calc();
		assertNotEquals(cal.addNums(10, 20), 31);
	}
}

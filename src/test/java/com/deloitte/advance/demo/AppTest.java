package com.deloitte.advance.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void testAddNums() {
		int expected = 10;
		int actual = 5 + 5;
		assertEquals(expected, actual);
	}

}
package com.deloitte.advance.sample;

public class Calc {

	public int addNums(int i, int j) {
		return i + j;
	}

	public int subNums(int i, int j) {
		return i - j;
	}

	public int divNums(int i, int j) {
		return i / j;
	}

	public double piValue() throws InterruptedException {

		Thread.sleep(2500);
		return 3.142;

	}
}

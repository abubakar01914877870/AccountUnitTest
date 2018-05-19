package com.blackartstudio;

import org.junit.Test;

public class ExceptionTest {

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void test() {
		int arr[]= {1,2,3};
		System.out.println(arr[9]);
	}

	@Test(expected=ArithmeticException.class)
	public void test2() {
		int k=5/0;
	}
}

package com.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@Test //based on Alphabetical Order
	public void testMethodOne() {
		System.out.println("testMethodOne");
	}
	@Test
	public void testMethodTwo() {
		System.out.println("testMethodTwo");
	}
	@AfterMethod
	void afterMethod() {
		System.out.println("afterMethod");
	}
}

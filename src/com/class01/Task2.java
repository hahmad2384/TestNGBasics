package com.class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2 {
/*
 * Create the test case for each one of the testng annotation.
 * Test
 * BeforeMethod
 * AfterMethod
 * BeforeClass
 * AfterClass
 * BeforeTest
 * AfterTest
 * BeforeSuite
 * AfterSuite
 */
	
	@Test
	public void test() {
		System.out.println("Test Annotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod Annotation");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod Annotation");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass Annotation");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass Annotation");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest Annotation");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest Annotation");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite Annotation");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite Annotation");
	}
	
}

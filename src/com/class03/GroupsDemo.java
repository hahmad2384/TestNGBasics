package com.class03;

import org.testng.annotations.Test;
@Test(groups = {"AllClassTests"})//Class Level
public class GroupsDemo {
@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("This is Test 1");
	}
@Test(groups = {"windows.regression"}) // Use regular expressions
public void test2() {
	System.out.println("This is Test 2");
}
@Test(groups = {"linux.regression"})
public void test3() {
	System.out.println("This is Test 3");
}
@Test
public void test4() {
	System.out.println("This is Test 4");
}
}

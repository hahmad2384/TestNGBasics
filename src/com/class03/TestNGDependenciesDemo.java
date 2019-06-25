package com.class03;

import org.testng.annotations.Test;

public class TestNGDependenciesDemo {
@Test(dependsOnGroups = {"sanity.*"})
	public void test1() {
		System.out.println("I am inside Test 1");
	}
@Test(groups = {"sanity1"})
public void test2() {
	System.out.println("I am inside Test 2");
}
@Test(groups = {"sanity2"})
public void test3() {
	System.out.println("I am inside Test 3");
}

}

package com.class02;

import org.testng.annotations.Test;

public class priority {
@Test(priority = 0)
public void first() {
	System.out.println("First Test Annotation");
}

@Test(priority = 1)
public void second() {
	System.out.println("Second Test Annotation");
}
@Test(priority = 2)
public void third() {
	System.out.println("Third Test Annotation");
}
@Test(priority = 3)
public void fourth() {
	System.out.println("Fourth Test Annotation");
}


}

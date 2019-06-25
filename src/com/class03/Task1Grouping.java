package com.class03;

import org.openqa.selenium.By;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Task1Grouping extends CommonMethods {
@BeforeGroups({"Smoke","Regression1","Regression2"})
public void setUp() {
	setUpDriver("chrome", "https://www.saucedemo.com/");
}
@Test(groups = "Smoke")
public void userOne() {
	sendText(driver.findElement(By.cssSelector("input#user-name")), "standard_user");
	sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
	click(driver.findElement(By.cssSelector("input.btn_action")));
}
@Test(groups = "Regression1")
public void userTwo() {
	sendText(driver.findElement(By.cssSelector("input#user-name")), "problem_user");
	sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
	click(driver.findElement(By.cssSelector("input.btn_action")));
}
@Test(groups = "Regression2")

public void userThree() {
	sendText(driver.findElement(By.cssSelector("input#user-name")), "performance_glitch_user");
	sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
	click(driver.findElement(By.cssSelector("input.btn_action")));
}
@AfterGroups({"Smoke","Regression1","Regression2"})
public void tearDown() {
	driver.close();
}
}

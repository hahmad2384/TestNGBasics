package com.class02;
/*
 * Identify Priority of Test Cases


TC 1: OrangeHRM Verify Successful Login
Step 1: Open browser and navigate to OrangeHRM
Step 2: Enter valid UID and valid PWD and click login button
Step 3: Verify user successfully logged in

TC 2: OrangeHRM Add Employee
	Step 1: Click on PIM link and Add Employee
	Step 2: Provide Details and Save
	Step 3: Verify Employee is added 

TC 3: OrangeHRM Verify Employee Details
	Step 1: Click on PIM link and Employee List
	Step 2: Search for employee by it id
	Step 3: Verify Employee details are displayed 

Note: Create BeforeClass and AfterClass annotations to open browser and logout from the application
 */

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.CommonMethods;

public class Task2 extends CommonMethods{
	
@BeforeClass
public void setUp() {
	setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	
}
@Test(priority = 1) 
public void login() {
	sendText(driver.findElement(By.cssSelector("input#txtUsername")), "admin");
	sendText(driver.findElement(By.cssSelector("input#txtPassword")), "admin123");
	click(driver.findElement(By.cssSelector("input#btnLogin")));
String text = driver.findElement(By.xpath("//a[text()='Welcome Admin']")).getText();
String expText = "Welcome Admin";
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(text, expText);
	soft.assertAll();
	System.out.println("User successfully logged in");
}
@Test(priority = 2)
public void addEmployee() throws InterruptedException {
	Actions action = new Actions(driver);
	WebElement hover = driver.findElement(By.xpath("//b[text()='PIM']"));
	Thread.sleep(2000);
	action.moveToElement(hover).click().perform();
	click(driver.findElement(By.xpath("//a[text()='Add Employee']")));
	sendText(driver.findElement(By.cssSelector("input#firstName")), "Susan");
	sendText(driver.findElement(By.cssSelector("input#lastName")), "Smith");
	sendText(driver.findElement(By.cssSelector("input#employeeId")), "0017");
	click(driver.findElement(By.cssSelector("input#btnSave")));
	Thread.sleep(2000);
	click(driver.findElement(By.xpath("//a[text()='Employee List']")));
	List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table hover']/thead/tr/th"));
String expName = "Susan Smith";
for(int i = 1; i<=rows.size(); i++) {
	String name = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+i+"]")).getText();
	if(name.contains(expName)) {
	driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[17]/td[1]")).click();
	System.out.println("Name "+name+" is dispalyed");
	}
}
}
@Test(priority = 3)
public void verifyEmployee() {
	sendText(driver.findElement(By.cssSelector("input#empsearch_id")), "0017");
click(driver.findElement(By.cssSelector("input#searchBtn")));
}
@AfterClass
public void close() {
	driver.close();
}
}

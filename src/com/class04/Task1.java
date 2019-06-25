package com.class04;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;
/*
 * Identify Priority of Test Cases
https://www.saucedemo.com/

TC 1: Saucedemo Username1(tag the groups - Smoke)
Step 1: Open browser and navigate to Saucedemo
Step 2: Enter username standard_user and enter password secret_sauce and click login button
Step 3: Verify user successfully logged in

TC 2: Saucedemo Username2(tag the groups - Regression)
Step 1: Open browser and navigate to Saucedemo
Step 2: Enter username problem_user and enter password secret_sauce and click login button
Step 3: Verify user successfully logged in


Note: Create BeforeMethod and AfterMethod annotations to open browser
 and logout from the application. Create a xml file 
 and include smoke.
 */
public class Task1 extends CommonMethods{
	
	@BeforeMethod(alwaysRun = true, groups = "Smoke")
	public void setUp() {
		setUpDriver("chrome", "https://www.saucedemo.com");
	}
	@Test(groups = "Smoke")
	public void userName1() {
		sendText(driver.findElement(By.cssSelector("input#user-name")), "standard_user");
		sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
		click(driver.findElement(By.cssSelector("input.btn_action")));
		//String expText = "Products";
		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed(), true);
	}
	@Test(groups = "Regression")
	public void userName2() {
		sendText(driver.findElement(By.cssSelector("input#user-name")), "problem_user");
		sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
		click(driver.findElement(By.cssSelector("input.btn_action")));
		//String expText = "Products";
		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed(), true);
	}
	@AfterMethod(alwaysRun = true, groups = "Smoke"
			+ "")
	public void tearDown() {
		driver.close();
	}

}

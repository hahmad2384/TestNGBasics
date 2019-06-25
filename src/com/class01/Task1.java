package com.class01;
/*
 * TC 1: Swag Lab Title and Login Verification

@BeforeMethod should contain navigation to the URL and title verification

@Test should contain steps to login and “Product” word verification

@AfterMethod should logOut from the application and close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Task1 extends CommonMethods{

	@BeforeMethod
	public void setUp() {
		setUpDriver("chrome", "https://www.saucedemo.com/index.html");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Swag Labs")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Incorrect Title");
		}
	}
	@Test
	public void login() {
		sendText(driver.findElement(By.cssSelector("input#user-name")), "standard_user");
		sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		String expectedText = "Products";
		String text = driver.findElement(By.xpath("//div[text()='Products']")).getText();
		if(text.equalsIgnoreCase(expectedText)) {
			System.out.println("Text is displayed");
		}else {
			System.out.println("Test is not displayed");
		}
		
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		click(driver.findElement(By.xpath("//button[text()='Open Menu']")));
Thread.sleep(2000);
click(driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")));

		driver.close();
	}
	
}

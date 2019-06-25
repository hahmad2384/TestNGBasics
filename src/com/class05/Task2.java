package com.class05;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Task2 extends CommonMethods{

	@BeforeMethod
	public void setUp() {
		setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");
	}
	@DataProvider(name = "setUpData")
	public Object[][] setUpData() {
		Object[][] data = new Object[2][7];
		data[0][0] = "John";
		data[0][1] = "Smith";
		data[0][2] = "Male";
		data[0][3] = "2";
		data[0][4] = "06/12/2019";
		data[0][5] = "Automation Tester";
		data[0][6] = "Selenium Webdriver";

		
		data[1][0] = "Ana";
		data[1][1] = "Smith";
		data[1][2] = "Female";
		data[1][3] = "4";
		data[1][4] = "06/12/2019";
		data[1][5] = "Automation Tester";
		data[1][6] = "Selenium Webdriver";
		
		return data;
			
	}
	@Test(dataProvider = "setUpData")
	public void user(String firstname, String lastname, String sex, String years, String date, String profession, String tool) {
		sendText(driver.findElement(By.xpath("//input[@name='firstname']")), firstname);
		sendText(driver.findElement(By.xpath("//input[@name='lastname']")), lastname);
		driver.findElement(By.xpath("//input[contains(@value,'"+sex+"')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'"+years+"')]")).click();
		sendText(driver.findElement(By.xpath("//input[@id='datepicker']")), date);
		driver.findElement(By.xpath("//input[contains(@value,'"+profession+"')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'"+tool+"')]")).click();
if(firstname.contains("John")) {
	takeScreenshot("Task2", "toolsqauserOne");
}else {
	takeScreenshot("Task2", "toolsqauserTwo");
}
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}

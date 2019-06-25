package com.class04;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Task2 extends CommonMethods{

	@Parameters({"browser","url"})
	@BeforeMethod(alwaysRun = true)
	public void setUp1(String browser, String url) {
		setUpDriver(browser, url);
		
	}
	@Parameters({"userName1", "password"})
	@Test
	public void userName1(String userName1, String password ) {
		sendText(driver.findElement(By.cssSelector("input#user-name")), userName1);
		sendText(driver.findElement(By.cssSelector("input#password")), password);
		click(driver.findElement(By.cssSelector("input.btn_action")));
		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed(), true);

	}
	@Parameters({"userName2", "password"})
	@Test
	public void userName2(String userName2, String password ) {
		sendText(driver.findElement(By.cssSelector("input#user-name")), userName2);
		sendText(driver.findElement(By.cssSelector("input#password")), password);
		click(driver.findElement(By.cssSelector("input.btn_action")));
		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed(), true);

	}
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.close();
	}
}

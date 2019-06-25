package com.class01;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Funk extends CommonMethods{
	@BeforeMethod
	public void setUp() {
		setUpDriver("chrome", "https://www.40funk.com/");
		
	}
	@Test
	public void cart() {
		click(driver.findElement(By.xpath("//div[@data-nc-container='bottom-right']/following::span[text()='Cart']")));
//click(driver.findElement(By.xpath("//div[@data-nc-container='bottom-right']//span[text()='Cart']")));
//click(driver.findElement(By.xpath("//div[@class='Header-inner Header-inner--bottom']//span[text()='Cart']")));
	}
}

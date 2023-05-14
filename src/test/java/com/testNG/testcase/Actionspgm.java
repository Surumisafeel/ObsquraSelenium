package com.testNG.testcase;

import org.testng.annotations.Test;

import com.utility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionspgm {
	WebDriver driver;

	DriverManager d;
	String urlExpected = "https://demo.guru99.com/test/drag_drop.html";

	@Test
	public void f() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement  source = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a")); 
		WebElement  target = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li")); 
		//WebElement element = driver.findElement(By.linkText("Get started free"));
		// action.moveToElement(element).click().build().perform();
		// action.clickAndHold().build().perform();
		// action.doubleClick(element).build().perform();
		// action.clickAndHold(element).release().build().perform();
		// action.click(element).sendKeys("hello").build().perform();
		// action.contextClick().build().perform();
		action.dragAndDrop(source, target).build().perform();
		Thread.sleep(3000);

	}

	@BeforeTest
	public void beforeTest() {
		d = new DriverManager();
		driver = d.launchBrowser(urlExpected);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}

package com.testNG.testcase;

import org.testng.annotations.Test;

import com.utility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Alert {
	
	String urlExpected = "https://selenium.obsqurazone.com/index.php";
	WebDriver driver;
	DriverManager d;
	@FindBy(id = "alert-modal")
	public WebElement alert;
	@FindBy(xpath = "/html/body/section/div/div/div[1]/div/div/ul/li[5]/a")
	public WebElement javaScriptAlert;
	@FindBy(xpath = "/html/body/section/div/div/div[2]/div[3]/div/div[2]/button")
	public WebElement javaScriptAlertbox;

	@Test

	public void TestCase001_javaScriptAlertboxClick() throws InterruptedException {
		d.click(alert);
		Thread.sleep(2000);
		d.click(javaScriptAlert);
		Thread.sleep(2000);
		d.scrolltoElement(javaScriptAlertbox);
		Thread.sleep(2000);
		d.click(javaScriptAlertbox);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Text");
		// driver.switchTo().alert().sendKeys("Text");

	}

	@BeforeTest
	public void beforeTest() {
		// DriverManager obj = new DriverManager();
		// driver= obj.launchBrowser(urlExpected);
		d = new DriverManager();
		driver = d.launchBrowser(urlExpected);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}

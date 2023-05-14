package com.testNG.testcase;
import org.testng.annotations.Test;

import com.utility.DriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class MultipleDropdown {
	WebDriver driver;
	String urlExpected = "https://selenium.obsqurazone.com/index.php";

  @Test
	public void TestCase_001() throws InterruptedException {// multiple dropdown
															// selection
		System.out.println("testcas 2 execution started");
		WebElement inputForm = driver.findElement(By.xpath("//*[@id='collapsibleNavbar']/ul/li[2]/a"));
		inputForm.click();
		WebElement selectInput = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[4]/a"));
		selectInput.click();
		WebElement dropdown1 = driver.findElement(By.id("multi-select-field"));
		Select obj = new Select(dropdown1);
		boolean color = obj.isMultiple();
		Assert.assertEquals(true, color);
		obj.selectByIndex(1);
		Thread.sleep(3000);
		obj.selectByIndex(2);
		Thread.sleep(3000);
		WebElement selectAll = driver.findElement(By.xpath("button-all"));
		selectAll.click();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  DriverManager obj = new DriverManager();
	  driver= obj.launchBrowser(urlExpected);
  }

  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

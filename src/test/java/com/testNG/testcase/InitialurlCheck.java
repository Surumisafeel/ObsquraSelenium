package com.testNG.testcase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utility.DriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class InitialurlCheck {
	
	String urlExpected ="https://selenium.obsqurazone.com/index.php";
	WebDriver driver;
	DriverManager d;
	By inputform = By.xpath("//*[@id='collapsibleNavbar']/ul/li[2]/a");
	By button = By.id("button-one");
	By message=By.id("message-one");
	By enterMessage=By.id("single-input-field");
	By enterValueA = By.id("value-a");
	By enterValueB= By.id("value-b");
	By getTotal = By.id("button-two");
	By message2 =By.id("message-two");
  @Test(priority=1,enabled=true)
  public void Test_001() {
	  String urlActual = driver.getCurrentUrl();
	  ////////////////////////HardrAssert
//	  Assert.assertEquals(urlActual, urlExpected);
//	  System.out.println("Passed");
	  
	  ///////////////////////////////////////SoftAssert
//	  SoftAssert obj = new SoftAssert();
//	  obj.assertEquals(urlActual, "1213");
//	  System.out.println("Passed");
//	  obj.assertAll();
	  
	   if(urlActual.equals(urlExpected))
	   {
	   Assert.assertTrue(true);
	   }
	   else
	   {
	   Assert.fail("This is failed due to url mismatch");
	   }
  }
  
  @Test (priority=2,enabled=true)
  public void Test_002() throws InterruptedException{
	  d.click(inputform);
	    
		d.sendKeys(enterMessage, "Hello");
		 d.click(button);

		Thread.sleep(2000);
		String outMessage= d.getText(message);
//	WebElement inputform = driver.findElement(By.xpath("//*[@id='collapsibleNavbar']/ul/li[2]/a"));
//	inputform.click();
//	WebElement enterMessage = driver.findElement(By.id("single-input-field"));
//	enterMessage.sendKeys("Hello");
//	WebElement button = driver.findElement(By.id("button-one"));
//	button.click();
//	WebElement message = driver.findElement(By.id("message-one"));
//	Thread.sleep(2000);
//	String outMessage= message.getText();
//	 if(outMessage.contains("Hello"))
//	   {
//	   Assert.assertTrue(true);
//	   }
//	   else
//	   {
//	   Assert.fail("This is failed due to url mismatch");
//	   }
  }
  
  @Test (priority=3,enabled=true)
  public void Test_003() throws InterruptedException{
//	  WebElement enterValueA = driver.findElement(By.id("value-a"));
//	  enterValueA.sendKeys("5");
	  d.sendKeys(enterValueA, "5");
//	  WebElement enterValueB = driver.findElement(By.id("value-b"));
//	  enterValueB.sendKeys("10");
	  d.sendKeys(enterValueB, "10");
//	  WebElement getTotal = driver.findElement(By.id("button-two"));
//	  getTotal.click();
	  d.click(getTotal);
//	  WebElement message2 = driver.findElement(By.id("message-two"));
	  Thread.sleep(4000);
	  String total= d.getText(message2);
	  System.out.println(total);
		 if(total.contains("15"))
		   {
		   Assert.assertTrue(true);
		   System.out.println("Values are equal");
		   }
		   else
		   {
		   Assert.fail("This is failed due to url mismatch");
		   }
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	   d = new DriverManager();
	  driver= d.launchBrowser(urlExpected);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}

package com.pageElements;

import org.testng.annotations.Test;

import com.utility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class RadioButton {
	WebDriver driver;
	DriverManager d;
	String output  = "https://selenium.obsqurazone.com/index.php";
	
	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a")
	public WebElement inputform;

	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[3]/a")
	public WebElement RadioButtonsDemo;
	
	@FindBy(id="inlineRadio1")
	public WebElement male;
	
	@FindBy(id="button-one")
	public WebElement showselectedvalue;
	
	@FindBy(id="message-one")
	public WebElement message;

  @Test (priority=1,enabled=true)
  public void Test_001() throws InterruptedException {
	  d.click(inputform);
		Thread.sleep(2000);
		d.click(RadioButtonsDemo);
		Thread.sleep(2000);
		d.click( male);
		Thread.sleep(2000);
		d.click(showselectedvalue);
		Thread.sleep(2000);
	      d.click(message);
	      Thread.sleep(2000);
		
	//Validate message displayed in Radiobutton
		
	
		String output = d.getText(message);
		if(output.equals("Radio button 'Male' is checked"))
		  {
			  Assert.assertTrue(true);
			  	  }
		  else
		  {
			  Assert.fail("This is failed due to message mismatch");
		  }
	}

		

  
  @BeforeTest
  public void beforeTest() {
	  d=new DriverManager();
		 driver= d.launchBrowser(output);
		 PageFactory.initElements( driver,this);

  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

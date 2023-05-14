package com.pageElements;

import org.testng.annotations.Test;

import com.utility.DriverManager;

import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DropdownPageElements {
	DriverManager d;
	WebDriver driver;
 public  DropdownPageElements(WebDriver driver){
	 this.driver =driver;
	 PageFactory.initElements(driver, this);//initialize elements
	 
 }
 
 
 @FindBy(xpath="//*[@id='collapsibleNavbar']/ul/li[2]/a")
 public WebElement inputform;

 
 @FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[4]/a")
 public WebElement select;
 
 @FindBy(id="single-input-field")
 public WebElement dropdown;
 
 @FindBy(id= "multi-select-field")
 public WebElement dropdown1;
 @FindBy(id="button-all")
	public WebElement  selectAll;
 
 
 
 public void inputformclick(){
//	 inputform.click();
	 d.click(inputform);
 }
 
 public void dropdownselect() throws InterruptedException{
	 
	 select.click();
	 Select obj = new Select(dropdown);
		boolean clr = obj.isMultiple();
		Assert.assertEquals(false, clr);
		Thread.sleep(3000);
		obj.selectByIndex(3);
		Thread.sleep(3000);
		obj.selectByValue("Yellow");
		Thread.sleep(3000);
		obj.selectByVisibleText("Red");
		Thread.sleep(3000);
		
		//listing of dropdown values
		List<WebElement> listoptions =obj.getOptions();
		 for(int i =0 ; i<listoptions.size() ; i++)
		 {
			 System.out.println("Dropdown content is as follows " +listoptions.get(i).getText());
		 
		 }
 }
		 
public void multidropdown() throws InterruptedException{
	 select.click();
		Select obj = new Select(dropdown1);
		boolean color = obj.isMultiple();
		Assert.assertEquals(true, color);
		obj.selectByIndex(1);
		Thread.sleep(3000);
		obj.selectByIndex(2);
		Thread.sleep(3000);
//		WebElement selectAll = driver.findElement(By.id("button-all"));
//		selectAll.click();

}



	 
 }
 
 
 



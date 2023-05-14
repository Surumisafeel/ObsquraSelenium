package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.io.Files;

public class DriverManager {
	WebDriver driver;
	public WebDriver launchBrowser(String url){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\surum\\workspace\\ObsquraSelenium\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
		
	}
public void click(By value) {
		
		WebElement element = driver.findElement(value);
		element.click();
	}
	public String getText(By value)
	{
		WebElement message=driver.findElement(value);
		String msg=message.getText();
		return msg;
	}
	public void sendKeys(By value,String input)
	{
		WebElement element=driver.findElement(value);
		element.sendKeys(input);
	}
	public void click(WebElement element) {
		
		
		element.click();
	}
public void scrolltoElement(WebElement element) {
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
}
public void scrollbywindow(int a,int b) {
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
	}

public void dropdown(WebElement value,int index) throws InterruptedException {
Select obj=new Select(value);

boolean re = obj.isMultiple();
Assert.assertEquals(false, re);
obj.selectByIndex(3);
List<WebElement> listoptions = obj.getOptions();
for(int i =0 ; i<listoptions.size() ; i++) {
	System.out.println("wqe23232" +listoptions.get(i).getText());
	Thread.sleep(3000);
}
}
public void dropdown2(WebElement value,int index,int index1) throws InterruptedException {
	Select obj=new Select(value);
	boolean re = obj.isMultiple();
    Assert.assertEquals(true, re);
    obj.selectByValue("Red");
    obj.selectByValue("Yellow");
    List<WebElement> listoptions = obj.getOptions();
    for(int i =0 ; i<listoptions.size() ; i++) {
    System.out.println("The options are:" +listoptions.get(i).getText());
	Thread.sleep(3000);
}  

}
public void GetFirstSelected(WebElement element ) throws InterruptedException {
	element.click();	
	Thread.sleep(3000);
}

public void GetAllSelected(WebElement element ) throws InterruptedException {
	element.click();	
	Thread.sleep(3000);
}

public void screenShot(String filename) throws IOException {
	 TakesScreenshot scrShot =((TakesScreenshot)driver); 
		//Call getScreenshotAs method to create image file 
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
         //Move image file to new destination 
      File DestFile=new File("C:\\SampleProject\\src\\test\\resources\\Screenshot\\"+filename+".png");
         //Copy file at destination
      Files.copy(SrcFile, DestFile); 
	
}
//Checkbox
public void Checkbox(WebElement element) throws InterruptedException {
element.click();
Thread.sleep(3000);
}
public void Clickonthischeckbox(WebElement element) {
element.click();
}

public String getText(WebElement mesage) {

String msg=mesage.getText();
return msg; 
}
//RadioButton
public void RadioButtonsDemo(WebElement element) {
element.click();
}
public void male(WebElement element) {
element.click();
}
public void showselectedvalue(WebElement element) {
element.click();

}
public String getText1(WebElement message ) {

String msg=message.getText();
return msg; 

}





}


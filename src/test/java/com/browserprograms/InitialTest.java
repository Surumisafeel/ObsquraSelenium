package com.browserprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitialTest {
	public static void main(String[] args) {
		//String urlExpected ="https://selenium.obsqurazone.com/index.php";
		WebDriver driver ; 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\surum\\workspace\\ObsquraSelenium\\src\\main\\resources\\drivers\\chromedriver.exe");
		
		driver =new ChromeDriver();
//		driver.get(urlExpected);
//		driver.manage().window().maximize();
//		////////////////////testcase to verify url
//		String urlActual= driver.getCurrentUrl();
//		if(urlActual.equals(urlExpected)){
//			System.out.println("Passed");
//		}
//		else{
//			System.out.println("Failed");
//		}
			
			
		
		///////////////////////////////////////
		
		//driver.close();
	}

}

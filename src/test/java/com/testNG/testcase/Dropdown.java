package com.testNG.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageElements.DropdownPageElements;
import com.utility.DriverManager;

public class Dropdown {
	WebDriver driver;
	DriverManager d;
	String urlExpected = "https://selenium.obsqurazone.com/index.php";

	@Test
	public void Testcase_001() throws InterruptedException {// single dropdown
		DropdownPageElements ob = new DropdownPageElements(driver);

		ob.dropdownselect();

	}

	@Test
	public void TestCase_002() throws InterruptedException {// multiple dropdown
		DropdownPageElements ob1 = new DropdownPageElements(driver);
		ob1.multidropdown();
		// selection

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

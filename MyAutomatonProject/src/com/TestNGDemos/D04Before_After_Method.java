package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04Before_After_Method {
WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Before Test");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("After Test");
		driver.close();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void printTitle()
	{
		System.out.println("Title: " + driver.getTitle());
		System.out.println("After Method");
	}
	
	@Test (priority = 4)
	public void testMeesho()
	{
		driver.get("https://www.meesho.com/");
	}
	@Test (priority = 2)
	public void testAjio()
	{
		driver.get("https://www.ajio.com/");
	}
	@Test (priority = 1)
	public void testNykaa()
	{
		driver.get("https://www.nykaa.com/sp/main-sale-page/mega-sale?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa_NCA&hlp=hlpa&gad_source=1&gclid=Cj0KCQjwsoe5BhDiARIsAOXVoUs_66Y2SfIK3waDfnWtoZhXUjtJD5ukS1c2enG5LmeEw2tB1dtLP44aAnglEALw_wcB");
	}
	@Test (priority = 3)
	public void testBewakoof()
	{
		driver.get("https://www.bewakoof.com/");
	}
}

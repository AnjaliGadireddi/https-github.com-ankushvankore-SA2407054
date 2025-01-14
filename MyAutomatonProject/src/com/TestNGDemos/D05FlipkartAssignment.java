package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D05FlipkartAssignment {
	WebDriver driver;
	JavascriptExecutor js;
	
	@Test(priority = 1, groups = "Gadgets")
	public void mobileTest() {
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]/div/div/span"));
		js.executeScript("arguments[0].click()", mobile);
	}
	@Test(priority = 2, groups = "Makeup")
	public void fashionTest() {
		WebElement fashion = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/span/span[1]"));
		js.executeScript("arguments[0].click()", fashion);
	}
	@Test(priority = 3, groups = "Gadgets")
	public void electronicsTest() {
		WebElement electrons = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/span/span[1]"));
		js.executeScript("arguments[0].click()", electrons);
	}
	@Test(priority = 4, groups = "Makeup")
	public void homeTest() {
		WebElement home = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[3]/div/div/span/span[1]"));
		js.executeScript("arguments[0].click()", home);
	}

	@BeforeMethod (alwaysRun = true)
	public void launchingFlipkart() {
		driver.get("https://www.flipkart.com/");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod (alwaysRun = true)
	public void printTitle() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest (alwaysRun = true)
	public void launchingBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		js = (JavascriptExecutor) driver;
	}

	@AfterTest (alwaysRun = true)
	public void closeBrower() {
		driver.close();
	}

}

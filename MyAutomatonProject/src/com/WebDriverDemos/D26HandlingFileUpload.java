package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandlingFileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 450)", "");
		
		js.executeScript("arguments[0].value='Ankush'", driver.findElement(By.id("firstName")));
		
		//driver.findElement(By.id("firstName")).sendKeys("Ankush");
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Dell\\Downloads\\AnkushVankore.jpg");
		
	}

}
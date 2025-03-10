package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocateByClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.className("gLFyf"));
		searchBox.sendKeys("Rajnikant Hair Style");
		searchBox.sendKeys(Keys.ENTER);		//Hit enter on the text box
		
		//driver.findElement(By.className("gLFyf")).sendKeys("Rajnikant Jokes");
		//driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
	}

}

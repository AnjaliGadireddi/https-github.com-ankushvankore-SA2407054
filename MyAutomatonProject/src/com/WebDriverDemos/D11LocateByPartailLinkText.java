package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11LocateByPartailLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com/");
		
		//WebElement adLink = driver.findElement(By.partialLinkText("rtis"));
		//adLink.click();
		driver.findElement(By.partialLinkText("Adv")).click();
		
	}

}

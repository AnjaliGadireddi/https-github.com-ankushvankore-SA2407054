package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04GetCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println("URL: " + url);
		
		driver.close();
	}

}

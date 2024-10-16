package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03GetTitle {

	public static void main(String[] args) {
		String expTitle = "Google", actTitle;
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		actTitle = driver.getTitle();
		System.out.println("Title: " + actTitle);
		
		if(actTitle.equals(expTitle))
			System.out.println("Test case pass!!!");
		else
			System.out.println("Test case fail!!!");
		
		driver.close();
	}

}

package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14LocateByTagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Total links: " + links.size());
		
		//String txt = links.get(0).getText();
		//System.out.println(txt);
		//System.out.println(links.get(0).getText());
		//System.out.println(links.get(1).getText());
		//System.out.println(links.get(2).getText());
		
		//for(int i = 0; i < links.size(); i++)
			//System.out.println(links.get(i).getText());
		
		for(WebElement l : links)
		{
			System.out.println(l.getText());
		}
		
		/*int i = 0;
		
		while(i < links.size())
		{
			System.out.println(links.get(i).getText());
			i++;
		}*/
		
		driver.close();
	}

}

package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03EchoechoCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://echoecho.com/htmlforms09.htm");
		
		/*WebElement milk = driver.findElement(By.name("option1"));
		
		System.out.println("Before...");
		System.out.println("Checkbox Selected: " + milk.isSelected());
		System.out.println("Checkbox Enabled : " + milk.isEnabled());
		System.out.println("Checkbox Visible : " + milk.isDisplayed());
		
		if(milk.isSelected() == false)
			milk.click();
		
		System.out.println("\nAfter...");
		System.out.println("Checkbox Selected: " + milk.isSelected());
		System.out.println("Checkbox Enabled : " + milk.isEnabled());
		System.out.println("Checkbox Visible : " + milk.isDisplayed());
		*/
		
		//List<WebElement>products = driver.findElements(By.cssSelector("input[name*=\"option\"]"));
		List<WebElement>products = driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
		for(WebElement p : products)
		{
			System.out.println("\nBefore...");
			System.out.println(p.getAttribute("value") + " Selected: " + p.isSelected());
			System.out.println(p.getAttribute("value") + " Enabled : " + p.isEnabled());
			System.out.println(p.getAttribute("value") + " Visible : " + p.isDisplayed());
			
			if(p.isSelected() == false)
				p.click();
			
			System.out.println("\nAfter...");
			System.out.println(p.getAttribute("value") + " Selected: " + p.isSelected());
			System.out.println(p.getAttribute("value") + " Enabled : " + p.isEnabled());
			System.out.println(p.getAttribute("value") + " Visible : " + p.isDisplayed());
			
		}
	}

}

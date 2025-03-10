package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17HandlingRadiobutton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement gnFemale = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
		
		System.out.println("Before...");
		System.out.println("Female Selected: " + gnFemale.isSelected());
		System.out.println("Female Enabled : " + gnFemale.isEnabled());
		System.out.println("Female Visible : " + gnFemale.isDisplayed());
		
		gnFemale.click();
		
		System.out.println("\nAfter...");
		System.out.println("Female Selected: " + gnFemale.isSelected());
		System.out.println("Female Enabled : " + gnFemale.isEnabled());
		System.out.println("Female Visible : " + gnFemale.isDisplayed());
		
	}

}

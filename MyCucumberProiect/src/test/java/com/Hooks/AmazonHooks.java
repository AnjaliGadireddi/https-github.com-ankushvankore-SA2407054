package com.Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import static com.StepDef.S06AmazonSearch.driver;

import java.time.Duration;

public class AmazonHooks {
	//@Before
	public void launchAmazon()
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.amazon.in/");
	}
	
	//@After
	public void closeBrowser()
	{
		driver.close();
	}
}

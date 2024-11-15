package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S08DDF_Login_ExpandTesting {
	WebDriver driver;
	JavascriptExecutor js;
	
	@Given("Launch ExpandTesting page")
	public void launch_expand_testing_page() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://practice.expandtesting.com/login");
	    js = (JavascriptExecutor) driver;
	}

	@When("Enter the {string} and {string}")
	public void enter_the_and(String un, String ps) {
		js.executeScript("window.scrollBy(0, 400)", "");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
	}

	@When("Click on Submit button for login")
	public void click_on_submit_button_for_login() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Login page shoud open")
	public void login_page_shoud_open() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("secure"));
	    
	    driver.close();
	}
}

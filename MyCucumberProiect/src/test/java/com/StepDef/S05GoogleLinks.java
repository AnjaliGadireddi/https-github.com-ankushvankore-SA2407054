package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S05GoogleLinks {
	WebDriver driver;
	
	@Given("Launch google application")
	public void launch_google_application() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.google.com");
	}

	@When("Click on Gmail Link")
	public void click_on_gmail_link() {
	    driver.findElement(By.partialLinkText("Gmail")).click();
	}

	@Then("Gmail Page should open")
	public void gmail_page_should_open() {
	    System.out.println("Title: " + driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Gmail"));
	}

	@When("Click on Images link")
	public void click_on_images_link() {
	    driver.findElement(By.partialLinkText("Images")).click();
	}

	@Then("Images page should open")
	public void images_page_should_open() {
	    System.out.println("Title: " + driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Google Images"));
	}

	@When("Click on Advt link")
	public void click_on_advt_link() {
	    driver.findElement(By.partialLinkText("Adve")).click();
	}

	@Then("Advertising page should open")
	public void advertising_page_should_open() {
	    System.out.println("Title: " + driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Google Ads"));
	}

	@When("Click on Business link")
	public void click_on_business_link() {
	    driver.findElement(By.partialLinkText("Business")).click();
	}

	@Then("Google business page should open")
	public void google_business_page_should_open() {
	    System.out.println("Title: " + driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Get Listed on Google"));
	}

}

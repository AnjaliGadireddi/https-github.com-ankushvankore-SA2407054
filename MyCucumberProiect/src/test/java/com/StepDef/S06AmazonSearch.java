package com.StepDef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class S06AmazonSearch {
	public static WebDriver driver;
	@Given("Launch {string}")
	public void launch(String url) {
	    
	}

	@When("Enter product {string} and {int}")
	public void enter_product_and(String product, Integer price) {
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(price.toString());
	    
	    /*int no1 = 1;
	    Integer no2;
	    
	    Integer.toString(no1);
	    */
	}

	@When("Click on Search button")
	public void click_on_search_button() {
	    driver.findElement(By.id("nav-search-submit-button")).click();;
	}

	@Then("Search result should display")
	public void search_result_should_display() {
	    System.out.println(driver.getTitle());
	}
}

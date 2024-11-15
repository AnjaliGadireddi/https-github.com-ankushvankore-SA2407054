package com.StepDef;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S07Registration {
	@Given("Launch rediff")
	public void launch_rediff() {
	    System.out.println("Launching Rediff");
	}

	@When("I pass the data as follows")
	public void i_pass_the_data_as_follows(io.cucumber.datatable.DataTable data) {
	    List<List<String>>myData = data.asLists();
	    
	    for(List<String>d : myData)
	    {
	    	for(String dt : d)
	    		System.out.println(dt);
	    }
	}

	@Then("registration process shold success")
	public void registration_process_shold_success() {
	    System.out.println("Registration successful");
	}
	
	//Via maps
	@When("I Pass the following data")
	public void i_pass_the_following_data(io.cucumber.datatable.DataTable data) {
	    List<Map<String,String>>myData = data.asMaps();
	    
	    for(Map<String,String>d : myData)
	    	System.out.println(d);
	    
	    for(Map<String, String>d : myData)
	    {
	    	System.out.println("Full Name: " + d.get("FullName"));
	    	System.out.println("Email Id : " + d.get("EmailId"));
	    	System.out.println("Password : " + d.get("Password"));
	    	System.out.println("Mobile No: " + d.get("MobileNo"));
	    }
	}

	@Then("Registration success")
	public void registration_success() {
	    System.out.println("Registration successful");
	}
}

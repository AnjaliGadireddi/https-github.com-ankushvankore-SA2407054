package com.StepDef;

import io.cucumber.java.en.*;

public class S07Registration {
	@Given("Launch rediff")
	public void launch_rediff() {
	    System.out.println("Launching Rediff");
	}

	@When("I pass the data as follows")
	public void i_pass_the_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
	    
	}

	@Then("registration process shold success")
	public void registration_process_shold_success() {
	    
	}
}

package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProiect/MyCucumberProiect/F05GoogleLinks.feature",
					glue = "com.StepDef",
					publish = true,
					tags = "@GoogleLinks")
public class R05GoogleLinks {
	/*
	 * Execute Single Scenario: 	tags = "@SanityTest"
	 * Execute multiple Scenarios: 	tags = "@SanityTest or @UsabilityTest"
	 * Skip single Scenario:		tags = "not @UsabilityTest"
	 * Skip multiple Scenarios:		tags = "not @UsabilityTest and not @SanityTest"
	 * Execute all Scenarios:		tags = "@GoogleLinks"
	 */
}

package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProiect/MyCucumberProiect/F06AmazonSearch.feature",
					glue = {"com.StepDef", "com.Hooks"})
public class R06AmazonSearch {

}

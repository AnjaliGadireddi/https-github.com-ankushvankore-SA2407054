package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProiect/MyCucumberProiect/F08DDF_Login_ExpandTesting.feature",
					glue = "com.StepDef")
public class R08DDF_Login_ExpandTesting {

}

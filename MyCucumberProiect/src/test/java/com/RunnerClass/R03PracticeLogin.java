package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MyCucumberProiect/MyCucumberProiect/F03PracticeLogin.feature"}, 
					glue = {"com.StepDef"})
public class R03PracticeLogin {

}
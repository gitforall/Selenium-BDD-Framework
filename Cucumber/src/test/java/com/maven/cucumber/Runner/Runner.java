package com.maven.cucumber.Runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "D:/Hari/Selenium/ws/Cucumber/src/test/java/com/maven/cucumber/features/data.feature",
plugin = "json:target/cucumber2.json", glue = "com.maven.cucumber.StepDefs")
public class Runner {

	@Test(groups = "examples-testng", description = "Example of using TestNGCucumberRunner to invoke Cucumber")
	public void runCukes() {
		new TestNGCucumberRunner(getClass()).runCukes();
	}
	
}

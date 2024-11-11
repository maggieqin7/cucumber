package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//glue is what you want to run file, monochrome pretty format
@CucumberOptions(features = "src/test/resources/datatablesNull.feature",glue = "com.cucumber.steps",monochrome = true)
public class DatatableNullRunner extends AbstractTestNGCucumberTests {
}

package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import org.testng.annotations.Test;

//@Test
//glue is what you want to run file, monochrome pretty format
@CucumberOptions(features = "src/test/resources/Search.feature",glue = "com.cucumber.steps",monochrome = true)
public class SearchRunner extends AbstractTestNGCucumberTests {
}

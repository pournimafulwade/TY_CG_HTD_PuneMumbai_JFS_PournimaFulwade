package com.capgemini.seleniumpract.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "feature", glue = {"com.capgemini.seleniumpract.stepdefinition"})
	public class BDDRunner  {
	}



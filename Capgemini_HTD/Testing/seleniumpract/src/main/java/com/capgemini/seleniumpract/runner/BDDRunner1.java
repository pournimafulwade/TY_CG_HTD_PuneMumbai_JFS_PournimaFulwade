package com.capgemini.seleniumpract.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "feature", glue = {"com.capgemini.seleniumpract.stepdefinition"},dryRun=true)
public class BDDRunner1 {

}

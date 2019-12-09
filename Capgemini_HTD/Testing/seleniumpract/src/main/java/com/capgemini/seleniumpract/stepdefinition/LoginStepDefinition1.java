package com.capgemini.seleniumpract.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition1 {
	static {
		System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
	}

	@Given("^the user has loaded the application in the browser$")
	public void the_user_has_loaded_the_application_in_the_browser() throws Throwable {
	    
	}

	@When("^the user enters the valid username$")
	public void the_user_enters_the_valid_username() throws Throwable {
	    
	}

	@When("^the user enters the valid password$")
	public void the_user_enters_the_valid_password() throws Throwable {
	    
	}

	@When("^the user clicks on the login button$")
	public void the_user_clicks_on_the_login_button() throws Throwable {
	    
	}

	@Then("^the dashboard page must be displayed$")
	public void the_dashboard_page_must_be_displayed() throws Throwable {
	    
	}

	@When("^the user enters the invalid password$")
	public void the_user_enters_the_invalid_password() throws Throwable {
	    
	}

	@Then("^the user should be in the same page$")
	public void the_user_should_be_in_the_same_page() throws Throwable {
	    
	}

}

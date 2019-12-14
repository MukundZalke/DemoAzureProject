package com.poc.steps;
import java.util.List;

import com.poc.pages.MercuryTourHome;
import com.poc.webdriver.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ApplicationSteps{
	
	WebConnector con;
	
	public ApplicationSteps(WebConnector con) {
		this.con=con;
	}
	
	@Then("^Login should be (.*)$")
	public void validateLogin(String expectedResult) {
		con.validateLogin(expectedResult);
		//LoginPage p=new LoginPage(con.driver);
	}

	@And("^I Login inside application$")
	public void login(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		con.login(data.get(0),data.get(1));
		
	}
	
}

package com.poc.steps;

import com.poc.pages.MercuryTourHome;
import com.poc.pages.RegistrationPage;
import com.poc.webdriver.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MercuryTourHomeSteps {
WebConnector con;
RegistrationPage rp=null;
	public MercuryTourHomeSteps(WebConnector con) {
		this.con=con;
	}
	
	@And("^I click link register$")
	public void clickRegister() throws InterruptedException {
		MercuryTourHome mt=new MercuryTourHome(con.driver);
		mt.clickRegister();	
	}
	
    @When("^user enters Contact Information$")
    public void contactInformation() {
	    rp=new RegistrationPage(con.driver);
		rp.enterContactInformation();
    }
    
    @And("^mailing information is entered$")
    public void mailingInformation() {
		rp=new RegistrationPage(con.driver);
        rp.enterMailingInformation();
    }
    
    @And("^user information is entered$")
    public void userInformation() {
    	rp=new RegistrationPage(con.driver);
        rp.enterUserInformation();
    }
    
    @Then("^the registration form is submitted$")
    public void submitForm() {
    	rp=new RegistrationPage(con.driver);
    	rp.clickSubmitButton();    	
    }
    @Then("^test Fails$")
    public void failTest() {
     
    }
}

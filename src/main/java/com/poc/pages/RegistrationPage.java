package com.poc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	
	 public RegistrationPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	       this.driver=driver;
	 }
	 
	 public void enterContactInformation() {
		driver.findElement(By.cssSelector("input[name=\"firstName\"]")).sendKeys("Jason");
		driver.findElement(By.cssSelector("input[name=\"lastName\"]")).sendKeys("Holder");
		driver.findElement(By.cssSelector("input[name=\"phone\"]")).sendKeys("992312345");
		driver.findElement(By.cssSelector("input[name=\"userName\"]")).sendKeys("firstName.LastName@gmail.com");
	 }
	 
	 public void enterMailingInformation() {
			driver.findElement(By.cssSelector("input[name=\"address1\"]")).sendKeys("I Square IT");
			driver.findElement(By.cssSelector("input[name=\"city\"]")).sendKeys("Pune");
			driver.findElement(By.cssSelector("input[name=\"state\"]")).sendKeys("Maharastra");
			driver.findElement(By.cssSelector("input[name=\"postalCode\"]")).sendKeys("411057");
	 }
	 
	 public void enterUserInformation() {
			driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("firstName.LastName@gmail.com");
			driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("password1");
			driver.findElement(By.cssSelector("input[name=\"confirmPassword\"]")).sendKeys("password1");
	 }
	 
	 public void clickSubmitButton() {
			driver.findElement(By.cssSelector("input[name=\"register\"]")).click();

	 }
}

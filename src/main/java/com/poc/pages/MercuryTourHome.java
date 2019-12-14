package com.poc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.poc.webdriver.WebConnector;

public class MercuryTourHome  {
	WebDriver driver;
	
	 public MercuryTourHome(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	       this.driver=driver;
	 }
	 
	 public void clickRegister() throws InterruptedException {
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
	 }

}

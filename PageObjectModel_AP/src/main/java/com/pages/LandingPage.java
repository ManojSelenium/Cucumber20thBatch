package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.objrepo.LandingPageProperties;
import com.util.WebDriverUtils;


public class LandingPage extends WebDriverUtils implements LandingPageProperties{

	WebDriver driver; //Instance 

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public SigninPage clickSignin() {
		
		click(SIGNIN_LOCATOR);
		
		return new SigninPage(driver);
	}

	public void clickContactUs() {
		System.out.println("Contactus Element Clicked");
	}
}

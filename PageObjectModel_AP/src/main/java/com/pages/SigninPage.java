package com.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.objrepo.SigninPageProperties;
import com.util.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SigninPageProperties{

	WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void enterEmailAddress(String emailAddress) {
		enterText(EMAIlADDRESS_LOCATOR, emailAddress);
	}

	public CreateAccountPage clickCreateAccountButton() {
		click(CREATEACCOUNT_LOCATOR);
		return new CreateAccountPage(driver);
	}
}

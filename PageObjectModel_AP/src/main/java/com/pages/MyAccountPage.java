package com.pages;

import org.openqa.selenium.WebDriver;

import com.objrepo.MyAccountPageProperties;
import com.util.WebDriverUtils;

public class MyAccountPage extends WebDriverUtils implements MyAccountPageProperties {

	WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	public String getCustomerAccountName() {
		return getText(VIEW_MY_CUSTOMER_ACCOUNT);
	}
}

package com.pi1.sprint1.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dao.BeanFactory;
import com.dao.CreateUserBean;
import com.pages.CreateAccountPage;
import com.pages.LandingPage;
import com.pages.MyAccountPage;
import com.pages.SigninPage;
import com.util.TestBase;

public class S23456_Create_Account_Feature extends TestBase{
	WebDriver driver;
	
	@BeforeMethod
	public void beforeTestCase() {
		driver=initilizeDriver();
		System.out.println("Driver From TestCase ::: "+driver);
		enterURL(AUTOMATION_URL);
		
	}
	
	
	@Test
	public void testCase1() {
	
		LandingPage landingPage=new LandingPage(driver);
		
		SigninPage signinPage=landingPage.clickSignin();
		
		CreateUserBean createUserBean=new CreateUserBean();
		BeanFactory beanFactory=new BeanFactory();
		beanFactory.setDataForNewUser(createUserBean);
		
		
		signinPage.enterEmailAddress(createUserBean.getEmailAddress());
		
		CreateAccountPage createAccountPage=signinPage.clickCreateAccountButton();
		
		createAccountPage.createNewUser(createUserBean);
		
		MyAccountPage myAccountPage=createAccountPage.clickRegisterButton();
		Assert.assertEquals(myAccountPage.getCustomerAccountName(), createUserBean.getFirstName()+" "+createUserBean.getLastName());
	}

}

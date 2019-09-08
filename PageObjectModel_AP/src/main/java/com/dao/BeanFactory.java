package com.dao;

import org.apache.commons.lang3.RandomStringUtils;

public class BeanFactory {

	
	public void setDataForNewUser(CreateUserBean createUserBean) {
		
		createUserBean.setEmailAddress(RandomStringUtils.randomAlphabetic(5)+"@mailinator.com");
		createUserBean.setFirstName(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setLastName(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setPassword("Manoj@123");
		createUserBean.setAddress(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setCity(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setState("5");
		createUserBean.setPostalCode("11111");
		createUserBean.setPhoneNumber(RandomStringUtils.randomNumeric(10));
		createUserBean.setAlias(RandomStringUtils.randomAlphabetic(5));
	}
	
	public void editUserDataSetup(EditUserBean editUserBean) {
		editUserBean.setFirstName("Manoj");
	}
}

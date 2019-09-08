package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase implements Setup {

	WebDriver driver=null;
	
	public WebDriver initilizeDriver() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 System.out.println("Driver From TestBase :::: "+driver);
		 return driver;
	}
	
	
	public void enterURL(String url) {
		driver.get(url);
	}
	
}

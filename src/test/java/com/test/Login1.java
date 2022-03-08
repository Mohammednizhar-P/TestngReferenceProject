package com.test;

import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;
import pom.LoginPageLearn;

public class Login1 extends BaseClass{
	
	
public static void main(String[] args) {
	
	
	getBrowsers("chrome");
	getUrl("https://www.facebook.com/");
	
	LoginPageLearn l = new LoginPageLearn();
	
	PageFactory.initElements(driver,LoginPageLearn.class);
	
	sendKeys(l.username,"wertyuiop");
	
	sendKeys(l.pasword,"23456789");
	
	click(l.login);
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	

}

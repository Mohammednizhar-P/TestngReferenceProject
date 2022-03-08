package com.test;


import Baseclass.BaseClass;
import pom.LoginPage;

public class Login extends BaseClass {

	public static void main(String[] args) {


		getBrowsers("chrome");
		getUrl("https://www.facebook.com/");

		LoginPage log = new LoginPage(driver);	
		sendKeys(log.getUsername(),"nizhar");
		sendKeys(log.getPasword(),"23456789");
		click(log.getLogin());
		driver.quit();





























	}








}

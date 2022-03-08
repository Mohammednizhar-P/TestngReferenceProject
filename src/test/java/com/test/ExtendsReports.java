package com.test;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendsReports {
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentTest testcase;

	@BeforeSuite
	public  void browserlaunge() {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

		extent = new ExtentReports();
		htmlreporter = new ExtentHtmlReporter("Report.html");
		extent.attachReporter(htmlreporter);
		driver = new ChromeDriver();


		driver.manage().window().maximize();
	}

  @Test
	public void opengoogle() throws IOException {

		testcase=extent.createTest("verify google title");
		testcase.log(Status.INFO,"navigating to google");

		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		testcase.log(Status.INFO,"actual title:"+title);
		testcase.log(Status.INFO,"expected title"+"Google");
		testcase.log(Status.INFO, "verification of actual and expected title");

		if (title.equals("Google") ) {
         testcase.log(Status.PASS, " actual and expected title are equal");

		} else {
			
			testcase.log(Status.FAIL,"actual and expected test case are not equal");


		    TakesScreenshot screen =(TakesScreenshot) driver;  // full web page
		    
			File screenshotAs =  screen.getScreenshotAs(OutputType.FILE);
			
			File store = new File("google.png");
			
		     org.openqa.selenium.io.FileHandler.copy(screenshotAs, store);
		     testcase.addScreencastFromPath("google.png");
		}

	}

	@Test
	public void openwikipidia() throws IOException {
		testcase=extent.createTest("verify wikipidea title");
		testcase.log(Status.INFO, "navigating to wikipidia");
		driver.get("https://www.wikipedia.org/");
		String title = driver.getTitle();
		System.out.println(title);
		testcase.log(Status.INFO,"actual title:"+title);
		testcase.log(Status.INFO,"expected title"+"Wikipidia");
		testcase.log(Status.INFO, "verification of actual and expected title");

		if (title.equals("wikipedia")) {
			 testcase.log(Status.PASS, " actual and expected title are equal");

			
		} else {
			testcase.log(Status.FAIL,"actual and expected test case are not equal");
			

		    TakesScreenshot screen =(TakesScreenshot) driver;  // full web page
		    
			File screenshotAs =  screen.getScreenshotAs(OutputType.FILE);
			
			File store = new File("wiki.png");
			
		     org.openqa.selenium.io.FileHandler.copy(screenshotAs, store);
		      testcase.addScreenCaptureFromPath("wiki.png");
		
		}
	}
	
	
	
		@AfterSuite
		public void closebrowser() {


			driver.quit();
            extent.flush();
		}





	}































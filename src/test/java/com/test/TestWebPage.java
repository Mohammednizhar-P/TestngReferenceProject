package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestWebPage {
	public ExtentTest createTest;
	public	WebDriver driver;
	public ExtentSparkReporter report;
	public ExtentReports extent;


	@BeforeSuite
	public void setup() {



		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.get("http://automationpractice.com/index.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		report = new ExtentSparkReporter("./Report/bug.html");

		extent = new ExtentReports();
		extent.attachReporter(report);
	}
	@BeforeTest
	public void runas() {
		createTest = extent.createTest("Tc-001");
		createTest.assignAuthor("nizhar");
		createTest.assignCategory("sanity");

	}


	@Test
	public void searchmobile() {

		WebElement search = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		search.sendKeys("mobile");

		WebElement click = driver.findElement(By.xpath("//button[@name='submit_search']"));
		click.click();
		
	   WebElement  screen = driver.findElement(By.xpath("//img[@class='logo img-responsive']"));

//		if (screen.isDisplayed()) {
//
//			createTest.pass("it is pass",MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());
//			createTest.pass("kfchwuilhurigv");
//		} else {
//			
//			createTest.fail("it is fail",MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());
//			
//		}



	} 




	@AfterSuite
	public void closebrowser() {
		extent.flush();
		driver.quit();

	} 










































}

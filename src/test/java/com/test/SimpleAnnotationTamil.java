package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotationTamil {

	WebDriver driver;
	@BeforeSuite
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();



	}
	@BeforeTest
	public void browserLaunge() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@BeforeClass
	public void url() {

		driver.get("https://www.myntra.com/");


	}
	@BeforeMethod
	public void verifyHomepage() {

		String title = driver.getTitle();
		System.out.println(title);



	}
	@Test
	public void searchTshirt() throws InterruptedException, AWTException {
		WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		mobile.sendKeys("tshirt");
		WebElement findElement = driver.findElement(By.xpath("//a[@class='desktop-submit']"));
		findElement.click();



	}
	@Test
	public void searchLaptop() throws InterruptedException, AWTException {

		WebElement mobile = driver.findElement(By.xpath("//div[@class='desktop-query']/child::input"));
		mobile.sendKeys("laptop");
		Thread.sleep(4000);
		WebElement click = driver.findElement(By.xpath("//a[@class='desktop-submit']"));
		click.click();




	}

	@AfterMethod
	public  void screenshot() throws IOException {

		TakesScreenshot ta = (TakesScreenshot) driver;
		File screenshotAs = ta.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\bug.png");
		FileUtils.copyFile(screenshotAs, file);




	}
	@AfterClass
	public  void referesh() {

		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());

	}
	@AfterTest
	public  void deleteCookies() {

		driver.manage().deleteAllCookies();

	}
	@AfterSuite
	public void closeBrowser() {

		driver.quit();

	}








}

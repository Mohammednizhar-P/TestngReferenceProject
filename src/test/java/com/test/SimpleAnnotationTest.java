package com.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SimpleAnnotationTest {
	public WebDriver driver;

	@BeforeSuite
	public  void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Drivers\\chromedriver.exe");


	}
	@BeforeTest
	public void browserLaunge() {
		
		driver = new ChromeDriver();
       driver.manage().window().maximize();


	}
	@BeforeClass
	public  void url() {
		driver.get("https://demo.nopcommerce.com/");
	}
		
	@BeforeMethod
	public void clickComputer() {
		
		WebElement click = driver.findElement(By.xpath("(//div[@class='header-menu']/ul/li/a[.='Computers '])[1]"));
		click.click();
		

	}
	@org.testng.annotations.Test
	public void clickElectronis() {
			WebElement click = driver.findElement(By.xpath("(//a[.='Electronics '])[1]"));
			click.click();
	}
	@org.testng.annotations.Test
	public void clickApparel() {
		
		WebElement click = driver.findElement(By.xpath("(//a[.='Apparel '])[1]"));
		click.click();

	}
	@AfterMethod
	public void clickDigitalDownload() {
		WebElement click = driver.findElement(By.xpath("(//a[.='Digital downloads '])[1]"));
		click.click();
		

	}
	
	
	@AfterClass
	private void clickBooks() {
		
		WebElement findElement = driver.findElement(By.xpath("(//a[.='Books '])[1]"));
		findElement.click();

	}
	@AfterTest
	public void deleteAllcookies() {
		
    driver.manage().deleteAllCookies();
	}
	@AfterSuite
	public void closebrowser() {
		
		driver.quit();
		

	}

}










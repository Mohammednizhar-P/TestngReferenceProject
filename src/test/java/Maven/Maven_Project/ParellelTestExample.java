package Maven.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ParellelTestExample {




	@Test
	public void  amazon() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver	driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");


	}


	@Test
	public void amazon1() {

		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");

		WebDriver	driver = new InternetExplorerDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipcart.com/");




	}


	}
























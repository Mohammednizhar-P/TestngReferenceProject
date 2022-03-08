package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	public static WebDriver driver;

	@BeforeSuite
	public void browser() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
	}
	@Test
	public void click() {

		WebElement click = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[1]"));
		click.click();

	}
	@Ignore
	@Test                        // it will execute alaphaphetical order
	public void email() {

		WebElement send = driver.findElement(By.id("email"));
		send.sendKeys("email");

	}
	
	@Test(enabled=false)
	public void send() {

		WebElement append = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		append.sendKeys("nizhar");

	}
	@Test
	public void text() throws InterruptedException {
		
		WebElement gettext = driver.findElement(By.xpath("(//input[@name='username'])[1]"));
		String text = gettext.getText();
		System.out.println(text);
		Thread.sleep(3000);

	}
	@AfterSuite
	public void quit() {
		
		driver.quit();

	}
	



}

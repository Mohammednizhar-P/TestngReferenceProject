package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demowesite1 {
	
	
	public static WebDriver driver;
	 

	@BeforeSuite(groups = "launge")
	public void setup() {

		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		driver= new FirefoxDriver();


		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	 



	}
	@BeforeTest 
	public  void url() {

		driver.get("http://testautomationpractice.blogspot.com/");

	}

	@Test 
	public void SearchWikipidia() {

		WebElement searchBooks = driver.findElement(By.xpath("//input[@class='wikipedia-search-input']"));
		searchBooks.sendKeys("jk rowling");
		WebElement clickSearchButton = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		clickSearchButton.click();

	}
	@Test  
	public void Alert() {

		WebElement clickAleBtn = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		clickAleBtn.click();

		driver.switchTo().alert().accept();

	}
	@Test 
	public void datepic() {

		WebElement picDate = driver.findElement(By.id("datepicker"));
		picDate.click();
		WebElement date = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[23]"));
		date.click();

	}
	@Test 
	public void select() {

		WebElement selectSpeed = driver.findElement(By.id("speed"));

		Select se = new Select(selectSpeed);
		se.selectByIndex(4);
		se.selectByVisibleText("Medium");

	}
	@Test 
	public  void getLaples() {
		WebElement isDisplayed = driver.findElement(By.xpath("(//span[@style='font-family: Georgia, serif;'])[5]"));
		System.out.println(isDisplayed .isDisplayed());
		System.out.println(isDisplayed.getText());



	}

	@Test 
	public void signUp() throws InterruptedException {
		driver.switchTo().frame(0);
		WebElement firstName = driver.findElement(By.id("RESULT_TextField-1"));
		firstName.sendKeys("mohammed");
		WebElement lastName = driver.findElement(By.id("RESULT_TextField-2"));
		lastName.sendKeys("nizhar");
		WebElement phone = driver.findElement(By.id("RESULT_TextField-3"));
		phone.sendKeys("456789");
		WebElement country = driver.findElement(By.id("RESULT_TextField-4"));
		country.sendKeys("india");
		WebElement city = driver.findElement(By.id("RESULT_TextField-5"));
		city.sendKeys("thanjavur");
		WebElement email = driver.findElement(By.id("RESULT_TextField-6"));
		email.sendKeys("nizharece9626@gmailcom");
		WebElement male = driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
		male.click();
		WebElement days = driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_5']"));
		days.click();
		WebElement select4 = driver.findElement(By.id("RESULT_RadioButton-9"));
		Select n = new Select(select4);
		Thread.sleep(3000);
		n.selectByIndex(1);



	}
	@Test 
	public void drag() throws InterruptedException {

		Actions a = new Actions(driver);

		WebElement dra = driver.findElement(By.id("draggable"));
		WebElement dro = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		a.clickAndHold(dra).moveToElement(dro).build().perform();
		Thread.sleep(3000);
		WebElement doubleclick = driver.findElement(By.xpath("//button[.='Copy Text']"));
		Thread.sleep(3000);
		a.doubleClick(doubleclick);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();

	}
	@Test
	public void age() {

		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("28");

	}




	@AfterSuite 
	public void closeBrowser() {
		driver.quit();

	}	

	
	
	
	
	
	
	
	
	
	

}

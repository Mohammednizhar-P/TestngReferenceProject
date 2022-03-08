package Maven.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	public static WebDriver driver;

	@BeforeMethod
	private void launge() {


		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@Test(dataProvider="LoginData")
	public void login(String username ,String password) {


		WebElement sendemail = driver.findElement(By.id("email"));
		sendemail.sendKeys(username);

		WebElement sendpass = driver.findElement(By.id("pass"));
		sendpass.sendKeys(password);

		WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
		click.click();

	}

	@DataProvider
	public Object[][] LoginData() {

		return new Object [] [] {
			{"i","567"},
			{"love","457"},
			{"you","489"},


		};

	}

	@AfterMethod
	public  void closebrowser() {

		driver.quit();

	}























}

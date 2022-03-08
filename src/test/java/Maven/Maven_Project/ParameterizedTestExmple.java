 package Maven.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestExmple {
	
	public static WebDriver driver;
	
	@Parameters({"username","password"})
	@Test
	public void login(@Optional("kumar")String username,String password) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement sendemail = driver.findElement(By.id("email"));
		sendemail.sendKeys(username);
		
		WebElement sendpass = driver.findElement(By.id("pass"));
		sendpass.sendKeys(password);
		
		WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
		click.click();
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

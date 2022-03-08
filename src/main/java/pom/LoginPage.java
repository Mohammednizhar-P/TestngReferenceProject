package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
      WebDriver driver1;

	@FindBy(name ="email")
	private WebElement username ;

	@FindBy(id ="pass")
	private WebElement pasword;

	@FindBy(xpath ="//button[@name='login']")
	private WebElement login;



	public LoginPage(WebDriver driver) {
		this.driver1=driver;
		PageFactory.initElements(driver,this);
		
	}


	public WebElement getUsername() {
		return username;
	}
	public WebElement getPasword() {
		return pasword;
	}
	public WebElement getLogin() {
		return login;
	}




















}

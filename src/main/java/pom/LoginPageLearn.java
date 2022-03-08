package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLearn {
	

	@FindBy(name ="email")
	public static  WebElement username ;

	@FindBy(id ="pass")
	public static  WebElement pasword;

	@FindBy(xpath ="//button[@name='login']")
	public static WebElement login;


	
	
	
	
	
	
	
	
	
	
	
	

}

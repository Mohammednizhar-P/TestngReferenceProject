package Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static  WebDriver getBrowsers(String browsers) {

		try {
			if (browsers.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));
				driver = new ChromeDriver();


			}else if (browsers.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+("\\Drivers\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();

			}else if (browsers.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+("\\Drivers\\geckodriver.exe"));
				driver = new FirefoxDriver();

			}else if (browsers.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+("\\Drivers\\msedgedriver.exe"));
				driver = new EdgeDriver();

			}else {
				System.out.println("oops! invalid browser");
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catched");

		}

		return driver;
	}

	public static void getUrl(String url) {

		driver.get(url);

	}

	public static void naviNextUrl(String url) {

		driver.navigate().to(url);

	}

	public static void back() {

		driver.navigate().back();

	}
	public static void refresh() {
		driver.navigate().refresh();

	}


	public static void forward() {

		driver.navigate().forward();

	}

	public static void close() {

		driver.close();

	}

	public static  void quit() {

		driver.quit();

	}

	public static String getCurrentUrl() {

		return	driver.getCurrentUrl();
	}
	public static String getTitle() {

		return	driver.getTitle();

	}

	public static String getPageSource() {

		return driver.getPageSource();

	}
	// web element methods
	public static  boolean isEnabled(WebElement element) {

		return	element.isEnabled();

	}

	public static  boolean isDisplayed(WebElement element) {

		return	element.isDisplayed();

	}
	public static boolean isSelected(WebElement element) {

		return element.isSelected();
	}

	public static void click(WebElement element) {
		element.click();
	}
	public static void clear (WebElement element) {
		element.clear();
	}

	public static void sendKeys(WebElement element,String value) {

		element.sendKeys(value);

	}
	public static String getText(WebElement element) {

		return element.getText();

	}
	public static Dimension getSize(WebElement element) {
		return	element.getSize();
	}
	public static String getTageName(WebElement element) {
		return element.getTagName();
	}
	public static String getAttribute(WebElement element,String value) {
		return element.getAttribute(value);
	}

	//takesscreenshot

	public static void screenShot(String pathname) throws IOException {

		TakesScreenshot take = (TakesScreenshot) driver;

		File captured = take.getScreenshotAs(OutputType.FILE);

		File stored = new File(pathname);

		FileHandler.copy(captured, stored);
		FileUtils.copyFile(captured, stored);

	}

	// take screen shot of particular element

	public static void elementScreenShot(WebElement element ,String pathname) throws IOException {

		TakesScreenshot take = (TakesScreenshot) driver;

		File captured = element.getScreenshotAs(OutputType.FILE);

		File stored = new File(pathname);

		FileHandler.copy(captured, stored);
		FileUtils.copyFile(captured, stored);

	}








	public static  void select(WebElement element,String options ,String value) {

		try {
			Select select = new Select(element);

			if (options.equalsIgnoreCase("byindex")) {
				int parseInt = Integer.parseInt(value);
				select.selectByIndex(parseInt);
			}else if (options.equalsIgnoreCase("byvalue")) {
				select.selectByValue(value);
			}else if (options.equalsIgnoreCase("byvisibletext")) {
				select.selectByVisibleText(value);
			}else {
				System.out.println("oops!unable to select");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}



	}
	public static  void simpleAlert() {

		driver.switchTo().alert().accept();

	}
	public static  void confirmAlert(String ok ,String cancel) {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		}else if (cancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();

		}else {
			System.out.println("sorry!unable switch");
		}
	}  



	public static  void promptAlert(String value ,String ok,String cancel) {

		try {
			if (ok.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().sendKeys(value);
				driver.switchTo().alert().accept();
			} else if (cancel.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().sendKeys(value);
				driver.switchTo().alert().dismiss();
			} else {
				System.err.println("sorry!unable to switch");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}   


	// actions
	public static void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
	}
	public static void moveToElement(WebElement element) {

		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();

	}
	public static void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();

	}

	public static void actionClick() {

		Actions action = new Actions(driver);
		action.click().build().perform();
	}

	public static void dragAndDrop(WebElement element,WebElement element1) {
		Actions action = new Actions(driver);
		action.dragAndDrop(element, element1).build().perform();
	}

	public static void robotClass() throws AWTException, InterruptedException {

		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);

		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}



	public static  void scroll(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

     public static void scrollAtHeight() throws InterruptedException {
    	 
    	 try {
			JavascriptExecutor scroll = (JavascriptExecutor) driver;

			 scroll.executeScript("window.scroll(0,1000)", ""); 
			 scroll.executeScript("window.scroll(0,-1000)", "");
			 scroll.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
			 scroll.executeScript("window.scrollTo(0,0)","");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}





	public static  void frame(String options ,String value,WebElement frameelement) {

		try {
			if (options.equalsIgnoreCase("intindex")) {
				int parseInt = Integer.parseInt(value);
				driver.switchTo().frame( parseInt);

			}else if (options.equalsIgnoreCase("stringnameorid")) {
				driver.switchTo().frame(value);
			}else if (options.equalsIgnoreCase("webelementframeelement")) {
				driver.switchTo().frame(frameelement);
			}else {
				System.out.println("sorry! unable to switch frame");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}


	}
	public static void windowHandles() {

		try {
			Set<String> windowHandles = driver.getWindowHandles();

			for (String string : windowHandles) {

				String title = driver.switchTo().window(string).getTitle();
				System.out.println(title);


			}
		} catch (Exception e) {
			System.out.println("no such window exception");
			e.printStackTrace();
		}

     

	}
	public static WebElement findElement ( String options,String value) {
		
		
		try {
			if (options.equalsIgnoreCase("stringid")) {
				driver.findElement(ById.id(value));
				
			}else if (options.equalsIgnoreCase("stringname")) {
			return	driver.findElement(By.name(value));
				
			}else if (options.equalsIgnoreCase("stringxpathexpression")) {
			return	driver.findElement(By.xpath(value));
				
			}else if (options.equalsIgnoreCase("stringcssselector")) {
				return driver.findElement(By.cssSelector(value));
				
			}else if (options.equalsIgnoreCase("stringlinktext")) {
			return	driver.findElement(By.linkText(value));
				
			}else if (options.equalsIgnoreCase("partialllinktext")) {
			return	driver.findElement(By.partialLinkText(value));
			}else {
				System.out.println("sorry!cannot by element by locators");
			}
		} catch (Exception e) {
			System.out.println("no such element exception");
			e.printStackTrace();
		}
		
		return null;
		
	}
}


















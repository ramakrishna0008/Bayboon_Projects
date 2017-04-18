package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;
import org.testng.annotations.BeforeSuite;

import utilities.MyTestNGListener;
import utilities.XML_Reader;

public class BaseClass extends MyTestNGListener {

	public static WebDriver driver;
	public String browser = null;
	public String auth = null;
	public String URL = null;
	public String envi = null;
	//import  code
	@BeforeSuite
	public void setUp(Object webdriver) throws Exception{
		/*auth = getauthentication();
		System.out.println("Authentication is via " + auth);*/
		
		/*browser = getbrowser();
		System.out.println("Browser under test is "+browser);
		*/
	
		/*envi = getenvironment();
		System.out.println("Environment is "+envi);*/
		
		//URL = XML_Reader.getURL(auth,"URL");
		
		switch (browser) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximised");
			System.setProperty("webdriver.chrome.driver","F:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.get(URL);
			break;
		case "firefox":
			System.setProperty("webdriver.firefox.driver","F:\\SELENIUM\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URL);
			break;
			
		default:
			break;
		}
		
	}

	
	
}

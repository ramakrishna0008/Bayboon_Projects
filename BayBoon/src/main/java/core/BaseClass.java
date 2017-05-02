package core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import utilities.MyTestNGListener;
import utilities.XML_Reader;

public class BaseClass extends MyTestNGListener {

	public static WebDriver driver;
	public String browser = null;
	public String auth = null;
	public String URL = null;
	public String envi = null;

	public static String BASE_URL = "E:\\seleinium_software\\software\\";
	//public static String BASE_URL = "E:\\seleinium_software\\software\\geckodriver.exe";
	//import  code\
	
	//public static String BaseUrl = "F:\\SELENIUM\\Softwares\\";
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

			System.setProperty("webdriver.chrome.driver",BASE_URL+"chromedriver.exe");

			

			driver = new ChromeDriver(options);
			driver.get(URL);
			break;
		case "firefox":

			System.setProperty("webdriver.firefox.driver",BASE_URL+"geckodriver.exe");

			

			driver = new FirefoxDriver();
			driver.get(URL);
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver",BaseUrl+"path");
			driver = new InternetExplorerDriver();
			driver.get(URL);
			break;
			
		default:
			System.out.println(browser+"Browser is not supported yet");
			break;
		}
		//click_Sign();
		
	}
	@AfterSuite
	public void teardown(){
		By logout = By.id("logout");
		try {
			driver.findElement(logout).click();
			driver.quit();
		} catch (Exception e) {
			driver.quit();
			
		}
		
	}

	public static String getBrowser() throws IOException{
		File input = new File("F:\\Github\\Bayboon_Projects\\BayBoon\\src\\test\\resources\\AppConfig");
		//File input = new File(BaseUrl+"AppConfig.properties");
		
		FileInputStream fis = new FileInputStream(input);
		Properties prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser").toString();
		return browser;
		
	}
	public static String getEnvironment() throws IOException{
		File input = new File("F:\\Github\\Bayboon_Projects\\BayBoon\\src\\test\\resources\\AppConfig.properties");
		FileInputStream fis = new FileInputStream(input);
		Properties prop = new Properties();
		prop.load(fis);
		String environment = prop.getProperty("environment").toString();
		return environment;
		
	}
	public static String getURL() throws IOException{
		File input = new File("F:\\Github\\Bayboon_Projects\\BayBoon\\src\\test\\resources\\AppConfig.properties");
		FileInputStream fis = new FileInputStream(input);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("BaseURL").toString();
		return URL;
		
	}
	public static String getAuthentication() throws IOException{
		File input = new File("F:\\Github\\Bayboon_Projects\\BayBoon\\src\\test\\resources\\AppConfig.properties");
		FileInputStream fis = new FileInputStream(input);
		Properties prop = new Properties();
		prop.load(fis);
		String auth = prop.getProperty("auth").toString();
		return auth;
		
	}
	public void click_Signin(){
		By btnSignIn = By.linkText("SignIn");
		if(auth.equalsIgnoreCase("QA"))
			driver.findElement(btnSignIn).click();
	}
	
	public static void waitForVisibility(By WebElement, int time){
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(WebElement));
	}
}

package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;
import org.testng.annotations.BeforeSuite;

import utilities.MyTestNGListener;

public class BaseClass extends MyTestNGListener {

	public static WebDriver driver;
	public String browser = null;
	public String auth = null;
	public String URL = null;
	public String envi = null;
	//import  code
	@BeforeSuite
	public void setUp() throws Exception{
		/*auth = getauthentication();
		System.out.println("Authentication is via " + auth);*/
		
	
	}
	
}

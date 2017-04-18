package core;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class Browser {

public static String firstwindow = BaseClass.driver.getWindowHandle();
	
public static void First() throws Exception
{
	Thread.sleep(3000);
	BaseClass.driver.switchTo().window(firstwindow);
	
}
public static void Last() throws Exception
{
	Set<String>Allwindows = null;
	for(int i=1; i<=10; i++);
	{
		Allwindows = BaseClass.driver.getWindowHandles();
		if(Allwindows.size()>=1)
		{
			//break;
		
		}
		else
			Thread.sleep(3000);
		//Set<String> Allwindows = BaseClass.driver.getWindowHandles();
		for(String winname : Allwindows)
		{
			BaseClass.driver.switchTo().window(winname);
			break;
		
	}
			
		}
	}
	public static void close()
	{
		BaseClass.driver.close();
		
	}
	public static void back()
	{
		BaseClass.driver.navigate().back();
	}
}



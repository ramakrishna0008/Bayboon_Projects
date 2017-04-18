package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConsumerSignin {
	static WebDriver driver;
	//public static void main(String[] args) {
	public void signIn(){
		try{
				
		System.setProperty("webdriver.gecko.driver", "F:\\SELENIUM\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.bayboon.com/consumer/");
		driver.manage().window().maximize();
		driver.findElement(By.id("signin-width")).click();
		
		
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("ramakrishna0008@gmail.com");
		driver.findElement(By.id("passwords")).clear();
		driver.findElement(By.id("passwords")).sendKeys("group123");
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("id('home')/x:form/x:div[3]/x:div/x:div/x:button")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		} catch (Exception e) {
		
		e.printStackTrace();
		}
	}
}

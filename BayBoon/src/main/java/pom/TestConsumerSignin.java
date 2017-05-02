package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestConsumerSignin {
	static WebDriver driver;
	public static String BaseUrl = "F:\\SELENIUM\\Softwares\\";
	public static void main(String[] args) {
	//public void signIn(){
		try{
				
		System.setProperty("webdriver.gecko.driver",BaseUrl+ "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://test.groupzeal.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("signin-width")).click();
		driver.findElement(By.xpath("//*[@id='signin-width']"));
		Thread.sleep(3000);
		
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("groupzeal11@gmail.com");
		driver.findElement(By.id("passwords")).clear();
		driver.findElement(By.id("passwords")).sendKeys("group123");
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("id('home')/x:form/x:div[3]/x:div/x:div/x:button")).click();
		driver.findElement(By.xpath("(//*[@id='home']/form/div[3]/div/div/button")).click();
		} catch (Exception e) {
		
		e.printStackTrace();
		}
	}
}

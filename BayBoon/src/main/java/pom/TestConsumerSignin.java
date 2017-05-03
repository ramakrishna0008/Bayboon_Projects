package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestConsumerSignin {
	static WebDriver driver;
	public static String BASE_URL = "E:\\seleinium_software\\software\\";
	//public static void main(String[] args) {
	public void signIn(){
		try{
				
		System.setProperty("webdriver.gecko.driver",BASE_URL+ "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://test.groupzeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("signin-width")).click();
		
		Thread.sleep(3000);
		
		System.out.println("clicked on Signin/SignUp link");
		driver.findElement(By.xpath("//*[@id='userName']")).click();
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("groupzeal11@gmail.com");
		/*driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("groupzeal11@gmail.com");*/
		System.out.println("entered Username");
		driver.findElement(By.xpath("//*[@id='passwords']")).click();
		driver.findElement(By.xpath("//*[@id='passwords']")).sendKeys("group123");
		/*driver.findElement(By.id("passwords")).clear();
		driver.findElement(By.id("passwords")).sendKeys("group123");*/
		System.out.println("entered Password");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("id('home')/x:form/x:div[3]/x:div/x:div/x:button")).click();
		driver.findElement(By.xpath("(//*[@id='home']/form/div[3]/div/div/button")).click();
		System.out.println("clicked on Signin button");
		} catch (Exception e) {
		
		e.printStackTrace();
		}
	}
}
